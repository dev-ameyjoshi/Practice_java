package com.company;



public class tester{
    public static void main(String[] args) {
        triangle tri = new triangle();
        // Calling function
        tri.getInput();
        float l = tri.getL();
        float b = tri.getB();
        tri.setArea(l,b);

        circle obj1 = new circle();

        obj1.setArea(tri.getL());

        square obj2 = new square();
        // Calling function

        obj2.setArea(tri.getL());
    }
}
















