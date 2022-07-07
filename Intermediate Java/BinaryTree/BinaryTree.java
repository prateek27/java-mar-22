package com.prateek.javapractice.BinaryTree;

import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int d){
        data = d;
        left = right = null;
    }
}


public class BinaryTree {
    //data
    private Node root;

    // methods
    BinaryTree(){
        // read tree
        Scanner sc = new Scanner(System.in);
        root = buildTree(sc);

    }

    Node buildTree(Scanner sc){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        Node temp = new Node(data);
        temp.left = buildTree(sc);
        temp.right = buildTree(sc);
        return temp;
    }

    void print(){
        this.inOrderPrint(root);
    }

    void preOrderPrint(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }
    void inOrderPrint(Node root){
        if(root==null){
            return;
        }

        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }
    void postOrderPrint(Node root){
        if(root==null){
            return;
        }
        postOrderPrint(root.left);
        postOrderPrint(root.right);
        System.out.print(root.data + " ");
    }

    int getHeight(){
        return height(root);
    }

    //internal logic,should not be exposed to outside world
    private int height(Node root){
        if(root==null){
            return 0;
        }
        int h1 = height(root.left);
        int h2 = height(root.right);
        return Math.max(h1,h2) + 1;
    }

    int sum(){
        return sumOfNodes(root);
    }

    private int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
}
