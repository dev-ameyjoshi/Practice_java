package java_programming;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int random_no;
    public int userValue;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.random_no = rand.nextInt(100);
    }

   void takeUserInput(){
        System.out.println("Guess the number.");
        Scanner sc = new Scanner(System.in);
        userValue = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
            if(userValue == random_no){
                System.out.format("Yes you guessed it right,it was %d and you guessed it in %d attempts",random_no,noOfGuesses);
              return true;
            } else if (userValue<random_no) {
                System.out.println("Too Low...");
            } else if (userValue>random_no) {
                System.out.println("Too High...");
            }
            return false;
    }






}
public class cwh_43_ex3 {
    public static void main(String[] args) {
        /*
              Guess the number game
              Game should have the following methods.
              1.Constructor to generate the random number.
              2.takeUserInput() to take a user input of number.
              3.isCorrectNumber() to detect whether the number entered by the user is true.
              4.getter and setter for noOfGuesses.

              Use properties such as noOfGuesses(int) , etc to get this task done!
         */

        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }




    }
}
