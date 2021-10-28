package newcompany;

import  java.util.Scanner;

public class CH_05_UserInput {
    public static void main(String[] args) {
//      sout -> System.out.print.ln
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("The sum of these numbers " + sum);

//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        will written true if its an integer
//        use to check a valid value.

//        String str = sc.next();
//        System.out.println(str);  takes one word

        String str = sc.nextLine();
        System.out.println(str);
//        Will read entire line





    }
}
