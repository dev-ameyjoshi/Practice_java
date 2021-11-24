package com.company;

public class Exception_Problem_02 {
    public static void main(String[] args) {
        try{
            int a[]=new int[10];

            a[11] = 9;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofbounds");
        }
    }
}
