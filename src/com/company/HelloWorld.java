package com.company;

public class HelloWorld {
    public static void main(String[]args){
        System.out.println("Hello World");
        int firstNo = 20;
        int secondNo = 30;
        int thirdNo = 50;
        int sum = firstNo + secondNo + thirdNo;
        System.out.println("Sum is :" + sum);
        System.out.println("The average is :" + sum/3);

        int divisor = 34;
        int dividend = 3400;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);

        int num = 5;
        for(int i = 1;i <=10;++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }

        int newNumber1 = 4;
        int newNumber2 = 3;
        if(newNumber1 % 2 == 0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }

        int p = 50;
        int b = 80;
        int c = 90;

        if(p>b & p>c){
            System.out.println(" p is greatest");
        }else if(b > c){
            System.out.println(" b is greatest");
        }else{
            System.out.println(" c is greatest");
        }

        int newnumber = 5;
        for(int j=0;j<=newnumber;j+=1){
            for(int k=0;k<j;k+=1){
                System.out.print("*");
            }
            System.out.println('\n');
        }
        System.out.println('\n');
        for (int i= newnumber; i>= 1; i--)
        {
            for (int j=newnumber; j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}


//Static block is for initialization of static block that is static variable
