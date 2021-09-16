package com.company;

public class Person {
    String name;
    int age;
    String address;

    public Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address= address;
    }
    public void display(){
        System.out.println(name + ""+ age + ""+address);
    }

    public static void main(String[]args){
        Person p = new Person("Donald ",20," Pune");
        Person p1 = new Person("Duck ",21," Mumbai");
        p.display();
        p1.display();
    }
}
