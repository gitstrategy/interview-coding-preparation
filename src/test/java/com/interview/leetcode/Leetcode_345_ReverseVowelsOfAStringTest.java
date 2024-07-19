package com.interview.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode_345_ReverseVowelsOfAStringTest {

    @Test
    void reverseVowels_testCase1() {
        //Given
        String data = "hello";
        //When
        Leetcode_345_ReverseVowelsOfAString test = new Leetcode_345_ReverseVowelsOfAString();
        String actualResult = test.reverseVowels(data);
        //Then
        Assertions.assertEquals("holle",actualResult);
    }

    @Test
    void reverseVowels_testCase2() {
        //Given
        String data = "leetcode";
        //When
        Leetcode_345_ReverseVowelsOfAString test = new Leetcode_345_ReverseVowelsOfAString();
        String actualResult = test.reverseVowels(data);
        //Then
        Assertions.assertEquals("leotcede",actualResult);
    }

    @Test
    void reverseVowelsBetterSolution_testCase1() {
        //Given
        String data = "hello";
        //When
        Leetcode_345_ReverseVowelsOfAString test = new Leetcode_345_ReverseVowelsOfAString();
        String actualResult = test.reverseVowelsBetterSolution(data);
        //Then
        Assertions.assertEquals("holle",actualResult);
    }
    @Test
    void reverseVowelsBetterSolution_testCase2() {
        //Given
        String data = "leetcode";
        //When
        Leetcode_345_ReverseVowelsOfAString test = new Leetcode_345_ReverseVowelsOfAString();
        String actualResult = test.reverseVowelsBetterSolution(data);
        //Then
        Assertions.assertEquals("leotcede",actualResult);
    }
}