package com.interview.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode_1768_MergeStringAlternatelyTest {

    @Test
    void mergeAlternately_word1longerthanword2() {
        //given
        final String word1 = "abcd";
        final String word2 = "ef";
        //when
        Leetcode_1768_MergeStringAlternately test = new Leetcode_1768_MergeStringAlternately();
        String result = test.mergeAlternately(word1,word2);
        //then
        Assertions.assertEquals("aebfcd", result);
    }

    @Test
    void mergeAlternately_word1shorterthanword2() {
        //given
        final String word1 = "ab";
        final String word2 = "cdef";
        //when
        Leetcode_1768_MergeStringAlternately test = new Leetcode_1768_MergeStringAlternately();
        String result = test.mergeAlternately(word1,word2);
        //then
        Assertions.assertEquals("acbdef", result);
    }
    @Test
    void mergeAlternately_word1equalword2() {
        //given
        final String word1 = "abc";
        final String word2 = "def";
        //when
        Leetcode_1768_MergeStringAlternately test = new Leetcode_1768_MergeStringAlternately();
        String result = test.mergeAlternately(word1,word2);
        //then
        Assertions.assertEquals("adbecf", result);
    }
}