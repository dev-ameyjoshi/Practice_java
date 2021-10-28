package com.company;

import java.util.Scanner;

public class shape {
    protected float l,b;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values : ");

        l = sc.nextFloat();
        b = sc.nextFloat();
    }
//        side = sc.nextFloat();
        public void setArea() {
            System.out.println("In base class");
        }

        public float getL() {
            return l;
        }

        public float getB() {
            return b;
        }

}
