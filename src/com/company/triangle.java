package com.company;

import java.util.Scanner;

public class triangle extends shape {



      public  void setArea(float l ,float b)
        {
            System.out.println("Area of the triangle: " + 0.5f * l * b);
        }
        public void getInput(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter values for l and b : ");
            l = sc.nextFloat();
            b = sc.nextFloat();
        }


}
