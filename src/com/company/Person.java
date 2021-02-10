package com.company;

import javax.swing.text.SimpleAttributeSet;

public class Person {
    public int age;
    public String name;

    public Person (int a, String n){
        age = a;
        name = n;
    }

    public Person (String n, int a){
        age = a;
        name = n;
    }
}
