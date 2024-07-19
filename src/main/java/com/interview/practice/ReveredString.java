package com.interview.practice;

public class ReveredString {
    public static void main(String[] args) {
        final String string = "Hello Georgia!";
        System.out.println(reveredStringWithStringBuilder(string));
        System.out.println(reveredStringManually(string));
    }

    private static String reveredStringWithStringBuilder(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static String reveredStringManually(String string) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();

    }

}
