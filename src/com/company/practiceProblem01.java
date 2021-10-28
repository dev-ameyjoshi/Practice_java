package com.company;
import java.util.Scanner;

public class practiceProblem01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int sizeArr = sc.nextInt();

        int[] Arr = new int[sizeArr];

        System.out.println("Enter the elements : ");


        for (int i = 0; i < sizeArr; i++)
        {
           Arr[i] = sc.nextInt();
        }

        int sumEven = 0;

        for (int i = 0; i < sizeArr; i++)
        {
            if (Arr[i] % 2 == 0) {
                sumEven += Arr[i];
            }
        }

        System.out.println("Sum of all even numbers  is : " + sumEven);
    }
}
