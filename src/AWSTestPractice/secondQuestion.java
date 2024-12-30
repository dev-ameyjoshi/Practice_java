package AWSTestPractice;
import java.util.*;
/*
Function description :
Complete the function minimum groups
Parameters : awards [] each movie awards frequency
int k -> max diff

 */
public class secondQuestion {
    public static int minGroups(int [] awards, int k, int n){
        int max = 0;
        int i = 0,j = 0;
        int start = 0;
        int end = 0;

        Arrays.sort(awards);
        for(i = 0; i < n;i++){
            while(j < n && awards[j] <= awards[i]+ k){
                j++;
                if(max < (j-i))
                {
                    max = (j - i);
                    start = i;
                    end = j;
                }
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int awards[] = {1,5,4,6,8,9,2};
        int k = 3;
        int n = awards.length;
        int result = minGroups(awards,k,n);
        System.out.println(result);
    }
}
