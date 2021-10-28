package com.company;
import java.util.Scanner;

public class Arrayaddpair {
    static void display(int arr[]){
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"");
        }
    }

    static int[] getArray(){
       int []arr = new int[] {1,2,3,4};
       return arr;
    }
    public static void main(String[]args){
//        int arr[];
//         arr[] = new int[3];
//         arr[0] = 12;
//         arr[1]=4;
//         int arr[]={12,4,5};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = scan.nextInt();


//         int arr[] = new int[n];
//        System.out.println("Enter the array elements");
//        for(int i = 0;i<arr.length;i++)
//        {
//            arr[i]=scan.nextInt();
//        }
        int[]arr = getArray();
        display(arr);
        scan.close();
    }
}
