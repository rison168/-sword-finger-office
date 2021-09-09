package com.rison.office.chapter03;

/**
 * @author : Rison 2021/9/9 下午4:21
 * <p>
 * 题目描述：将一个字符串中的空格替换成“%20”
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%
 * 20Happy。
 * <p>
 * 思路：从后往前复制，数组长度会增加，或使用StringBuilder、StringBuffer
 * 类
 */
public class MainTest {

    public String replaceSpace(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }

        return String.valueOf(sb);
    }
}
