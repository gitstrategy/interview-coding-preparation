package com.interview.leetcode;

import java.util.function.Predicate;

/**
 * Interview Question: Given a word, you need to judge whether the usage of capitals in it is right or not.
 * Leetcode link: https://leetcode.com/problems/detect-capital/
 * Difficulty level: Easy
 * Language: Java
 */
public class Leetcode_520_DetectCapital {
    public boolean detectCapital(String word) {
        if (word.length() <= 1) return true;
        //create a Predicate that is correct case is lower case
        Predicate<Character> correctCase = Character::isLowerCase;
        //if the first character and the second character is upper case, change the correct case to upper case
        if ((Character.isUpperCase(word.charAt(0)) && (Character.isUpperCase(word.charAt(1))))) {
            correctCase = Character::isUpperCase;
        }
        //if not check the correct case in the whole word with correct case predicate
        for (int i = 1; i < word.length(); i++) {
            if (!correctCase.test(word.charAt(i)))
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        // String testword ="QuocGiangNguyen";
        String testword = "QUOCGIANG";
        Leetcode_520_DetectCapital challenge520DetectCapital = new Leetcode_520_DetectCapital();
        if (challenge520DetectCapital.detectCapital(testword)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
