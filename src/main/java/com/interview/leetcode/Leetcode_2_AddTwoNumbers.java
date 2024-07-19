package com.interview.leetcode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * Difficulty level: Medium
 * Language: Java
 */
public class Leetcode_2_AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int MAX_VALUE = 101;
        ListNode result = new ListNode();
        boolean isPlus = false;
        int resultVal = 0;
        while (l1 != null || l2 != null) {
            if (isPlus) {
                resultVal += 1;
            }
            if (l1 != null) {
                resultVal = resultVal + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                resultVal = resultVal + l2.val;
                l2 = l2.next;
            }
            if (resultVal / 10 > 0) {
                resultVal = resultVal % 10;
                isPlus = true;
            }

        } return new ListNode(resultVal);
    }
}
