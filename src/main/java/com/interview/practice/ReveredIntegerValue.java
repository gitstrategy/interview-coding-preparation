package com.interview.practice;

public class ReveredIntegerValue {


    public static void main(String[] args) {
        int data = 12345;
        System.out.println(reveredIntegerValue(data));
    }

    private static int reveredIntegerValue(int data) {
        long revered = 0;
        while (data != 0) {
            revered = revered * 10 + data % 10;
            data = data / 10;
            if (revered > Integer.MAX_VALUE || revered < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) revered;
    }
}
