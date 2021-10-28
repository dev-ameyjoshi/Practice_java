package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class RArray {
    private int []arr;
    private int targetSum;

    public RArray(int arrSize){
        arr = new int[arrSize];
        targetSum = 0;
    }

    public void getData(int arrSize){
        System.out.println("Enter the Array Elements :");
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arrSize;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter Target Sum:");
        targetSum= sc.nextInt();
        System.out.println("Array is :" + Arrays.toString(arr));

        sc.close();
    }
    public int [] numSum(int arrSize){
        int arr1[] = new int[0];

        for(int i = 0;i<arrSize;i++){
            for(int j = i+1;j<arrSize;j++){
                if(arr[i]+arr[j] == targetSum){
                    arr1 = new int[]{arr[i],arr[j]};
                    return arr1;
                }
            }
        }
        return arr1;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int arrSize = sc.nextInt();
        RArray obj = new RArray(arrSize);
        obj.getData(arrSize);

        System.out.println("The target sum is : " + obj.targetSum);

        int [] resultArray = obj.numSum(arrSize);

        System.out.println("Resultant Array Element Pair is:" + Arrays.toString(resultArray));
        sc.close();
    }
}
