package com.company;
import java.util.Scanner;


public class practiceProblem03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number : ");
        float first = sc.nextFloat();

        System.out.println("Enter The First Number : ");
        float second = sc.nextFloat();

        System.out.println("Enter The First Number : ");
        float third = sc.nextFloat();

        float numerator = first + second + third;
        float average = numerator/3;

        System.out.printf("The average of the three numbers is : %.2f ",average);




    }
}
