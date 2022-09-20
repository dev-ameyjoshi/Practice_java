package java_programming;


class FirstClass{
    int a ;

    public int getA() {
        return a;
    }

    FirstClass(int a){
        this.a = a;
        //this is a reference.
    }
    public int returnOne(){
        return 1;

    }
}

class secondClass extends FirstClass{
    secondClass(int c){
        super(c);
        System.out.println("I am a constructor!");
    }
}
public class cwh_47_this_super {
    public static void main(String[] args) {
        FirstClass e = new FirstClass(65);
        secondClass d = new secondClass(5);
        System.out.println(e.getA());
    }
}
