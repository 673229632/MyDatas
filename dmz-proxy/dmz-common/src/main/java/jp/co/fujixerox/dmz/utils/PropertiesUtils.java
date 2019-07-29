package jp.co.fujixerox.dmz.utils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * we use this tool to get properties file
 * 
 * @author xuting
 * @param propertyName
 * @return Properties
 */
public class PropertiesUtils {
	private static final String PROPERTIES_FILE = "asgi-ext.properties";
    private static Properties p = null;
	/**
	 * read Property file
	 * 
	 * @param propertyName
	 * @return Properties
	 */
	public static Properties getPropertys(){
		if (p != null) {
			return p;
		}
		
		p = new Properties();
		InputStreamReader is = null; 
		try {
			is = new InputStreamReader(PropertiesUtils.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE),"UTF-8");
			p.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//close resource
            if (is != null) {  
                try {  
                    is.close();  
                } catch (IOException e) {  
                }  
            }
		}
		return p;
	}
}
