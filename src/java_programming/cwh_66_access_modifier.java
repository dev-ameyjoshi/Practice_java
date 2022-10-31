package java_programming;




class C1{
     public int x = 5;
     protected int y = 45;
     int z = 6;
     private int a = 34;
//refer the access modifier table.
    public void method1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}
class C2{

}class C3{

}
public class cwh_66_access_modifier {
    public static void main(String[] args) {
    C1 bro = new C1();
   // bro.method1();
        //System.out.println(bro.a);//private variable hence not accesible.in the same package.
        System.out.println(bro.y);
        System.out.println(bro.x);
        System.out.println(bro.z);
    }
}
