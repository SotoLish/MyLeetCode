package org.soto.d001;

import java.util.Stack;

/**
 * [20] 有效的括号
 * @author: liuqixin
 * @date: 2020/08/14 18:36
 */
public class P020_EffictiveBrackets {

    public static void main(String[] args) {
        String s = "{()}";
        boolean isVa = isValid(s);


    }

    public static boolean isValid(String s) {
        if (null == s) {
            return false;
        }
        int len = s.length();
        if (len/2 == 1) {
            return false;
        }
        if (s.isEmpty()) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char ch : chars) {
            char po = stack.pop();
            if (ch != po) {
                stack.push(po);
                stack.push(ch);
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
