package java_programming;


class phone{
    public void showTime(){
        System.out.println("Good Morning The time is...");
    }
    public void On(){
        System.out.println("Turning on phone");
    }
}

class smartPhone extends phone{
    public void music(){
        System.out.println("Turning On Music....");
    }
    public void On(){
        System.out.println("Turning on smart phone");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
         //phone obj = new phone(); //Object creation happens at runtime
         //obj.name();
           phone obj = new smartPhone(); //Superclass on left,subclass on right.
         // reference superclass ka hai and object subclass ka hai
        obj.showTime();
        obj.On();
        //  obj.music(); Not allowed. as it is a separate method in other subclass smartphone.
        // the on method from object smartphone will be created.
        // always the object created will have its method utilised.

        //This is called Dynamic Method Dispatch
        // And is also useful for Runtime polymorphism
        // as object creation happens on runtime.



    }
}
