package com.prateek.javapractice;

public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);

        // see all elements
        while(!s.empty()){
            int x = s.top();
            System.out.println(x);
            s.pop();
        }

        /*
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(5);
        myStack.push(7);
        System.out.println(myStack.peek()); */

    }
}
