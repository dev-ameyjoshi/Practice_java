package com.company;

public class Exception_problems_01 {
    public static void main(String[] args) {
        try{
//            Arithmetic Exception
            int numOne = 60;
            int numTwo = 0;
            int output = numOne/numTwo;
            System.out.print(output);

        }catch (ArithmeticException e){
            System.out.println("Number divided by zero gives Arithmetic exception handling");

        }

    }
}
