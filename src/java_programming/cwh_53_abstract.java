package java_programming;

abstract class Parent2{
    public Parent2(){
        System.out.println("Base 2 Constructor I am");
    }
    public void SayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
    //Will give an error if the parent class is not abstract as well.
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning!");

    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("This is my world!");
    }

}
public class cwh_53_abstract {
    public static void main(String[] args) {
        //abstract more like khayali pulao
        //Abstract Class -> Abstract Methods
        //Object Creation of abstract class is not possible.
        //Classes created from that abstract class can have objects.
       // --> Can not be implemneted-> Parent2 obj = new Parent2();
        Child2 obj = new Child2();

        //abstract as a parent class usually
        //provides all the implementations for the parent class.
        //If it does not then that must be declared abstract as well.




    }
}
