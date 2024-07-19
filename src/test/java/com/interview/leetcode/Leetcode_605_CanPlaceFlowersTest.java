package com.interview.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Leetcode_605_CanPlaceFlowersTest {

    @Test
    void canPlaceFlowers_has_place() {
        //given
        final int[] flowerBed = {1,0,0,0,1};
        final int n = 1;
        //when
        Leetcode_605_CanPlaceFlowers test = new Leetcode_605_CanPlaceFlowers();
        //then
        Assertions.assertTrue(test.canPlaceFlowers(flowerBed,n));
    }

    @Test
    void canPlaceFlowers_has_no_place() {
        //given
        final int[] flowerBed = {1,0,0,0,0,1};
        final int n = 2;
        //when
        Leetcode_605_CanPlaceFlowers test = new Leetcode_605_CanPlaceFlowers();
        //then
        Assertions.assertFalse(test.canPlaceFlowers(flowerBed,n));
    }

    @Test
    void canPlaceFlowersBetterSolution_has_place() {
        //given
        final int[] flowerBed = {1,0,0,0,1};
        final int n = 1;
        //when
        Leetcode_605_CanPlaceFlowers test = new Leetcode_605_CanPlaceFlowers();
        //then
        Assertions.assertTrue(test.canPlaceFlowersBetterSolution(flowerBed,n));
    }

    @Test
    void canPlaceFlowersBetterSolution_has_no_place() {
        //given
        final int[] flowerBed = {1,0,0,0,0,1};
        final int n = 2;
        //when
        Leetcode_605_CanPlaceFlowers test = new Leetcode_605_CanPlaceFlowers();
        //then
        Assertions.assertFalse(test.canPlaceFlowersBetterSolution(flowerBed,n));
    }
}