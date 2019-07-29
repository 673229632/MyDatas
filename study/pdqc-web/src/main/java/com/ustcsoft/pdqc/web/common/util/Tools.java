package com.ustcsoft.pdqc.web.common.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import com.ustcsoft.marsfw.spring.util.ConfigUtil;

@SuppressWarnings("all")
public class Tools {
    private static Logger logger = LoggerFactory.getLogger(Tools.class);
    
    /**
     * 
     * 判断字符串是否为空.
     * 
     * @param param
     * @return true 空
     * @since 2015年9月4日 下午6:44:44
     * @author
     * @return
     */
    public static boolean isblank(Object param) {
        if (null == param || "".equals(param.toString().trim())) {
            return true;
        }
        return false;
    }
    
    /**
     * 
     * 去除患者姓名标记
     */
    public static String cutnameflag(String name) {
        if (!isblank(name)) {
            return name.replaceAll("(\\(.*?\\))?", "");
        }
        return "";
    }
    
    /**
     * 将String转换为BigDecimal返回给用户.
     * @param param 数字型
     * @return BigDecimal 结果
     */
    public static BigDecimal getBigDecimalFromStr(String param) {
        if (null == param || "".equals(param.trim())) {
            return null;
        }
        BigDecimal bb;
        try {
            bb = new BigDecimal(param.trim());
        } catch (Exception e) {
            return null;
        }
        return bb;
    }
    
    /**
     * 保留n位小数,默认保留2位.
     * @param param 数字型
     * @return String 结果
     */
    public static String getStringFromBigDecimal(BigDecimal param, int num) {
        if (null == param) {
            return "";
        }
        return param.setScale(num, BigDecimal.ROUND_HALF_UP).toString();
    }
    
    /**
     * 保留n位小数,默认保留2位.
     * @param param 数字型
     * @return BigDecimal 结果
     */
    public static BigDecimal getBigDecimalFromBigDecimal(BigDecimal param, int num) {
        if (null == param) {
            return new BigDecimal(0);
        }
        return param.setScale(num, BigDecimal.ROUND_HALF_UP);
    }
    
    /**
     * 如果整数为空则返回零
     * @param param
     * @return
     */
    public static Integer getIntegerFromInteger(Integer param) {
        if (null == param) {
            return new Integer(getNineNumber());
        }
        return param;
    }
    
    /**
     * 将String转换为Short返回给用户.
     * @param param 数字型
     * @return BigDecimal 结果
     */
    public static Short getShortFromStr(String param) {
        if (null == param || "".equals(param.trim())) {
            return null;
        }
        return new Short(param.trim());
    }
    
    /**
     * 保留一位小数.
     * @param value 数字型
     * @return String 结果
     */
    public static String getFormatDoubleValue(Double value) {
        if (value == null) {
            return null;
        }
        
        DecimalFormat df = new DecimalFormat("######0.0");
        return df.format(value);
    }
    
    /**
     * 将Short转换为String返回给用户.
     * @param param 数字型
     * @return String 结果
     */
    public static String getStringFromShort(Short param) {
        if (null == param ) {
            return "";
        }
        return param.toString();
    }
    
    /**
     * 将String转换为String返回给用户.
     * @param param 数字型
     * @return BigDecimal 结果
     */
    public static String getStringFromStr(String param) {
        if (null == param || "".equals(param.trim())) {
            return "";
        }
        return param.trim();
    }
    
    /**
     * 将String转换为Date返回给用户.
     * @param param yyyy-MM-dd
     * @return BigDecimal 结果
     */
    public static Date getDateFromStr1(String param) {
        if (null == param || "".equals(param.trim())) {
            return null;
        }
        return DateUtil.convertStringToDate(param);
    }
    
    /**
     * 将String转换为Date返回给用户
     * @param param yyyy-MM-dd HH:mm:ss
     * @return BigDecimal 结果
     */
    public static Date getDateFromStr2(String param) {
        if (null == param || "".equals(param.trim())) {
            return null;
        }
        return DateUtil.convertStringToDateTime1(param);
    }

