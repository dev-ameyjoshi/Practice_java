package com.company;

public class cwh_24_break_cont
{
    public static void main(String[] args)
    {
//break and cont using loops
//        for(int i = 0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
////               break statement--> breaks the loop
//
//            }
            for(int i = 0;i<50;i++){
                if(i==2){
                    System.out.println("Ending the loop");
                    continue;
 //                   it will directly jump for next iteration.
//                    that it is it will start for 3 and will end th loop for 2 here.
            }
                System.out.println(i);
                System.out.println("Java is great");

        }
    }
}
