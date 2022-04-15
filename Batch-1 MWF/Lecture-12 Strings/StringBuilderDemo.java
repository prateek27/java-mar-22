package com.prateek.javaMarchB2.Strings;

public class StringBuilderDemo {
    // String are immutable but string builder support modifications (mutable) => fast
    // sometime we might operations like editing a string, inserting, removing, appending ...
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.capacity()); //optional
        // ensure that the underlying has min capacity of 1000 characters (memory will expand)
        sb.ensureCapacity(1000);
        System.out.println(sb.capacity());
        sb.insert(1,"iii");
        sb.append("world");
        System.out.println(sb.toString());

        //constrains N<=1000
        System.out.println(sb);
    }
}
