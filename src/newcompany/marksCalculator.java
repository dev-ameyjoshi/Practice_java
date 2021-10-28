package newcompany;
import java.util.Scanner;

public class marksCalculator {
    public static void main(String[] args) {
        float totalMarks;
        System.out.println("Enter Subject 1 Marks: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

        System.out.println("Enter Subject 2 Marks: ");
        float b = sc.nextFloat();
        System.out.println("Enter Subject 3 Marks: ");
        float c = sc.nextFloat();
        System.out.println("Enter Subject 4 Marks: ");
        float d = sc.nextFloat();
        System.out.println("Enter Subject 5 Marks: ");
        float e = sc.nextFloat();



        totalMarks = (a + b + c + d + e)*100/500 ;
        System.out.println("The Percentage of marks attained :" +totalMarks + "%");
    }


}
