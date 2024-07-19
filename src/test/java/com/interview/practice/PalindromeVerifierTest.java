package com.interview.practice;

import com.interview.practice.PalindromeVerifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeVerifierTest {

    @Test
    void isPalindrome_Palindrome_true() {
        //given
        final String str = "1Red rum, sir, is murder1";
        //when
        final boolean result = PalindromeVerifier.isPalindrome(str);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void isNotPalindrome_Palindrome_false() {
        //given
        final String str = "apple";
        //when
        final boolean result = PalindromeVerifier.isPalindrome(str);
        //then
        Assertions.assertFalse(result);
    }


    @Test
    void simplifyString_() {
        //given
        final String str = "1Red rum, sir, is murder1";
        final String result = PalindromeVerifier.simplifyString(str);
        Assertions.assertEquals("1redrumsirismurder1",result);
    }
}