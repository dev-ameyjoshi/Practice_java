package newcompany;
import java.util.Scanner;
public class cwh_18_elseif {
    public static void main(String[] args) {
        int var;
        System.out.println("Enter age : ");
        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();
//enhanced switch case below,doesn't need break.to be written,it will work!
        switch (var) {
            case 18 -> System.out.println("You are going to become an adult!");
            case 23 -> System.out.println("You are going to get a job!");
            case 60 -> System.out.println("You are going to get retired ");
            default -> System.out.println(" Enjoy your life");
        }
//
//        int age;
//        System.out.println("Enter age : ");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();

//        if(age>56){
//            System.out.println("You are experienced");
//        }else if(age>46){
//            System.out.println("Semi experienced");
//        }else if(age>36){
//            System.out.println("Semi semi experienced");
//        }else{
//            System.out.println("You are not experienced");
//        }
    }
}
