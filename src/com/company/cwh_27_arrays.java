package com.company;

public class cwh_27_arrays {
    public static void main(String[] args) {
        int [] marks = {98,34,54,23,54};
//        System.out.println(marks.length);
//        System.out.println(marks[2]);
        //The above method is a simple one
//        The method below is using for loop
        System.out.println("Printing using for Loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for Loop in reverse order");
        for (int i = marks.length-1; i >= 0 ; i--) {
            System.out.println(marks[i]);

        }
//displaying the array  using --> for each loop
        for (int element : marks){
            System.out.println(element);
        }
    }
}
