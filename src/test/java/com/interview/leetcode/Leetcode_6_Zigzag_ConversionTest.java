package com.interview.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Created: 08/10/2024 - 3:03 PM(US-Eastern Time)
 * @Project: interview-coding-preparation
 * @Author: quocgiangnguyen (Bzman.hn@gmail.com)
 */
class Leetcode_6_Zigzag_ConversionTest {

    @Test
    void convertSolution1_tc1() {
        //given
        final String input = "PAYPALISHIRING";
        int numRows = 3;
        final String expected = "PAHNAPLSIIGYIR";
        //when
        Leetcode_6_Zigzag_Conversion test = new Leetcode_6_Zigzag_Conversion();
        //then
        assertEquals(expected,test.convertSolution1(input, numRows));
    }
    @Test
    void convertSolution1_tc2() {
        //given
        final String input = "PAYPALISHIRING";
        int numRows = 4;
        final String expected = "PINALSIGYAHRPI";
        //when
        Leetcode_6_Zigzag_Conversion test = new Leetcode_6_Zigzag_Conversion();
        //then
        assertEquals(expected,test.convertSolution1(input, numRows));
    }
}