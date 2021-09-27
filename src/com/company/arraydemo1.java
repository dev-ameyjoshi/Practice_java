package com.company;


class Student{
    public int rollNo;
    public String name;

    Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;

    }
}
public class arraydemo1 {
    public static void main(String[]args){
        Student[]  arr;
        arr = new Student[3];
        arr[0] = new Student(1,"Pratik");
        arr[1] = new Student(2,"Amey");
        arr[2] = new Student(3,"Ram");

        for(Student s:arr){
            System.out.println(s.rollNo + " " + s.name);
        }



    }
}
