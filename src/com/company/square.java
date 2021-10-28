package com.company;

import java.util.Scanner;

public class square extends shape
{

    // Overloaded function to
    // calculate the area of the square
    // It takes one float parameter
    public void setArea(float l)
    {
        System.out.println("Area of the square: "+ l * l);
    }

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for side : ");
        l = sc.nextFloat();
    }
}