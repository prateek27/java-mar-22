package com.prateek.javaMarchB2.OOPS2;


public class DogTest {
    public static void main(String[] args) {

        Dog d1 = new Dog(); // default
        d1.name = "Bruno";
        // dont allow d1.age = 5;
        d1.breed = "goldenret";

        d1.bark();

        // ....
        // d1.age = -15;
        d1.setAge(12);
        d1.introduce();
        System.out.println(d1.getAge());

        Dog d2 = new Dog(7,"Cody","shepherd"); // parameterised constructor
        d2.introduce();
        d2.bark();
    }
}
