package com.interview.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/design-hashset/description/
 * Difficulty level: Easy
 * Language: Java
 */
public class Leetcode_705_DesignHashSet {
    //range from 0 to 1000000
    class MyHashSet {

        private final int MAX_VALUE = 1000000;
        private final int ARRAY_SIZE = 100;
        private List<List<Integer>> parentLists;

        public MyHashSet() {
            parentLists = new ArrayList<>(ARRAY_SIZE);
            for (int i = 0; i < ARRAY_SIZE; i++) {
                parentLists.add(null);
            }
        }

        public void add(int key) {
            int index = key % ARRAY_SIZE;
            List<Integer> childList = parentLists.get(index);
            if (childList == null) {
                List<Integer> list = new LinkedList<>();
                list.add(key);
                parentLists.set(index, list);
            } else {
                if (!childList.contains(key)) {
                    childList.add(key);
                }
            }
        }

        public void remove(int key) {
            int index = key % ARRAY_SIZE;
            List<Integer> childList = parentLists.get(index);
            if (childList != null) {
                childList.remove(Integer.valueOf(key));
            }
        }

        public boolean contains(int key) {
            int index = key % ARRAY_SIZE;
            List<Integer> childList = parentLists.get(index);
            return childList != null && childList.contains(key);

        }
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
