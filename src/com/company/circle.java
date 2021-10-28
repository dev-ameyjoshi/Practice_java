package com.company;

import java.util.Scanner;

public class circle extends shape
{



    public void setArea(float l)
    {
        float A = 3.14f * l *  l;

        System.out.println("The area of the circle is :" + A);
    }
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for side : ");
        l = sc.nextFloat();
    }

}
