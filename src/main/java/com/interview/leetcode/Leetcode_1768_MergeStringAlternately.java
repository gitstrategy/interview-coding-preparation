package com.interview.leetcode;

/**
 * https://leetcode.com/problems/merge-strings-alternately/description/
 * Difficulty level: Easy
 * Language: Java
 */
public class Leetcode_1768_MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder(200);
        int maxLength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                result = result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result = result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}
