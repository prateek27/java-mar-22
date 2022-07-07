package com.prateek.javapractice.LinkedList;

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

public class LinkedListDemo {

    static Node createLL(int N){
        /* Loop to create linked list of nodes from 1 to N */
        Node head = new Node(1);
        Node tail = head;

        for(int i=2; i<=N; i++){
            tail.next = new Node(i);
            tail = tail.next;
        }
        return head;
    }

    static void printLL(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    static int length(Node head){
        Node temp = head;
        int c = 0;
        while(temp!= null){
            c = c + 1;
            temp = temp.next;
        }
        return c;
    }

    static Node insertAtHead(Node head, int data){
            Node n = new Node(data);
            n.next = head;
            return n; //return the new head
    }

    static Node insertAtPos(Node head,int data,int pos){

        if(pos==0){
            return insertAtHead(head,data);
        }
        if(pos > length(head)){
            return head;
        }

        Node temp = head;
        for(int jump=1; jump<=pos-1; jump++){
            temp = temp.next;
        }
        Node n = new Node(data);
        n.next = temp.next;
        temp.next = n;

        return head;
    }



    public static void main(String[] args) {

        Node linkedList = createLL(7);
        printLL(linkedList);
        linkedList = insertAtHead(linkedList,100); //updating the head
        printLL(linkedList);

        linkedList = insertAtPos(linkedList,300,8);
        printLL(linkedList);

        /* Linked List 3 nodes, by adding at tail
        Node head = new Node(1);
        Node tail = head;

        tail.next = new Node(2);
        tail = tail.next;
        tail.next = new Node(3);
        tail = tail.next; */


        /* Linked List with just 2 nodes
        Node n1 = new Node();
        n1.data = 5;

        Node n2 = new Node();
        n2.data = 7;

        n1.next = n2;

        System.out.println(n1.data);
        System.out.println(n1.next.data); */
    }

}
