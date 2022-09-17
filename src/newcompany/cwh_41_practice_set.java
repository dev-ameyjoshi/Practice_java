package newcompany;

import java.util.Random;
import java.util.Scanner;

public class cwh_41_practice_set {
    public static void main(String[] args) {
        // 0 is for rock , 1 is for paper ,  2 is for scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0  for rock , 1  for paper ,  2  for scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");

        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win");
        } else {
            System.out.println("Computer Wins!");
        }
//        System.out.println("Computer Choice : " + computerInput);
        if(computerInput == 0){
            System.out.println("Computer Output : Rock");
        }
        if(computerInput == 1){
            System.out.println("Computer Output : Paper");
        }
        if(computerInput == 2){
            System.out.println("Computer Output : Scissor");
        }

    }
}
