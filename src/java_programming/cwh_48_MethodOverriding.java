package java_programming;


class A{
    public int a;
    public int Amey(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }

}

class B extends A{
    //@Override is for method-overriding.and is
    // recommended to use for better understanding.10:59
    @Override
    public void meth2(){
        System.out.println("I am a method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am a method 3 of class B");
    }
}
public class cwh_48_MethodOverriding {
    public static void main(String[] args) {
         A a = new A();
         a.meth2();

         B b = new B();
         b.meth2();
    }
}
