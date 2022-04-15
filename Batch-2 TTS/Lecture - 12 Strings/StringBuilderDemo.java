package com.prateek.javaMarchB2.StringsB2;

public class StringBuilderDemo {

    public static void main(String[] args) {
        // fixed size
        char[] arr = new char[20];

        // more dynamic (grow as per demand) & more powerful
        // string builder -> freq modifications like insert, delete, update, concatenate on strings
        StringBuilder sb = new StringBuilder("hello"); // 16 + leng of hello
        // Constraints: N <=1000
        sb.ensureCapacity(1000); //save time
        sb.append("world");
        sb.insert(1,"iii");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);

        // string ... => don't modify the string
        // string builder => modify the underlying character array, dynamic array of chars
        // character array => its not dynamic, i have write my own logic
        // arraylist => dynamic array of objects(strings/stringbuilder/Character Wrapper Class)

        // Convert a string builder into string (finally after doing all the modifications)
        System.out.println(sb.toString());
    }
}
