package com.interview.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Leetcode_1_TwoSumTest {

    @Test
    void twoSumSolution1_find() {
        int[] numbers = new int[]{2, 3, 7, 4, 8};
        int target = 7;
        int[] result = Leetcode_1_TwoSum.twoSumSolution1(numbers, target);
        Assertions.assertArrayEquals(result, new int[]{3, 1});
    }

    @Test
    void twoSumSolution1_cannot_find() {
        int[] numbers = new int[]{2, 3, 7, 4, 8};
        ;
        int target = 19;
        int[] result = Leetcode_1_TwoSum.twoSumSolution1(numbers, target);
        Assertions.assertArrayEquals(result, new int[]{-1, -1});
    }

    @Test
    void twoSumSolution2_find() {
        int[] numbers = new int[]{2, 3, 7, 4, 8};
        ;
        int target = 7;
        int[] result = Leetcode_1_TwoSum.twoSumSolution2(numbers, target);
        Assertions.assertArrayEquals(result, new int[]{1, 3});
    }

    @Test
    void twoSumSolution2_cannot_find() {
        int[] numbers = new int[]{2, 3, 7, 4, 8};
        ;
        int target = 18;
        int[] result = Leetcode_1_TwoSum.twoSumSolution2(numbers, target);
        Assertions.assertArrayEquals(result, new int[]{0, 0});
    }
}