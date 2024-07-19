package com.interview.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode_1431_KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    void kidsWithCandies_testcase1() {
        //given
        final int[] candies = {2, 3, 5, 1, 3};
        final int extraCandies = 3;
        //when
        Leetcode_1431_KidsWithTheGreatestNumberOfCandies test = new Leetcode_1431_KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = test.kidsWithCandies(candies, extraCandies);
        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void kidsWithCandies_testcase2() {
        //given
        final int[] candies = {4, 2, 1, 1, 2};
        final int extraCandies = 1;
        //when
        Leetcode_1431_KidsWithTheGreatestNumberOfCandies test = new Leetcode_1431_KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = test.kidsWithCandies(candies, extraCandies);
        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(false);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void kidsWithCandies_testcase3() {
        //given
        final int[] candies = {12, 1, 12};
        final int extraCandies = 10;
        //when
        Leetcode_1431_KidsWithTheGreatestNumberOfCandies test = new Leetcode_1431_KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = test.kidsWithCandies(candies, extraCandies);
        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void kidsWithCandiesBetterSolution_testcase1() {
        //given
        final int[] candies = {2, 3, 5, 1, 3};
        final int extraCandies = 3;
        //when
        Leetcode_1431_KidsWithTheGreatestNumberOfCandies test = new Leetcode_1431_KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = test.kidsWithCandiesBetterSolution(candies, extraCandies);
        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void kidsWithCandiesBetterSolution_testcase2() {
        //given
        final int[] candies = {4, 2, 1, 1, 2};
        final int extraCandies = 1;
        //when
        Leetcode_1431_KidsWithTheGreatestNumberOfCandies test = new Leetcode_1431_KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = test.kidsWithCandiesBetterSolution(candies, extraCandies);
        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(false);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void kidsWithCandiesBetterSolution_testcase3() {
        //given
        final int[] candies = {12, 1, 12};
        final int extraCandies = 10;
        //when
        Leetcode_1431_KidsWithTheGreatestNumberOfCandies test = new Leetcode_1431_KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = test.kidsWithCandiesBetterSolution(candies, extraCandies);
        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);
        Assertions.assertEquals(expectedResult, result);
    }

}