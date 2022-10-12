package Ds_algo;

import java.util.Scanner;
import java.io.*;
public class majority_element {

    //function to find the majority element in the array.
    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            // update maxCount if count of
            // current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n / 2)
            System.out.println(arr[index]);
        else
            System.out.println("No Majority Element");
    }
    // Driver code
    public static void main(String[] args)

    {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
//        int m;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your Array Values : ");
//        m = sc.nextInt();
//        int arr[] = new int[10];
//        for(int i =0;i<m;i++){
//            arr[i] = sc.nextInt();
//        }
        int n = arr.length;
        // Function calling
        findMajority(arr, n);
    }
}
