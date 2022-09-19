package java_programming;


class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius *radius+2*Math.PI*radius *height;
    }
    public double volume(){
        return Math.PI*radius *radius*height;
    }
}


class Sphere{
    private int new_radius;
    public int getNew_radius() {
        return new_radius;
    }

    public void setNew_radius(int new_radius) {
        this.new_radius = new_radius;
    }

    public Sphere(int new_radius) {
        this.new_radius = new_radius;
    }
    public double surfaceArea(){
        return 4 * Math.PI * new_radius * new_radius;
    }
    public double volume(){
        return 1.3333*Math.PI*new_radius*new_radius*new_radius;
    }
}


class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }



    public int getBreadth() {
        return breadth;
    }

}
public class cwh_44_ps9 {
    public static void main(String[] args) {
/*
//        Problem 1
        Cylinder myCylinder = new Cylinder(9,12);
      //  myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);

       // myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
//        Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

 */
        //Problem 4
      //  Rectangle r = new Rectangle();
      //  System.out.println(r.getLength());
      //  System.out.println(r.getBreadth());

        //Problem 5 Sphere
        Sphere mySphere = new Sphere(9);
        System.out.println(mySphere.volume());
        System.out.println(mySphere.surfaceArea());



    }
}
