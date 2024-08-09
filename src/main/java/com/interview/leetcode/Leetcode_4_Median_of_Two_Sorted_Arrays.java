package com.interview.leetcode;

import java.util.Arrays;

/**
 * ===============================================
 *
 * @Author: quocgiangnguyen (Bzman.hn@gmail.com)
 * Link: https://leetcode.com/problems/median-of-two-sorted-arrays
 * Difficulty Level (Easy, Medium, Hard): Hard
 * Language: Java
 * Date: 8/9/24, 12:47 PM (US-Eastern Time)
 * ===============================================
 * Detail:
 * ===============================================
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * <p>
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * <p>
 * Constraints:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 **/
public class Leetcode_4_Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArraysSolution1(int[] nums1, int[] nums2) {
        //Get the sizes of both input arrays
        int n = nums1.length;
        int m = nums2.length;

        //Merge 2 arrays to a single sorted array.
        int[] mergedArray = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            mergedArray[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            mergedArray[k++] = nums2[i];
        }

        //Sort the merged array
        Arrays.sort(mergedArray);

        //Calculate the total number of elements in the merge array.
        int total = mergedArray.length;
        if (total % 2 == 0) {
            //if the total number of elements is event, calculate the average of the two middle elements as the median result.
            int mid1 = mergedArray[total / 2 - 1];
            int mid2 = mergedArray[total / 2 ];
            return ((double) mid1 + (double) mid2) / 2.0;
        }else {
            return mergedArray[total / 2];
        }
    }
    public double findMedianSortedArraysSolution2(int[] nums1, int[] nums2) {
        return 2.0;
    }
}