    /**
     * 判断list是否为空
     * 
     * @param list
     * @return true:空
     * @since 2015年9月4日 下午6:43:59
     * @author
     * @return
     */
    public static boolean listisblank(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /**
     * 补充字符串长度至指定位数 补充在左侧 超过指定长度会截取指定长度
     * 
     * @param str 需要补充的字符串
     * @param length 补充至多少位
     * @param s 填充字符串,空或者空字符串则填充空字符串，否则截取首位字符
     * @return
     * @since 2015年8月13日 上午11:08:41
     * @author
     * @return
     */
    public static String addToLeftLength(String str, Integer length, String s) {
        if (str == null)
            str = "";
        else
            str = str.trim();
        if (s == null || s.length() == 0) {
            s = " ";
        } else {
            s = s.substring(0, 1);
        }
        Integer l = length - str.length();
        if (l > 0) {
            for (int i = 0; i < l; i++) {
                str = s + str;
            }
        } else {
            str = str.substring(0, length);
        }
        return str;
    }

    /**
     * 补充字符串长度至指定位数 补充在右侧 超过指定长度会截取指定长度
     * 
     * @param str 需要补充的字符串
     * @param length 补充至多少位
     * @param s 填充字符串,空则填充空字符串，否则截取首位字符
     * @return
     * @since 2015年8月13日 上午11:08:41
     * @author
     * @return
     */
    public static String addToRightLength(String str, Integer length, String s) {
        if (str == null)
            str = "";
        else
            str = str.trim();
        if (s == null || s.length() == 0) {
            s = " ";
        } else {
            s = s.substring(0, 1);
        }
        Integer l = length - str.length();
        if (l > 0) {
            for (int i = 0; i < l; i++) {
                str = str + s;
            }
        } else {
            str = str.substring(0, length);
        }
        return str;
    }

    /**
     * 将文件名中的汉字转为UTF8编码的串,以便下载时能正确显示另存的文件名.
     * 
     * @param s 原文件名
     * @return 重新编码后的文件名
     */
    public static String toUtf8String(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 0 && c <= 255) {
                sb.append(c);
            } else {
                byte[] b;
                try {
                    b = String.valueOf(c).getBytes("utf-8");
                } catch (Exception ex) {
                    logger.error(ex.getMessage());
                    b = new byte[0];
                }
                for (int j = 0; j < b.length; j++) {
                    int k = b[j];
                    if (k < 0)
                        k += 256;
                    sb.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }
        return sb.toString();
    }

    /**
     * 
     * 生成6位验证码
     * 
     * @return
     * @since 2015年8月20日 上午10:21:15
     * @author
     * @return
     */
    public static String getRandomCode() {
        String code = "";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            code += random.nextInt(10);
        }
        return code;
    }

    /**
     * 
     * 获取UUID
     * 
     * @return
     * @since 2015年9月1日 下午1:29:04
     * @author
     * @return
     */
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    /**
     * 
     * String 集合转换为String
     * 
     * @param list
     * @return
     * @since 2015年9月8日 上午10:17:04
     * @author
     * @return
     */
    public static String listToString(List<String> list) {
        StringBuffer strBuffer = new StringBuffer();
        if (list != null && list.size() > 0) {
            for (String str : list) {
                strBuffer.append(str);
            }
        }
        return strBuffer.toString();
    }

    public static String getNoSpUUID() {
        UUID uuid = UUID.randomUUID();
        String uid = uuid.toString();
        uid = uid.replace("-", "");
        return uid;
    }

    /**
     * 获得一个4位UUID
     * 
     * @return String UUID
     */
    public static String getFourUUID() {
        String s = UUID.randomUUID().toString();
        // 去掉“-”符号
        return s.substring(0, 4);
    }

