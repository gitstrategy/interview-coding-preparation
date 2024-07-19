package com.interview.leetcode;

/**
 * https://leetcode.com/problems/integer-to-roman/
 * Difficulty level: Easy
 * Language: Java
 */
public class Leetcode_12_IntegerToRoman {

    public static String intToRoman(int num) {
        // Define the mapping of integer values to Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        // Iterate over the values and numerals arrays
        for (int i = 0; i < values.length; i++) {
            // While the current value can be subtracted from num
            while (num >= values[i]) {
                // Append the corresponding Roman numeral to the result
                romanNumeral.append(numerals[i]);
                // Subtract the value from num
                num -= values[i];
            }
        }
        return romanNumeral.toString();
    }

    //Alternative Solution
    public static String intToRomanSolution2(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds =
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens =
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units =
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num / 1000] +
                hundreds[(num % 1000) / 100] +
                tens[(num % 100) / 10] +
                units[num % 10];
    }

    public static void main(String[] args) {
        // Test the intToRoman method
        int number = 3006;
        String roman = intToRoman(number);
        System.out.println("The Roman numeral for " + number + " is " + roman);
        String roman2 = intToRomanSolution2(number);
        System.out.println("The Roman numeral for " + number + " is " + roman2);
    }
}
