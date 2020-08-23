package org.soto.d001;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * @author liuqixin
 * @date 2019/12/4 17:26
 */
public class P003_NotRepeatLengestString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    /**
     * 计算无重复字符串的最长长度
     *
     * @param s 字符串
     * @return 长度
     */
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<Character>();
        int i = 0, j = 0, n = s.length();
        int ans = 0;
        // 使用滑窗
        while (i < n && j < n) {
            if (!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j++));
                ans = ans > j - i ? ans : j - i;
            } else {
                charSet.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
