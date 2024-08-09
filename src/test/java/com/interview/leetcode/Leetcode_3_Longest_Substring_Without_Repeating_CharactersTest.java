package com.interview.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Leetcode_3_Longest_Substring_Without_Repeating_CharactersTest {

    @Test
    void lengthOfLongestSubstring_testcase1() {
        //Given
        String data = "abcabcbb";
        //When
        Leetcode_3_Longest_Substring_Without_Repeating_Characters test = new Leetcode_3_Longest_Substring_Without_Repeating_Characters();
        //Then
        assertEquals(3, test.lengthOfLongestSubstring(data));
    }

    @Test
    void lengthOfLongestSubstring_testcase2() {
        //Given
        String data = "bbbbb";
        //When
        Leetcode_3_Longest_Substring_Without_Repeating_Characters test = new Leetcode_3_Longest_Substring_Without_Repeating_Characters();
        //Then
        assertEquals(1, test.lengthOfLongestSubstring(data));
    }

    @Test
    void lengthOfLongestSubstring_testcase3() {
        //Given
        String data = "pwwkew";
        //When
        Leetcode_3_Longest_Substring_Without_Repeating_Characters test = new Leetcode_3_Longest_Substring_Without_Repeating_Characters();
        //Then
        assertEquals(3, test.lengthOfLongestSubstring(data));
    }
}