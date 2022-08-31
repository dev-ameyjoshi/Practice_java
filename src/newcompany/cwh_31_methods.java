package newcompany;

public class cwh_31_methods {
    //The following method associates with the object of the class.

    //if static keyword is not used then
    // we have to use the method by creating the object of the class
    // the method is associated with.

    //Access modifiers.
    // if we don't refer anything then access modifier is default.

    // a method can be called by creating the object of the class in which the method exists.
    //Example : single fridge in a hostel VS several fridge in a hostel owned by many ppl.


    static int logic(int x, int y){
        int z;
        if (x > y) {
            z = x + y;

        } else {
            z  = (x+y)*5;

        }
        return z;

    }



    public static void main(String[] args) {
         int a = 5;
         int b = 10;
         int c;

       //  cwh_31_methods obj = new cwh_31_methods();

       //  c = obj.logic(a,b);
           c = logic(a,b); // needs static method for main method and the follwing class.

         int a1 = 2;
         int b1 = 1;
         int c1;
       //  c1 = obj.logic(a1,b1);
           c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
