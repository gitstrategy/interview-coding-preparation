package com.interview.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given two strings ‘S1’ and ‘S2’. Your task is to find the smallest substring of ‘S1’ which contains all the characters of ‘S2’. The characters of ‘S2’ need not be present in the same order in S1. That is, we need a substring that contains all characters of ‘S2’ irrespective of the order.
 * A substring is a contiguous sequence of characters within a string.
 * Example
 * Let ‘S1’ be “ABBCD” and ‘S2’ be “ABC”, so the smallest substring of ‘S1’ which contains all the characters of S1 is “ABBA”.
 */
public class SmallestSubstringContainingAllChars {
    public static void main(String[] args) {
        String S1 = "ABCD";
        String S2 = "ABC";
        String result = findSmallestSubString(S1, S2);
        System.out.println("Smallest Substring  is: " + result);
    }

    public static String findSmallestSubString(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() < s2.length()) {
            return "";
        }
        //Frequency map for character in S2
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s2.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        int required = charCountMap.size();
        int formed = 0;
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        System.out.println("minlength" + minLength + "and  maxSum" + maxSum);
        int minLeft = 0;
        //Frequency map for character in current window
        Map<Character, Integer> windowCounts = new HashMap<>();
        while (right < s1.length()) {
            char c = s1.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);
            // Check if the current character in the window matches the frequency in S2
            if (charCountMap.containsKey(c) && windowCounts.get(c).intValue() == charCountMap.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {
                c = s1.charAt(left);
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (charCountMap.containsKey(c) && windowCounts.get(c).intValue() < charCountMap.get(c).intValue()) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s1.substring(minLeft, minLeft + minLength);
    }
}
