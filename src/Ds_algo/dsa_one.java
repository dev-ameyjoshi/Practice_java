package Ds_algo;

import java.util.*;

public class dsa_one {
    public static void main(String[] args) {

        //Method Search();


        Stack<String> stk = new Stack<>();
        stk.push("Mac Book");
        stk.push("HP");
        stk.push("Lenovo");
        stk.push("Asus");
        stk.push("Dell");
        System.out.println("Stack" + stk);
        int location = stk.search("Lenovo");
        System.out.println("Location of company:" + location);




        //Method iterator();



        stk.push("Car1");
        stk.push("Car2");
        stk.push("Car3");
        stk.push("Car4");

        Iterator iterator = stk.iterator();
        while (iterator.hasNext())
        {
            Object values = iterator.next();
            System.out.println(values);
        }



        //Mehthod forEach();


        stk.push("199");
        stk.push("456");
        stk.push("200");
        System.out.println("Iteration using the forEach method()");
        stk.forEach(n->
        {
            System.out.println(n);
        });




        //Method listIterator method();
         Stack<Integer> stck = new Stack<>();
         stck.push(119);
         stck.push(220);
         stck.push(234);
         stck.push(567);
         ListIterator <Integer> ListIterator = stck.listIterator(stck.size());
        System.out.println("Iteration over the stack from the bottom:");
        while(ListIterator.hasPrevious())
        {
            Integer avg = ListIterator.previous();
            System.out.println(avg);
        }

    }
}
