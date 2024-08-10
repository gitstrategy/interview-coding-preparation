package com.interview.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode_4_Median_of_Two_Sorted_ArraysTest {

    @Test
    void findMedianSortedArrays_Solution1_testcase1() {
        //given
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        //when
        Leetcode_4_Median_of_Two_Sorted_Arrays test = new Leetcode_4_Median_of_Two_Sorted_Arrays();
        //then
        assertEquals(2.0, test.findMedianSortedArraysSolution1(nums1, nums2));
    }
    @Test
    void findMedianSortedArrays_Solution1_testcase2() {
        //given
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};
        //when
        Leetcode_4_Median_of_Two_Sorted_Arrays test = new Leetcode_4_Median_of_Two_Sorted_Arrays();
        //then
        assertEquals(2.5, test.findMedianSortedArraysSolution1(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays_Solution2_testcase1() {
        //given
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        //when
        Leetcode_4_Median_of_Two_Sorted_Arrays test = new Leetcode_4_Median_of_Two_Sorted_Arrays();
        //then
        assertEquals(2.0, test.findMedianSortedArraysSolution2(nums1, nums2));
    }
    @Test
    void findMedianSortedArrays_Solution2_testcase2() {
        //given
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};
        //when
        Leetcode_4_Median_of_Two_Sorted_Arrays test = new Leetcode_4_Median_of_Two_Sorted_Arrays();
        //then
        assertEquals(2.5, test.findMedianSortedArraysSolution2(nums1, nums2));
    }
    @Test
    void findMedianSortedArrays_Solution3_testcase1() {
        //given
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        //when
        Leetcode_4_Median_of_Two_Sorted_Arrays test = new Leetcode_4_Median_of_Two_Sorted_Arrays();
        //then
        assertEquals(2.0, test.findMedianSortedArraysSolution3(nums1, nums2));
    }
    @Test
    void findMedianSortedArrays_Solution3_testcase2() {
        //given
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};
        //when
        Leetcode_4_Median_of_Two_Sorted_Arrays test = new Leetcode_4_Median_of_Two_Sorted_Arrays();
        //then
        assertEquals(2.5, test.findMedianSortedArraysSolution3(nums1, nums2));
    }
}