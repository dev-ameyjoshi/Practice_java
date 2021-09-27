package newcompany;

import  java.util.Scanner;

public class CH_05_UserInput {
    public static void main(String[] args) {
//      sout -> System.out.print.ln
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these numbers " + sum);


    }
}
