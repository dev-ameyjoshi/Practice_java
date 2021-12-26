package com.company;


public class ExTest {

    int ml() {
        try {

            return 10;

        }catch (ArithmeticException ae) {

            return 20;

        }
        finally
        {
            return 30;
        }
    }
    public static void main(String [] args){

        ExTest e= new ExTest ();
        int x=e.ml();

        System.out.println(x);

    }}

//Type of question may come in MSE
