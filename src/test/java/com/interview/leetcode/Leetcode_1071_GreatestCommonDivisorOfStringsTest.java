package com.interview.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode_1071_GreatestCommonDivisorOfStringsTest {

    @Test
    void gcdOfStrings_String1ContainsString2() {
        //given
        final String str1 = "ABCABC";
        final String str2 = "ABC";
        //when
        Leetcode_1071_GreatestCommonDivisorOfStrings test = new Leetcode_1071_GreatestCommonDivisorOfStrings();
        String result = test.gcdOfStrings(str1,str2);
        //then
        Assertions.assertEquals("ABC", result);
    }
    @Test
    void gcdOfStrings_String1AndString2HasCommon() {
        //given
        final String str1 = "ABABAB";
        final String str2 = "ABAB";
        //when
        Leetcode_1071_GreatestCommonDivisorOfStrings test = new Leetcode_1071_GreatestCommonDivisorOfStrings();
        String result = test.gcdOfStrings(str1,str2);
        //then
        Assertions.assertEquals("AB", result);
    }
    @Test
    void gcdOfStrings_String1AndString2HasNothingCommon() {
        //given
        final String str1 = "LEET";
        final String str2 = "CODE";
        //when
        Leetcode_1071_GreatestCommonDivisorOfStrings test = new Leetcode_1071_GreatestCommonDivisorOfStrings();
        String result = test.gcdOfStrings(str1,str2);
        //then
        Assertions.assertEquals("", result);
    }
    @Test
    void gcdOfStrings_StringHasDuplicateCharacters() {
        //given
        final String str1 = "LEETCODEELEETCODEE";
        final String str2 = "LEETCODEE";
        //when
        Leetcode_1071_GreatestCommonDivisorOfStrings test = new Leetcode_1071_GreatestCommonDivisorOfStrings();
        String result = test.gcdOfStrings(str1,str2);
        //then
        Assertions.assertEquals("LEETCODEE", result);
    }
}