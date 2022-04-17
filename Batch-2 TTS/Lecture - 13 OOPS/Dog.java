package com.prateek.javaMarchB2.OOPS2;

public class Dog {
    //data members
    private int age;
    String name;
    String breed;

    // Special Function -> Constructor = same as class name
    // automaticlly when we create new object of this class
    // Default Constructor
    Dog(){
        age = 1; //default values to class data when the constructor is called
        System.out.println("Making a Dog object");
    }

    // Parameterised Constructor
    Dog(int dogAge, String dogName, String dogBreed){
        System.out.println("Making a Parametrised Dog object");
        age = dogAge;
        name = dogName;
        breed = dogBreed;
    }

    void introduce(){
        System.out.println("Name " + name + " Breed " + breed);
        if(age>0) {
            System.out.println("I m " + age + "yrs old");
        }
    }
    void setAge(int dogAge){
        //add my own validation logic here
        if(dogAge > 0 ){
            age = dogAge;
        }
        else{
            age = 1;
        }
    }

    int getAge(){
        return age;
    }

    void bark(){
        if(age>3){
            System.out.println("Woof Woof Woof Woof!");
        }
        else {
            System.out.println("Whop Whop!");
        }
    }
}
