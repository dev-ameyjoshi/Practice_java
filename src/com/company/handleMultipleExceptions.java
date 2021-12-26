package com.company;
import java.util.Scanner;

public class handleMultipleExceptions
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("1.Divide by zero\n" +"2.Array index out of bounds exception\n" + "3.Null pointer Exception");
        choice = sc.nextInt();
        String str = null;
        int i;

        switch(choice) {
            case 1 -> {
                try {
//            Arithmetic Exception
                    int numOne = sc.nextInt();
                    int output = numOne / 0;
                    System.out.println(output);


                } catch (ArithmeticException ae) {
                    System.out.println("You should not divide a number by zero");
                }

            }
            case 2-> {
                try {
                    int array[] = {1, 2, 3, 4, 5};
                    System.out.println("Enter the index:");
                    i = sc.nextInt();
                    System.out.println(array[i]);


                } catch (ArrayIndexOutOfBoundsException aiob) {
                    System.out.println("OOPs!!!Array Index out of bounds for length 5.");
                }
            }
            case 3 -> {
                try {

//            NullPointerException

                    System.out.println(str.length());

                } catch (NullPointerException e) {
                    System.out.println("Null Pointer Exception arises!!");
                }
            }


        }


        }
    }

