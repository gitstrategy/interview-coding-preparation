package com.interview.practice;

public class PalindromeVerifier {
    public static boolean isPalindrome(String str) {
        //simplify String to remove all special characters and convert them to lower case
        final String simplifiedString = simplifyString(str);
        //get revered string from the simplifyString
        String reveredString = new StringBuilder(simplifiedString).reverse().toString();
        //return result of comparing simplifyString and reveredString, will return true if they are equal
        return reveredString.equals(simplifiedString);
    }

    public static String simplifyString(String string) {
        //regex explanation: replace all character which not in from a to z and 0 to 9 by empty string
        return string.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}
