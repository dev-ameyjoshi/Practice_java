package AWSTestPractice;

public class firstQuestion {
/*
Complete the function findEarliestMonth
Parameters : int stockPrices[] ,size n
expected to return an integer.

Month1
3 + 2 + 4 + 5 = 14/4 = 3
3 - 1 => 2

Month2
1,3 -> 2
2,4,5 -> 3
3-2 => 1

Month3

1 + 3 + 2 / 3 => 2
4 + 5 / 2 =>  4
net price change = 4 -2 = 2.

And the average of all these 3 months : 3 + 2 + 1 / 3 => 2
op: 2

 */

    public static int findEarliestMonth(int [] stockPrice, int n){



        //according to the constraints given.
        int start = stockPrice[0];
        int Min_m = 1;
        int totalSum = 0;
        int end = n-1;

        for(int i = 1;i < n;i++){
             totalSum += stockPrice[i];
        }

        int netAvg = Math.abs(totalSum/end - start);


        for(int i = 1 ;i < n-1;i++){
            start += stockPrice[i];
            totalSum -= stockPrice[i];
            end -= 1;
            int net = Math.abs(totalSum/end - start/(i+1));
            if (net < netAvg ){
                netAvg = net;
                Min_m = i + 1;
            }

        }
        return Min_m;




    }
    public static void main(String[] args) {

        int stockPrice[] = {1,3,2,3};
        int n = 4;
        int result = findEarliestMonth(stockPrice,n);
        System.out.println(result);
    }
}
