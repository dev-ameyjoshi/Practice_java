package AWSTestPractice;

import java.util.ArrayList;
import java.util.List;

/*
1 + 2 = “3”, 2 + 3 = 5, 3 + 4 = 7 →  8 + 12 →  8 + 2 → 82 as op.



 */
public class fourthQuestion {
    public static int getEncryptedNumber (int [] numbers, int l ){


        while(l > 1){

            for(int i = 0;i < l-1;i++){
                numbers[i] = (numbers[i] + numbers[i+1]) %10;

            }
            l--;
        }
        return numbers[0];
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int l = numbers.length;
        int res = getEncryptedNumber(numbers,l);
        System.out.println(res);
    }
}
