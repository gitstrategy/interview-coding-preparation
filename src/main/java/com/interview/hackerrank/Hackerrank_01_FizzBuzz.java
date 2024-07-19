package com.interview.hackerrank;
/**
 * https://www.hackerrank.com/challenges/fizzbuzz/problem
 * */
public class Hackerrank_01_FizzBuzz {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        printFizzBuzz(4);
    }
    public static void printFizzBuzz(int n){
        if(n<1){
            System.out.println(n);
        }
        for (int i = 1;i<=n;i++){
            if(i%3==0 && i%5 ==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
