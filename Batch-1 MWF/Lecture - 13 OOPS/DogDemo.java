package com.prateek.javaMarchB2.OOPS;

public class DogDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog(); //new object
        d1.name = "Bruno";
        // d1.age = -12;
        d1.setAge(-20);

        Dog d2 = new Dog("cruto",5,"goldenretriever");

        System.out.println(d1.name + " fighting with "  + d2.name);
        d1.introduce();
        d1.celebrateBirthday();

        d2.introduce();
        d1.setAge(-12);
        // System.out.println(d1.age);
        System.out.println(d1.getAge());
    }
}
