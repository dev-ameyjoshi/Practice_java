package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Adder {
    final private int []A;
     private int target;
    public Adder(int arr){
        A = new int[arr];
        target = 0;
    }

    public int[] findPair(int arr) {
            int arr1[] = new int[0];


        for (int i = 0; i < arr; i++)
        {

            for (int j = i + 1; j < arr; j++)
            {

                if (A[i] + A[j] == target)
                {
                    arr1 = new int[]{A[i],A[j]};
                    return arr1;

                }
            }
        }

        return arr1;
    }

    
    public void  getData( int arr) {


        System.out.print("Enter the number of elements you want to store: ");
        Scanner sc= new Scanner(System.in);

        for(int i=0; i<arr; i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter target sum:");
        target = sc.nextInt();

        System.out.println("Array : " + Arrays.toString(A));
        sc.close();



    }

        public static void main (String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your Array Size:");

            int arr = sc.nextInt();
            Adder obj = new Adder(arr);

            obj.getData(arr);
            System.out.println("Target Sum : " + obj.target);

            int [] resultArr = obj.findPair(arr);
            System.out.println("Output  : " + Arrays.toString(resultArr));

            sc.close();


        }
    }

