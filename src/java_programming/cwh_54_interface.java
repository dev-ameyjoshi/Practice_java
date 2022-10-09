package java_programming;

/*
Example For Interface :
interface bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}

 */

//multiple abstract methods cannot generate methods but,
//Multiple interfaces can generate a method,
//and we can use reference as well in interface

//methods for interface are always public
// in the class for implements



interface bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface blowHorn{

    void blowHornk3g();
    void blowHornmhn();
}


class AvonCycle implements bicycle,blowHorn{
    void blowHorn(){
        System.out.println("Pee Pee poo Poo");
    }
   public void applyBrake(int decrement){
        System.out.println("Applying break!");
    }
   public void speedUp(int increment){
        System.out.println("Increase-ing speed! ");
    }
    public void blowHornk3g(){
        System.out.println("Random 1");
    }
    public void blowHornmhn(){
        System.out.println("Random 2");
    }

}
public class cwh_54_interface {
    public static void main(String[] args) {
        AvonCycle obj = new AvonCycle();
        obj.applyBrake(3);
        //You can create properties in interfaces.
        System.out.println(obj.a);
        //You can not modify the properties in interfaces as they are final.
        // obj.a = 454; --> error


        obj.blowHornk3g();
        obj.blowHornmhn();
    }
}
