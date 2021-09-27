package com.company;
import java.util.Scanner;
public class Arraydemo {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no.of subjects");
        int n = scan.nextInt();
        int [] marks = new int[n];

        for(int i = 0;i<n;i++){
            marks[i] = scan.nextInt();

        }
        int total = 0;
        for(int i =0;i<n;i++){
            total +=marks[i];
        }
        System.out.println("Total marks:"+total);

        float percentage = total/n;
        System.out.printf("Percentage : %.2f",percentage);
        scan.close();


    }
}
