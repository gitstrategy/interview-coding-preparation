package com.interview.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * Difficulty level: Easy
 * Language: Java
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * Constraints:
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */
public class Leetcode_1071_GreatestCommonDivisorOfStrings {
    /*public String gcdOfStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        Set<Character> resultString = new HashSet<>();

        for(int i=0;i<str1.length();i++){
            if(!resultString.contains((str1.charAt(i)))){
                result.append(str1.charAt(i));
                resultString.add(str1.charAt(i));
            }else
            //this will give WRONG answer if there is duplicate characters in the common string
                break;
        }
        if(str2.contains(result.toString())){
            return result.toString();
        }
        else return "";
    }*/
    public String gcdOfStrings(String str1, String str2) {
        if(str2.isEmpty())
            return str1;
        if(str2.length() > str1.length()){
            return gcdOfStrings(str2, str1);
        }
        if(!str1.startsWith(str2))
            return "";
        while(str1.startsWith(str2)){
            str1 = str1.substring(str2.length());
        }
        return gcdOfStrings(str1, str2);
    }

    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "AB";
        System.out.println(str1+str2);
        System.out.println(str2+str1);
    }
}
