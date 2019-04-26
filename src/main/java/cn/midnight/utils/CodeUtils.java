package cn.midnight.utils;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @ClassName:  CodeUtils   
 * @Description:短信验证码生成工具   
 * @author: 陈军
 * @date:   2019年1月30日 下午2:00:09   
 *     
 * @Copyright: 2019 www.zb-tech.com Inc. All rights reserved. 
 *
 */
public class CodeUtils {
    /**
     * 
     * @Title: randomCode   
     * @Description: 生成一个指定长度的随机码  
     * @author:陈军
     * @date 2019年1月30日 下午2:01:57 
     * @param lengh 长度
     * @param chars 随机取值范围
     * @param repetition 是否可重复
     * @return      
     * String      
     * @throws
     */
    public static String randomCode(int length, char[] chars, boolean repetition) throws Exception {

        if (repetition) {
            return randomCodeRepetition(length, chars);
        }
        return randomCodeUnrepetition(length, chars);
    }

    /**
     * 
     * @Title: randomCodeRepetition   
     * @Description: 生成可重复的验证码  
     * @author:陈军
     * @date 2019年2月18日 上午9:48:56 
     * @param length
     * @param chars
     * @return      
     * String      
     * @throws
     */
    private static String randomCodeRepetition(int length, char[] chars) {
        StringBuilder sb = new StringBuilder();
        int charsLength = chars.length;
        for (int i = 0; i < length; i++) {
            sb.append(chars[(int) (Math.random() * charsLength)]);
        }
        return sb.toString();
    }

    /**
     * 
     * @Title: randomCodeUnrepetition   
     * @Description: 生成不可重复的验证码  
     * @author:陈军
     * @date 2019年2月18日 上午9:49:19 
     * @param length
     * @param chars
     * @return
     * @throws Exception      
     * String      
     * @throws
     */
    private static String randomCodeUnrepetition(int length, char[] chars) throws Exception {
        int charsLength = chars.length;
        if (charsLength < length) {
            throw new Exception();
        }
        List<Character> list = new LinkedList<>();

        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * list.size());
            sb.append(list.remove(random));
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        char[] chars = new char[20];
        for (int i = 0; i < 20; i++) {
            chars[i] = (char) ('a' + i);
        }
        System.out.println(randomCode(10, chars, false));
    }

}
