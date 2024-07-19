package com.interview.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Leetcode_520_DetectCapitalTest {

    @Test
    void detectCapital_allUpperCase_true() {
        //given
        final String upperCaseStr = "GOOGLE";
        //when
        boolean result = new Leetcode_520_DetectCapital().detectCapital(upperCaseStr);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void detectCapital_allLowerCase_true() {
        //given
        final String upperCaseStr = "facebook";
        //when
        boolean result = new Leetcode_520_DetectCapital().detectCapital(upperCaseStr);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void detectCapital_firstLetterUpperCaseAndAllOtherLowerCase_true() {
        //given
        final String upperCaseStr = "Twitter";
        //when
        boolean result = new Leetcode_520_DetectCapital().detectCapital(upperCaseStr);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void detectCapital_middleLetterUpperCaseAndAllOtherLowerCase_false() {
        //given
        final String upperCaseStr = "quocGiang";
        //when
        boolean result = new Leetcode_520_DetectCapital().detectCapital(upperCaseStr);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void detectCapital_2FirstLetterUpperCaseAndAllOtherLowerCase_false() {
        //given
        final String upperCaseStr = "GEorgia";
        //when
        boolean result = new Leetcode_520_DetectCapital().detectCapital(upperCaseStr);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void detectCapital_OneLowerCaseAndAllOtherUpperCase_false() {
        //given
        final String upperCaseStr = "AMERiCA";
        //when
        boolean result = new Leetcode_520_DetectCapital().detectCapital(upperCaseStr);
        //then
        Assertions.assertFalse(result);
    }

}