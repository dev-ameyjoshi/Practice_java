package java_programming;

class Circle {
    public int radius;

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

public class cwh_52_ch10ps {
    public static void main(String[] args) {
        // Problem 1
        // Circle obj1 = new Circle(12);

        // System.out.println(obj1.area());
        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println(obj.volume());

    }
}
