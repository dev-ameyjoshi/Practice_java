package AWSTestPractice;
import java.util.*;


//
public class fifthQuestion {
    public static int maximizeAZ(String s,int ln){
        HashMap<Character,Integer>  charCount = new HashMap<>();

        int count = 0,total = 0;

        for(char ch : s.toCharArray() ){
            charCount.put(ch,charCount.getOrDefault(ch,0) +1);
        }

        int countA = charCount.getOrDefault('A',0);
        int countZ = charCount.getOrDefault('Z',0);

        if(countA <= countZ){
            for(int i = 0;i < ln ;i++){

                char ch = s.charAt(i);

                if(ch == 'A') count++;
                else if (ch == 'Z') {
                    total+= count+1;
                }

            }

            return total;

        }else{
            for(int i = 0;i < ln ;i++){

                char ch = s.charAt(i);

                if(ch == 'A') count++;
                else if (ch == 'Z') {
                    total+= count;
                }

            }

            return total+ count;
        }
    }
    public static void main(String[] args) {
        String s = "BAZAZ";
        //String s = "A";
        int ln = s.length();
        int res = maximizeAZ(s,ln);
        System.out.println(res);
    }
}