    /**
     * 获得一个15位UUID
     * 
     * @return String UUID
     */
    public static String getFifteenUUID() {
        String s = getNoSpUUID().toString();
        // 去掉“-”符号
        return s.substring(0, 15);
    }

    
    /**
     * 
     * 去除""及null
     * 
     * @param str
     * @return
     * @since 2015年9月24日 下午3:59:46
     * @author
     * @return
     */
    public static String cutNull(String str) {
        if (str == null || "".equals(str.trim())) {
            return "";
        }
        return str;
    }
    
    public static String cutObjectNull(Object  obj) {
        if (obj == null || "".equals(obj.toString().trim())) {
            return "";
        }
        return obj.toString();
    }

    /**
     * 
     * 截取in所使用的字符串
     * 
     * @param params
     * @return
     * @since 2015年10月12日 上午10:10:29
     * @author
     * @return
     */
    public static String subStringSql(String params) {
        if (params == null) {
            return null;
        }
        if (params.length() < 2) {
            return "";
        }
        int i = params.indexOf("'");
        return params.substring(i + 1, params.length() - 1);
    }
    
     /*** 
     * MD5加码 生成32位md5码 
     */  
    public static String string2MD5(String inStr){  
        MessageDigest md5 = null;  
        try{  
            md5 = MessageDigest.getInstance("MD5");  
        }catch (Exception e){  
            System.out.println(e.toString());  
            e.printStackTrace();  
            return "";  
        }  
        char[] charArray = inStr.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i];  
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++){  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString();  
  
    }  

    /**
     * 
     * 将str截取至len长度
     * 
     * @param str
     * @param len
     * @return
     * @since 2015年11月23日 下午8:05:13
     * @author
     * @return
     */
    public static String subStringByLen(String str, int len) {
        if (str == null)
            return str;
        return str.substring(0, (str.length() > len ? len : str.length()));
    }

    
    /**
     * 汉字转换位汉语拼音首字母，英文字符不变，特殊字符丢失 支持多音字，生成方式如（长沙市长:cssc,zssz,zssc,cssz）
     * 
     * @param chines 汉字
     * @return 拼音
     */
    public static String converterToFirstSpell(String chines) {
        StringBuffer pinyinName = new StringBuffer();
        char[] nameChar = chines.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < nameChar.length; i++) {
            if (nameChar[i] > 128) {
                try {
                    // 取得当前汉字的所有全拼
                    String[] strs = PinyinHelper.toHanyuPinyinStringArray(nameChar[i], defaultFormat);
                    if (strs != null) {
                        for (int j = 0; j < strs.length; j++) {
                            // 取首字母
                            pinyinName.append(strs[j].charAt(0));
                            if (j != strs.length - 1) {
                                pinyinName.append(",");
                            }
                        }
                    }
                    // else {
                    // pinyinName.append(nameChar[i]);
                    // }
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
            } else {
                pinyinName.append(nameChar[i]);
            }
            pinyinName.append(" ");
        }
        // return pinyinName.toString();
        return parseTheChineseByObject(discountTheChinese(pinyinName.toString()));
    }

    /**
     * 去除多音字重复数据
     * 
     * @param theStr
     * @return
     */
    private static List<Map<String, Integer>> discountTheChinese(String theStr) {
        // 去除重复拼音后的拼音列表
        List<Map<String, Integer>> mapList = new ArrayList<Map<String, Integer>>();
        // 用于处理每个字的多音字，去掉重复
        Map<String, Integer> onlyOne = null;
        String[] firsts = theStr.split(" ");
        // 读出每个汉字的拼音
        for (String str : firsts) {
            onlyOne = new Hashtable<String, Integer>();
            String[] china = str.split(",");
            // 多音字处理
            for (String s : china) {
                Integer count = onlyOne.get(s);
                if (count == null) {
                    onlyOne.put(s, new Integer(1));
                } else {
                    onlyOne.remove(s);
                    count++;
                    onlyOne.put(s, count);
                }
            }
            mapList.add(onlyOne);
        }
        return mapList;
    }

    /**
     * 解析并组合拼音，对象合并方案(推荐使用)
     * 
     * @return
     */
    private static String parseTheChineseByObject(List<Map<String, Integer>> list) {
        Map<String, Integer> first = null; // 用于统计每一次,集合组合数据
        // 遍历每一组集合
        for (int i = 0; i < list.size(); i++) {
            // 每一组集合与上一次组合的Map
            Map<String, Integer> temp = new Hashtable<String, Integer>();
            // 第一次循环，first为空
            if (first != null) {
                // 取出上次组合与此次集合的字符，并保存
                for (String s : first.keySet()) {
                    for (String s1 : list.get(i).keySet()) {
                        String str = s + s1;
                        temp.put(str, 1);
                    }
                }
                // 清理上一次组合数据
                if (temp != null && temp.size() > 0) {
                    first.clear();
                }
            } else {
                for (String s : list.get(i).keySet()) {
                    String str = s;
                    temp.put(str, 1);
                }
            }
            // 保存组合数据以便下次循环使用
            if (temp != null && temp.size() > 0) {
                first = temp;
            }
        }
        String returnStr = "";
        if (first != null) {
            // 遍历取出组合字符串
            for (String str : first.keySet()) {
                returnStr += (str + ",");
            }
        }
        if (returnStr.length() > 0) {
            returnStr = returnStr.substring(0, returnStr.length() - 1);
        }
        return returnStr;
    }
    
    /**
     *   List<String> strs = new ArrayList<>();
     *   strs.add("0");
     *   strs.add("1");
     *   strs.add("1");
     *   strs.add("1");
     *   strs.add("1");
     *   Tools.getImage(strs, "rrr.jpg");
     *   0:显示白色，1显示白色之外的颜色
     * @param strs 颜色组合
     * @param imageName 图片名称
     */
    public static void getImage(List<String> strs, String imageName) {
        if (strs.size()< 5) {
            return;
        }
        for (String string : strs) {
            if (Tools.isblank(string) && !"0".equals(string) && !"1".equals(string)) {
                return;
            }
        }
        List<Color> colors = new ArrayList<>();
        //护士对应黑色，医生对应黄色；护士长对应蓝色，质控医生对应橙色；主任对应红色；
        // 护士
        if ("0".equals(strs.get(0))) {
            colors.add(Color.WHITE);
        } else {
            colors.add(Color.BLACK);
        }
        // 护士长
        if ("0".equals(strs.get(2))) {
            colors.add(Color.WHITE);
        } else {
            colors.add(Color.BLUE);
        }
        // 医生
        if ("0".equals(strs.get(1))) {
            colors.add(Color.WHITE);
        } else {
            colors.add(Color.YELLOW);
        }
        // 质控医生
        if ("0".equals(strs.get(3))) {
            colors.add(Color.WHITE);
        } else {
            colors.add(Color.ORANGE);
        }
        // 主任
        if ("0".equals(strs.get(4))) {
            colors.add(Color.WHITE);
        } else {
            colors.add(Color.RED);
        }
        Tools.makeColorCircular(colors, imageName);
        
    }
    
    public static void makeColorCircular(List<Color> colors, String imageName) {
        try {
            BufferedImage image = new BufferedImage(30, 30, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = (Graphics2D) image.createGraphics();
            g.setBackground(Color.WHITE);
            g.clearRect(0, 0, 30, 30);
            g.setPaint(Color.RED);

            g.clipRect(0, 0, 30, 30);
            g.setColor(colors.get(0));
            g.fillArc(0, 0, 30, 30, 0, 72);

            g.setColor(colors.get(1));
            g.fillArc(0, 0, 30, 30, 72, 72);

            g.setColor(colors.get(2));
            g.fillArc(0, 0, 30, 30, 144, 72);

            g.setColor(colors.get(3));
            g.fillArc(0, 0, 30, 30, 216, 72);

            g.setColor(colors.get(4));
            g.fillArc(0, 0, 30, 30, 288, 72);

            // 话圆圈
            g.setColor(Color.lightGray);
            g.drawArc(0,0,30,30,0,360);
            
            g.drawImage(image,0,0,null);
            String path = ConfigUtil.getProperty("imagePath", "D:\\images\\");
            File file = new File(path);
            if (!file.exists()) {
                file.mkdir();
            }
            ImageIO.write(image, "jpg", new File(path + imageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * 比较输入的字符串1和字符串2是否相等
     * 
     * @param str1
     *            ：字符串1
     * @param str2
     *            ：字符串2
     * @return 相等：true，不相等：false
     */
    public static boolean equals(String str1, String str2) {
        if (str1==str2) {
            return true;
        }
        // null 和 空串在系统中认为相等
        str1 = (str1 == null?"":str1.trim());
        str2 = (str2 == null?"":str2.trim());
        return str1.equals(str2);
    }
    
    /**
     * 对字符串去除空格，如果字符串为null，则返回""
     * @param str ：输入字符串
     * @return ：trim后结果
     */
    public static String trim(String str) {
        if (null == str) {
            return "";
        }
        return str.trim();
    }
	
    /**
     * 语音播报文字内容方法
     * @param content
     * @param speakTime
     */
	public static void voiceSpeakApiBack(String type, String content, int speakTime) {
		try {
			String IP = "";
    		if("1".equals(type)) {
    			IP = ConfigUtil.getProperty("weightMachineServerIP", "");
    		}else if("2".equals(type)) {
    			IP = ConfigUtil.getProperty("operateMachineServerIP", "");
    		}
    		if(!Tools.isblank(IP)) {
    			JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
    			Client client = clientFactory.createClient(IP+"/voiceSpeakSystem/services/HospitalApi?wsdl");
    			client.invoke("voiceSpeakApi", "6DED1E767AB7AF7D273FECB613B681A3", content, speakTime);
    		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void voiceSpeakApi(final String type, final String content, final int speakTime) {
		new Thread(new Runnable() {
            public void run() {
            	try {
            		String IP = "";
            		if("1".equals(type)) {
            			IP = ConfigUtil.getProperty("weightMachineServerIP", "");
            		}else if("2".equals(type)) {
            			IP = ConfigUtil.getProperty("operateMachineServerIP", "");
            		}
            		if(!Tools.isblank(IP)) {
            			JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
            			Client client = clientFactory.createClient(IP+"/voiceSpeakSystem/services/HospitalApi?wsdl");
            			client.invoke("voiceSpeakApi", "6DED1E767AB7AF7D273FECB613B681A3", content, speakTime);
            		}
            	}catch(Exception e) {
            		e.printStackTrace();
            	}
            }
        }).start();
	}
	
	public static void voiceSpeakApi301(final String content, final int speakTime) {
		new Thread(new Runnable() {
			public void run() {
				try {
					String IP = ConfigUtil.getProperty("operateMachineServerIP", "");
					if(!Tools.isblank(IP)) {
						JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
						Client client = clientFactory.createClient(IP+"/voiceSpeakSystem/services/HospitalApi?wsdl");
						client.invoke("voiceSpeakApi", "6DED1E767AB7AF7D273FECB613B681A3", content, speakTime);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
	
	public static String subZeroAndDot(String s){  
        if(s.indexOf(".") > 0){  
            s = s.replaceAll("0+?$", "");//去掉多余的0  
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉  
        }  
        return s;  
    }  
	
	/**
	 * 获得9位随机整数
	 * @return
	 */
	public static int getNineNumber(){
		Random r = new Random(); 
		int num = r.nextInt(999999999)+1;
		return num;
	}
	
	/**
	 * 根据表的列数生成参数
	 * @param num
	 * @return
	 */
	public static String getsqlparams(int num){
		String str = "";
		for(int i=0;i<num;i++){
			str += "?,";
		}
		if(!Tools.isblank(str)){
			str = str.substring(0, str.length()-1);
		}
		return str;
	}

}