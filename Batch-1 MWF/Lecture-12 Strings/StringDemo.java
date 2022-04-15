package com.prateek.javaMarchB2.Strings;

import java.util.Locale;
import java.util.Scanner;

public class StringDemo {

    public static void stringBasics(){
        String a = "Hello";
        String b = "Hello";
        String c = b;

        if(a==b && b==c && a==c){
            System.out.println("They are equal");
        }
        else {
            System.out.println("Not equal");
        }
        System.out.println(a);
        System.out.println(a.length());

        // one more way
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";


        if(s1==s2){
            System.out.println("S1 and S2 are equal");
        }
        else{
            System.out.println("Not equal");
        }

        // compare
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Hello"));
        System.out.println(s1.equals("Password"));

        // immutable, string can't be modified
        System.out.println(s1.charAt(0));

        //char array
        char arr[] = s1.toCharArray(); //copy of string inside array but actual string remains same
        arr[0] = 'B';
        System.out.println(arr);
        System.out.println(s1);
        s1 = new String(arr);
        System.out.println(s1);

        System.out.println(arr.length);
        System.out.println(s1.length());
    }
    public static void readInput(){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        //consume the first enter
        sc.nextLine();
        int largestLen = 0;
        String largestString = "";

        for(int i=1; i<=n; i++){
            String line = sc.nextLine();
            if(line.length() > largestLen){
                largestString = line;
                largestLen = line.length();
            }
        }
        System.out.println(largestString);
    }
    public static void printOcc(){
        String doc = "this is a very large document on java, java can handle large numbers which are used for large ....";
        String word = "doc";
        int idx = doc.indexOf(word);
        while(idx!=-1){
            System.out.println(idx);
            //find the next occ
            // searching internally
            idx = doc.indexOf(word,idx+1);
        }
    }

    public static void filterFiles(){
        String[] filenames = {"img1.jpg", "img2.png","d1.pdf","d3.pdf","apple.pdf","disc.sys" ,"image2pdf.jpg"};
        for(String f : filenames){
            if(f.endsWith(".pdf")){
                System.out.println(f);
            }
        }
    }


    public static void main(String[] args) {
        // readInput();
        printOcc();
        filterFiles();
        // play with string inbuilt functions
        String s = "I love mango shake";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);
        s= s.replace("mango","apple");
        System.out.println(s);

        if(s.contains("shake")){
            System.out.println("yes it is a shake");
        }

        String name = " Prateek  ";
        System.out.println(name.length());
        System.out.println(name.strip()); // removes the white space
        System.out.println(name.strip().length());

        // String concatenation
        String h1 = "Hello" + "World";
        System.out.println(h1);
        System.out.println("Hello " + 7);

        String greet = "Hi everyone Hi all";
        System.out.println(greet.indexOf("Hi"));
        System.out.println(greet.indexOf("Hi",1));
        System.out.println(greet.indexOf("Hi",22));


        /*
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.println(firstName);
        System.out.println(lastName);

        sc.nextLine(); //to consume the first enter
        String line = sc.nextLine();

        System.out.println(line.stripLeading());
         */

    }
}
