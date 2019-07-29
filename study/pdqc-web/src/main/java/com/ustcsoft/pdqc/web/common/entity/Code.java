
package com.ustcsoft.pdqc.web.common.entity;

/**
 * 用户显示下拉框的Value-Text对象.
 * 
 * @author kxiong
 *
 */
public class Code implements Comparable<Code> {

    public String value;

    public String text;

    /**
     * 构造函数.
     */
    public Code() {

    }

    /**
     * 构造函数.
     * 
     * @param value 值
     * @param text 文本
     */
    public Code(String value, String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Code [value=" + value + ", text=" + text + "]";
    }

    /**
     * value的GET方法.
     *
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * value的SET方法.
     *
     * @param value value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * text的GET方法.
     *
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * text的SET方法.
     *
     * @param text text
     */
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int compareTo(Code code) {
        if (value == null) {
            return -1;
        }
        if (code == null || code.value == null) {
            return 1;
        }
        return value.compareTo(code.value);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Code other = (Code) obj;
        if (text == null) {
            if (other.text != null)
                return false;
        } else if (!text.equals(other.text))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }
}
