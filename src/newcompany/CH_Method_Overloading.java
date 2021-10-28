package newcompany;

public class CH_Method_Overloading {
    static void change(int a ){
        a = 98;
    }
    static  void tellJoke(){
        System.out.println(" I invented a new word\n" + "Plagiarism");
    }

    public static void main(String[] args) {
//tellJoke();
        int [] marks = {12,435,65,25,66};
        int x = 45;
        change(x);
        System.out.println("The value of change after running x is " +x);

    }
}
