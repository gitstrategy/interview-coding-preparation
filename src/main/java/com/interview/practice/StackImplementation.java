package com.interview.practice;

public class StackImplementation {

    class Stack {
        private int array[];
        private int top;
        private int capacity;

        Stack(int capacity) {
            this.array = new int[capacity];
            this.capacity = capacity;
            this.top = -1;
        }

        public void push(int item) {
            if (isFull()) {
                throw new RuntimeException("Stack is full!");
            }
            array[++top] = item;
        }

        public int pop() {
            if (isEmply()) {
                throw new RuntimeException("Stack is empty!");
            }
            return array[--top];
        }

        public int peek() {
            return array[top];
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public boolean isEmply() {
            return top == -1;
        }
    }
}
