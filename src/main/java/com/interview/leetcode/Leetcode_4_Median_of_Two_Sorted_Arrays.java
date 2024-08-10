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
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * Constraints:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 **/
public class Leetcode_4_Median_of_Two_Sorted_Arrays {
    /**
     * Approach 1: Merge and Sort
     * Create a new array with a size equal to the total number of elements in both input arrays.
     * Insert elements from both input arrays into the new array.
     * Sort the new array.
     * Find and return the median of the sorted array.
     * Time Complexity
     * In the worst case TC is O((n + m) * log(n + m)).
     * Space Complexity
     * O(n + m), where ‘n’ and ‘m’ are the sizes of the arrays.
     */
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
            int mid2 = mergedArray[total / 2];
            return ((double) mid1 + (double) mid2) / 2.0;
        } else {
            return mergedArray[total / 2];
        }
    }

    /**
     * Approach 2: Two-Pointer Method
     * Initialize two pointers, i and j, both initially set to 0.
     * Move the pointer that corresponds to the smaller value forward at each step.
     * Continue moving the pointers until you have processed half of the total number of elements.
     * Calculate and return the median based on the values pointed to by i and j.
     * Time Complexity
     * O(n + m), where ‘n’ & ‘m’ are the sizes of the two arrays.
     * Space Complexity
     * O(1).
     */
    public double findMedianSortedArraysSolution2(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, k1 = 0, k2 = 0;

        // Find median.
        for (int count = 0; count <= (n + m) / 2; count++) {
            k2 = k1;
            if (i != n && j != m) {
                if (nums1[i] > nums2[j]) {
                    k1 = nums2[j++];
                } else {
                    k1 = nums1[i++];
                }
            } else if (i < n) {
                k1 = nums1[i++];
            } else {
                k1 = nums2[j++];
            }
        }

        // Check if the sum of n and m is odd.
        if ((n + m) % 2 == 1) {
            return (double) k1;
        } else {
            double res = (double) k1 + (double) k2;
            return res / 2.0;
        }

    }

    /**
     * Approach 3: Binary Search
     * Use binary search to partition the smaller of the two input arrays into two parts.
     * Find the partition of the larger array such that the sum of elements on the left side of the partition in both arrays is half of the total elements.
     * Check if this partition is valid by verifying if the largest number on the left side is smaller than the smallest number on the right side.
     * If the partition is valid, calculate and return the median.
     * Time Complexity
     * O(logm/logn)
     * Space Complexity
     * O(1)
     */
    public double findMedianSortedArraysSolution3(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        //Ensure num1 is the smaller array for simplicity
        if (n1 > n2) {
            return findMedianSortedArraysSolution3(nums2, nums1);
        }
        int n = n1 + n2;
        int left = (n1 + n2 + 1) / 2; //Calculate the left partition size
        int low = 0, high = n1;

        while (low <= high) {
            int mid1 = (low + high) >>> 1; //Calculate mid index for nums1
            int mid2 = left - mid1; //Calculate mid index for nums2
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE, k1 = Integer.MAX_VALUE, k2 = Integer.MAX_VALUE;
            //Determine values of l1,l2,k1,k2
            if (mid1 < n1)
                k1 = nums1[mid1];
            if (mid2 < n2)
                k2 = nums2[mid2];
            if (mid1 - 1 >= 0)
                l1 = nums1[mid1 - 1];
            if (mid2 - 1 >= 0)
                l2 = nums2[mid2 - 1];

            if (l1 <= k2 && l2 <= k1) {
                // The partition is correct, we found the median
                if (n % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return ((double) (Math.max(l1, l2) + Math.min(k1, k2))) / 2.0;
            } else if (l1 > k2) {
                // Move towards the left side of nums1
                high = mid1 - 1;
            } else {
                // Move towards the right side of nums1
                low = mid1 + 1;
            }
        }
        return 0; // If the code reaches here, the input arrays were not sorted.
    }
}
