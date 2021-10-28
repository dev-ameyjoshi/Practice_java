package com.company;
import java.util.Scanner;


public class practiceProblem02 {
    public static void main(String[] args) {

        int x, y, sum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        x = sc.nextInt();

        System.out.print("Enter the second number: ");
        y = sc.nextInt();

        if( x == y){
            sum = x + y;
            System.out.println("The Sum is :" + sum);
        }else{
            sum = (x+y) * 2;
            System.out.println("The double of the sum is  :" + sum);
        }

    }


}
