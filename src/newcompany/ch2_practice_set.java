package newcompany;

import java.util.Locale;

public class ch2_practice_set {
    public static void main(String[] args) {
//        Problem 1
//        String name = "LADN";
//        name = name.toLowerCase();
//        System.out.println(name);
//        Problem 2
//        String text = "To lower case";
//        text = text.replace(" ","_");
//        System.out.println(text);
//        Problem 3
//        String letter = "Dear <|name|> , Thanks a lot!";
//        letter = letter.replace("<|name|>","Amey");
//        System.out.println(letter);
//        Problem 4
        String myString = " This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
//        Problem 5
        String letter2 = "\tDear Amey ,\n\t This Java Course is nice.\n\t Thanks!";
        System.out.println(letter2);




    }

}
