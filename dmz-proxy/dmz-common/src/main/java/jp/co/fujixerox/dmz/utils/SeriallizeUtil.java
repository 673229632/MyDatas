package jp.co.fujixerox.dmz.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriallizeUtil {
	/**
	 * java对象序列化到数组
	 * 
	 * @param obj
	 * @return
	 */
	public static byte[] toByteArray(Object obj) {
		if (obj == null) {
			return null;
		}
		byte[] bytes = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(bos);
			oos.writeObject(obj);
			oos.flush();
			bytes = bos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return bytes;
	}

	/**
	 * 数组反序列化到java对象
	 * 
	 * @param bytes
	 * @return
	 */
	public static Object toObject(byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			ois = new ObjectInputStream(bis);
			obj = ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return obj;
	}
}
