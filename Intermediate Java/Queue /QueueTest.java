package com.prateek.javapractice;

public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.pop();
        q.pop();
        q.push(7);
        q.push(8);

        while(!q.empty()){
            System.out.println(q.getFirst());
            q.pop();
        }
    }
}
