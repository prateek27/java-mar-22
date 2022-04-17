package com.prateek.javaMarchB2.OOPS;

// Like a Template
public class Dog {
    String name;
    String breed;

    private int age; //no direct outside access

    // Special function (Constructor) -> For constructing objects
    Dog(){
        System.out.println("making a dog object");
        //set default age
        age = 1;
    }

    Dog(String n,int a, String b){
        System.out.println("making a dog object - parameter constructor");
        name = n;
        age = a;
        breed = b;
    }

    // Functionality Later on ...
    void introduce(){
        System.out.println("Hi, I am "+ name);
        if(age>0){
            System.out.println("I am " +age +" yrs old");
        }
    }
    //Getter
    int getAge(){
        return age;
    }

    // Setter: Setting some property
    void setAge(int newAge){
        if(newAge>=1){
            age = newAge;
        }
    }

    void celebrateBirthday(){
        System.out.println("Happy Birthday");
        age = age + 1;
    }
}
