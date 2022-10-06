package java_programming;

class Circle {
    public int radius;



    Circle(){
        System.out.println("I am a non param Circle.");
    }
    Circle(int r) {
        System.out.println("I am circle parameterised constructor");
        this.radius = r;

    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle {
    public int height;

    Cylinder1(int r, int h) {
        super(r);
        this.height = h;
        System.out.println("I am cylinder1 parameterized constructor");

    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

}

class Rectangle1{
    public int lengthNew;
    public int breadth;

    public int getLengthNew() {
        return lengthNew;
    }

    public void setLengthNew(int lengthNew) {
        this.lengthNew = lengthNew;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    Rectangle1(int l, int b){
      this.lengthNew = l;
      this.breadth = b;

    }

    public double area(){
        return lengthNew*breadth;
    }
}

class cuboid extends Rectangle1{
    public int heightNew;
    cuboid(int l,int b,int p){
        super(l,b);
        this.heightNew = p;
        System.out.println("I am Cuboid of extended class");

    }

    public double area(){
        int bracket = lengthNew*breadth+breadth*heightNew+lengthNew*heightNew;
        return 2*bracket;
    }
}

public class cwh_52_ch10ps {
    public static void main(String[] args) {
        // Problem 1
        // Circle obj1 = new Circle(12);

        // System.out.println(obj1.area());
        //  Cylinder1 obj = new Cylinder1(12, 4);
        //  System.out.println(obj.volume());
        Rectangle1 obj = new cuboid(4,5,9);
        System.out.println(obj.area());

        //Problem 2 is of calling rectangle and cuboid class.
        //Problem 3 is for creating the methods to calculate volume and area.
        //Problem 4 is for Getters and setters method in problem 2
        //Problem 5 -> Base -> Derived1 ->Derived 2 , will be executed in the same order.
    }
}
