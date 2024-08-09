package com.interview.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode_5_LongestPalindromeSubstringTest {

    @Test
    void longestPalindromeSolution1_tc1() {
        //given
        String input = "babad";
        String expected = "bab";
        //when
        String result = Leetcode_5_LongestPalindromeSubstring.longestPalindromeSolution1(input);
        //then
        assertEquals(expected, result);
    }
    @Test
    void longestPalindromeSolution1_tc2() {
        //given
        String input = "cbbd";
        String expected = "bb";
        //when
        String result = Leetcode_5_LongestPalindromeSubstring.longestPalindromeSolution1(input);
        //then
        assertEquals(expected, result);
    }

    @Test
    void longestPalindromeSolution2_tc1() {
        //given
        String input = "babad";
        String expected = "aba";
        //when
        Leetcode_5_LongestPalindromeSubstring test = new Leetcode_5_LongestPalindromeSubstring();
        String result = test.longestPalindromeSolution2(input);
        //then
        assertEquals(expected, result);
    }
    @Test
    void longestPalindromeSolution2_tc2() {
        //given
        String input = "cbbd";
        String expected = "bb";
        //when
        Leetcode_5_LongestPalindromeSubstring test = new Leetcode_5_LongestPalindromeSubstring();
        String result = test.longestPalindromeSolution2(input);
        //then
        assertEquals(expected, result);
    }
    @Test
    void longestPalindromeSolution3_tc1() {
        //given
        String input = "babad";
        String expected = "bab";
        //when
        String result = Leetcode_5_LongestPalindromeSubstring.longestPalindromeSolution1(input);
        //then
        assertEquals(expected, result);
    }
    @Test
    void longestPalindromeSolution3_tc2() {
        //given
        String input = "cbbd";
        String expected = "bb";
        //when
        String result = Leetcode_5_LongestPalindromeSubstring.longestPalindromeSolution1(input);
        //then
        assertEquals(expected, result);
    }
}