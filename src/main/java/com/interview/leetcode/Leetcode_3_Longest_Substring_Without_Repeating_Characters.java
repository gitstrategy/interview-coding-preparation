package com.interview.leetcode;


import java.util.HashSet;

/**
 * ===============================================
 *
 * @Author: quocgiangnguyen (Bzman.hn@gmail.com)
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters
 * Difficulty Level (Easy, Medium, Hard):
 * Language: Java
 * Date: 8/9/24, 12:37 PM (US-Eastern Time)
 * ===============================================
 * Detail:
 * ===============================================
 * Given a string s, find the length of the longest
 * substring without repeating characters.
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 **/
public class Leetcode_3_Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashSet<Character> setChars = new HashSet<>();
        int max = 0, i = 0, j = 0;
        while (j < s.length()) {
            if (!setChars.contains(s.charAt(j))) {
                System.out.println("j= " +j);
                System.out.println("char j add to set" +s.charAt(j));
                setChars.add(s.charAt(j));
                System.out.println("size setChars " +setChars.size());
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                System.out.println("i= " +i);
                System.out.println("char i removed " +s.charAt(i));
                setChars.remove(s.charAt(i));
                System.out.println("size setChars " +setChars.size());
                i++;
            }
        }
        return max;
    }
    public int lengthOfLongestSubstringSolution2(String s) {
        int low = 0;
        int maxlength = 0;
        int[] lastindex = new int[128];
        for (int high = 0; high < s.length(); high++) {
            char currentchar = s.charAt(high);
            low = Math.max(low, lastindex[currentchar]);
            maxlength = Math.max(maxlength, high - low + 1);
            lastindex[currentchar] = high + 1;
        }
        return maxlength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        Leetcode_3_Longest_Substring_Without_Repeating_Characters test = new Leetcode_3_Longest_Substring_Without_Repeating_Characters();;
        System.out.println(test.lengthOfLongestSubstring(s));
    }
}
