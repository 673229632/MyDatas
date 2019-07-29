package com.ustcsoft.pdqc.newweb;

public class Test {

    public static void main(String[] args) throws Exception {
        String str16 = bytes2HexString("zhangrui".getBytes());
        System.out.println(str16);

        System.out.println(bytes2String(hexString2Bytes(str16)));
    }

    /**
     * 字节数组转16进制字符串.
     *
     * @param b
     * @return
     */
    public static String bytes2HexString(byte[] b) {
        String r = "";

        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            r += hex.toUpperCase();
        }
        return r;
    }

    /**
     * 16进制字符串转字节数组.
     *
     * @param hex
     * @return
     */
    public static byte[] hexString2Bytes(String hex) {

        if ((hex == null) || (hex.equals(""))) {
            return null;
        } else if (hex.length() % 2 != 0) {
            return null;
        } else {
            hex = hex.toUpperCase();
            int len = hex.length() / 2;
            byte[] b = new byte[len];
            char[] hc = hex.toCharArray();
            for (int i = 0; i < len; i++) {
                int p = 2 * i;
                b[i] = (byte) (charToByte(hc[p]) << 4 | charToByte(hc[p + 1]));
            }
            return b;
        }
    }

    /**
     * 字符转换为字节.
     *
     * @param c
     * @return
     */
    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    /**
     * 字节数组转字符串.
     *
     * @param b
     * @return
     * @throws Exception
     */
    public static String bytes2String(byte[] b) throws Exception {
        String r = new String(b, "UTF-8");
        return r;
    }
}
