package newcompany;

public class methodOverloading_32 {
    static  void change (int x){
        int a =98;
    }
    static void change2(int [] arr){ //reference is passed here, not the object.
        arr[0] = 98;
    }
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morning " + b + " Bro!");
    }
    static  void tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }
    // we use void when we don't want to return anything of any type.
    // 6:41
    public static void main(String[] args) {

       // tellJoke();

        //Case 1 : Changing the integer
        int x=45;
        change(x);
        System.out.println("The value of x after running change is: " + x);

        // Case 2 : After changing the array
        int marks [] = {45,87,98,67,66};
        change2(marks);
        System.out.println("The value of x after running change is: " + marks[0]);

        //Method Overloading
        foo();
        foo(3000);
        foo(3000 , 5000);

        //Arguments are actual!
        //Method overloading can't be performed by changing the return type of methods.



    }
}
