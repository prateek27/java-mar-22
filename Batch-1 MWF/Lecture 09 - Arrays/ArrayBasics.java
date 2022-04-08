package com.prateek.javaMarchB2.arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        // hardcoded array
        int[] marks = {10,20,40,60,80}; //5 elements
        System.out.println(marks.length);

        // update
        marks[0] += 2;

        //print 0th element
        System.out.println(marks[0]);

        //print rest elements
        for(int i=0; i< marks.length; i++){
            System.out.print(marks[i] + ",");
        }
        System.out.println();

        // for each loop (traverse entire array)
        for(int student_marks : marks){
            System.out.print(student_marks + ",");
        }
    }
}
