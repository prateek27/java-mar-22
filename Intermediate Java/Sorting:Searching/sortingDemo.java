package com.prateek.javapractice;

import java.util.Arrays;
import java.util.Comparator;

public class sortingDemo {

    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{3,4},{0,2},{1,4}};

        // sort according to the x-values
        Arrays.sort(coordinates, (int[] pair1, int pair2[]) -> ( pair1[0]  - pair2[0]));
        Arrays.sort(coordinates, Comparator.comparingInt((int[] o) -> o[0]));
        System.out.println(Arrays.deepToString((coordinates)));

        // sort according distance from origin
        Arrays.sort(coordinates, (int[] o1, int o2[]) -> ( (o1[0]*o1[0] + o1[1]*o1[1])  - (o2[0]*o2[0] + o2[1]*o2[1])));
        Arrays.sort(coordinates, Comparator.comparingInt((int[] o) -> (o[0] * o[0] + o[1] * o[1])));
        System.out.println(Arrays.deepToString((coordinates)));
        // sort
        // Array.sort(books, (Book b1, Book b2)->(b1.price - b2.price)));

        // sort according to the distance from origin
        char[] arr = {'b','a','t','m','a','n'};
        Arrays.sort(arr); //modifies the same array without returning anything
        System.out.println(arr);

    }


}
