package com.prateek.javapractice;

// Fixed Size Queue
public class Queue {
    // Queue of Ints
    int arr[];
    int front;
    int rear;
    int cs;
    int N;

    Queue(int defaultSize){
        N= defaultSize;
        arr = new int[N];
        front = 0;
        rear = 0;
    }

    void push(int x){ //push is also known as enqueue
        //if q is not full
        if(!full()) {
            arr[rear] = x;
            rear = (rear + 1) % N;
            cs++;
        }
        else{
            System.out.println("cant insert " + x + "as queue is full");
        }
    }

    void pop(){
        if(!empty()) {
            front = (front + 1) % N;
            cs--;
        }
    }

    int getFirst(){
        if(!empty()){
            return arr[front];
        }
        else{
            System.out.println("Error: Queue is Empty");
            return -1;
        }
    }

    boolean empty(){
        return cs==0;
    }
    boolean full(){
        return cs==N;
    }
}
