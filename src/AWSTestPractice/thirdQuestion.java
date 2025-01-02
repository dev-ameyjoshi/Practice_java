package AWSTestPractice;

import java.util.Arrays;

public class thirdQuestion {
    /*
    To choose greatest m number of elements and remove them from the array and sum the rest of the elements.

    //Iterate through the array and select greatest m elements,
    //remove them from the array
    //add remaining elements in the array and return them as op.


     */
    //Sliding Window
    public static int minimizeMemory (int [] process,int n , int ln){
        int count = 0;
        int total_Sum = 0;
        int ans = Integer.MIN_VALUE;
        int j = 0;

        for(int i = 0;i < ln;i++){

            count += process[i];
            if( i >= n-1){
                ans = Math.max(ans,count);
                count -= process[j];
                j++;
            }

        }
        for(int p : process){
            total_Sum += p;
        }
        return total_Sum-ans;

    }
    public static void main(String[] args) {
        int process[] = {10,4,8,1};
        int n = 2;
        int ln = process.length;
        int res = minimizeMemory(process,n,ln);
        System.out.println(res);
    }
}
