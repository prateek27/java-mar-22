package com.prateek.javaMarchB2.StringsB2;

import java.util.Scanner;

public class StringClassDemo {

    public static void stringBasics(){

        // Character Array can be Modified (Mutable)
        char[] arr = {'a','b','c'};
        arr[0] = 'b';
        char[] name = new char[20];
        System.out.println(arr);

        // Strings are immutable (their value can't change)
        String s = "abc";
        s = "apple"; // create a new string object in the memory?
        // s[0] = 'b'; not supported
        // s.charAt(0) = 'b';
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s);

        // you can also get a copy of the char array from string
        // Conversions: string <==> char array


        char[] arrch = {'a','b','c','s','t'};
        // Char Array to String
        String a = new String(arrch);
        arrch[0] = 'x';
        System.out.println(arrch);
        System.out.println(a);

        // String to Char Array
        String b = "hello";
        char[] barr = b.toCharArray();
        System.out.println(b);
        System.out.println(barr);
        barr[0] = 'b';
        System.out.println(barr);
        b = new String(barr);
        System.out.println(b);
    }
    public static void stringComparison(){
        // String Pool was created to optimise string storage and reduce redundant storage
        String s1 = "hello";
        String s2 = "hello";

        System.out.println("s1 == s2" + (s1==s2));
        System.out.println("s1 equals s2" + (s1.equals(s2)));

        String a = new String("hello");
        String b = new String("hello");
        System.out.println("a==b " + (a==b));
        System.out.println("a equals b " + a.equals(b)); // b.equals(a) or a.equals(b)
    }
    public static void playWithUpperCase(){
        String s = "I love reading books";
        System.out.println(s.toUpperCase()); // doesnt change 's'
        s = s.toUpperCase(); // s points to new object
        System.out.println(s);
    }
    public static void readALetter(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // the first token from the string input
        char letter = s.charAt(0);
        System.out.println(letter);
        System.out.println(s);
    }
    public static void largestString(){
        // read a number N, and then read N lines
        // print the largest string out of N strings that have been input
        // N = 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); //to discard the first '\n' //getline() C++

        int largest = 0;
        String largestString = "";

        for(int i=1; i<=n; i++) {
            String s = sc.nextLine();
            if(s.length() > largest){
                largest = s.length();
                largestString = s;
            }
            // System.out.println("You entered " + line1);
        }
        System.out.println(largestString);
    }
    // file searching system
    public static void filterImages(){
        String files[] = {"xyz.png","dsc1.jpg","dsc.pdf","dsc3.jpg","mynotes.pdf","png.pdf"};
        // find out the image files
        for(String f : files){
            if(f.endsWith(".png") || f.endsWith(".jpg")){
                System.out.println("Found an image " + f);
            }
        }
    }

    // Given an string, find the index of a given word inside that string
    public static void findLocation(){
        String doc = "we are learning java, java has many concepts, java is powerful";
        String word = "java";

        int idx = doc.indexOf(word);
        while(idx!=-1) {
            System.out.println(idx);
            idx = doc.indexOf(word, idx + 1);
        }
    }


    public static void main(String[] args) {
        findLocation();
        // Inputs and Outputs
        filterImages();
        // largestString();
        String juices = "i want apple juice";
        System.out.println(juices.contains("apple"));
        System.out.println(juices.contains("mango"));
        /*
        Scanner sc = new Scanner(System.in);
        String firstname = sc.next(); //first token
        String lastname = sc.next(); // second token
        String line = sc.nextLine();
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(line.strip()); */
    }
}
