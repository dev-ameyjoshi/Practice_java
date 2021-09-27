package com.company;

public class studentDetails {
    private final int roll ;
    private final static String college_name ="VIT";
    private  final String name;
    private static int counter;
    static{
        counter = 100;
    }
    public studentDetails(String name){
        this.name=name;
        this.roll=counter;
        counter++;
    }

    public int getRoll(){
        return roll;
    }

    public String getname(){
        return name;
    }
    public String getCollege_name(){
        return college_name;
    }

    public static void main(String [] args){
        studentDetails student1 = new studentDetails("Manish");

        studentDetails student2 = new studentDetails("Ram");

        studentDetails student3 = new studentDetails("Ritesh");


        studentDetails [] students = {student1,student2,student3};
        for (studentDetails d: students){
        System.out.println("Student name: "+d.getname());
        System.out.println("Roll number: "+d.getRoll());
        System.out.println("College: "+d.getCollege_name());
        System.out.println("\n");
        }




//        System.out.println("Student name: "+student2.getname());
//        System.out.println("Roll number: "+student2.getRoll());
//        System.out.println("College: "+student2.getCollege_name());
//        System.out.println("\n");
//
//        System.out.println("Student name: "+student3.getname());
//        System.out.println("Roll number: "+student3.getRoll());
//        System.out.println("College: "+student3.getCollege_name());


    }
}

//enhanced for loop (datatype element : arrayName){}







