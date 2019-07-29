package jp.co.fujixerox.dmz.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import jp.co.fujixerox.dmz.bean.TrustedSiteBean;

public class XmlUtils {
	public static final String X_PATH = Thread.currentThread().getContextClassLoader().getResource("TrustedSites.xml").getPath();

	/**
	 * read DomainMapping.xml by Dom4j
	 * 
	 * @throws Exception
	 */
	public static Map<String, String> readResources() throws Exception {
		Map<String, String> domainMap = new HashMap<>();
		InputStreamReader is = null;
		try {
			is = new InputStreamReader(XmlUtils.class.getClassLoader().getResourceAsStream("DomainMapping.xml"),
					"UTF-8");
			SAXReader reader = new SAXReader();
			Document doc = reader.read(is);
			Element root = doc.getRootElement();
			Element foo;
			for (Iterator<?> i = root.elementIterator("requestMapping"); i.hasNext();) {
				foo = (Element) i.next();
				String ip = foo.elementText("ip");
				String port = foo.elementText("port");
				String protocol = foo.elementText("protocol");
				String domain = foo.attributeValue("name");
				domainMap.put(domain, protocol + "://" + ip + ":" + port);
			}
		} catch (IOException e) {
			throw e;
		} finally {
			// close resource
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}
		return domainMap;
	}

	/**
	 * read TrustedSites.xml by Dom4j
	 * 
	 * @return
	 * @throws Exception
	 */
	public static Map<String, TrustedSiteBean> readTrustedSites() {
		InputStreamReader is = null;
		Map<String, TrustedSiteBean> trustedMap = new HashMap<>();
		try {
			is = new InputStreamReader(XmlUtils.class.getClassLoader().getResourceAsStream("TrustedSites.xml"),
					"UTF-8");
			SAXReader reader = new SAXReader();
			Document doc = reader.read(is);
			Element root = doc.getRootElement();
			Element foo;
			String host = null;
			String ports = null;
			for (Iterator<?> i = root.elementIterator("item"); i.hasNext();) {

				foo = (Element) i.next();

				host = foo.element("host").getTextTrim();

				List<String> portList = new ArrayList<>();
				if (null != foo.element("port")) {
					ports = foo.element("port").getTextTrim();
					portList.addAll(Arrays.asList(ports.split(",")));
				}

				trustedMap.put(host.toUpperCase(), new TrustedSiteBean(host, portList));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close resource
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}
		return trustedMap;
	}
	
    /** 
     * 得到XML文档 
     *  
     * @param xmlFile 
     *            文件名（路径） 
     * @return XML文档对象 
     * @throws MalformedURLException 
     * @throws DocumentException 
     */  
    public static Document getDocument() throws MalformedURLException {  
        SAXReader reader = new SAXReader();  
        File file = new File(X_PATH); 
        System.out.println(X_PATH);
        try {  
            if (!file.exists()) {  
                return null;  
            } else {  
                return reader.read(file);  
            }  
        } catch (DocumentException e) {  
            throw new RuntimeException(e + "->指定文件【" + X_PATH + "】读取错误");  
        }  
    }  
  
    public static String getText(Element element) {  
        try {  
            return element.getTextTrim();  
        } catch (Exception e) {  
            throw new RuntimeException(e + "->指定【" + element.getName() + "】节点读取错误");  
        }  
  
    }  
  
    /** 
     * 增加xml文件节点 
     *  
     * @param document 
     *            xml文档 
     * @param elementName 
     *            要增加的元素名称 
     * @param attributeNames 
     *            要增加的元素属性 
     * @param attributeValues 
     *            要增加的元素属性值 
     */  
    public static Document addElementByName(Document document, String host, String port) {  
        try {  
            Element root = document.getRootElement();  
            Element subElement = root.addElement("item"); 
            Element newHostElement = subElement.addElement("host");
            newHostElement.addText(host);
            if(port!=null&&port!=""){
            	Element newPortElement = subElement.addElement("port");
                newPortElement.addText(port);
            }
        } catch (Exception e) {  
            throw new RuntimeException(e + "->指定的【item 】节点增加出现错误");  
        }  
        return document;  
    }  
   
    @SuppressWarnings("rawtypes")
    public static Document updateDocument(Document document,String flag,String host, String port) {  
	    Element root=document.getRootElement();//��ȡ���ڵ�
	    List list = root.elements();
        for (int i = 0; i < list.size(); i++) {
        	 Element book = (Element) list.get(i);
        	 List ll = book.elements();
        	 Element element = (Element) ll.get(0);
        	 if(element.getText().equals(flag)){
        		 if ("host".equals(element.getName())) {
            		 element.setText(host);
            	 }
            	 if(ll.size()==1 &&port !=null && port!=""){
            		 Element newPortElement =  book.addElement("port");
            		 newPortElement.setText(port);
            		 
            	 }
            	 if (ll.size()==2 && "port".equals(((Element) ll.get(1)).getName())) {
            		 ((Element) ll.get(1)).setText(port);
            	 }
        		 
        	 }

        }
        return document;  
    }  
    /** 
     * 输出xml文件 
     *  
     * @param document 
     * @param filePath 
     * @throws IOException 
     */  
    public static void writeXml(Document document) throws IOException {  
        File xmlFile = new File(X_PATH);  
        XMLWriter writer = null;  
        try {  
            if (xmlFile.exists())  
                xmlFile.delete();  
            writer = new XMLWriter(new FileOutputStream(X_PATH), OutputFormat.createPrettyPrint());  
            writer.write(document);  
            writer.close();  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if (writer != null)  
                writer.close();  
        }  
    }  
  
    /**
     * 获得xml配置文件的数据
     *  
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static List getData(Document document){  
	    List allEle  = new ArrayList();
		Element root=document.getRootElement();
		List list = root.elements();
		for (int i = 0; i < list.size(); i++) {
			 Element book = (Element) list.get(i);
			 List ll = book.elements();
			 Map map = new HashMap();
			 for (int j = 0; j < ll.size(); j++) {
		         Element element = (Element) ll.get(j);
		         if ("host".equals(element.getName())) {
		             String host = element.getText();
		             map.put("host", host);
		         }
		         if ("port".equals(element.getName())) {
		             String port = element.getText();
		             map.put("port", port);
		         }
			 }
			 allEle.add(map);
		} 
		return allEle;
    }  
    /** 
     *    删除属性等于某个值的元素 
     * @throws Exception 
     */  
    @SuppressWarnings("unchecked")  
    public static void  deleteElementByAttribute(String host) throws IOException {  
    	File xmlFile=new File(X_PATH);
		SAXReader sax=new SAXReader();
		try {
			Document document = sax.read(xmlFile);
			Element root = document.getRootElement();  
	        Iterator<Object> iterator = root.elementIterator("item");  
	        while (iterator.hasNext()) {  
	            Element element = (Element) iterator.next(); 
	            if (element.elementText("host").equals(host)) {  
	                root.remove(element);  
	                document.setRootElement(root);  
	                XmlUtils.writeXml(document);
	                break;  
	            }  
	        }  
		} catch (DocumentException e) {
			e.printStackTrace();
		} 
    }  
    
    public static Boolean  compareHost(List allEle, String host){
    	Boolean flag = false;
    	for (int i = 0; i < allEle.size(); i++) {
			Map map = (Map) allEle.get(i);
			String XMLHost = (String) map.get("host");
			if(XMLHost.equals(host)){
				flag = true;
				return flag;
			}
		}
    	return flag;
    }
}
