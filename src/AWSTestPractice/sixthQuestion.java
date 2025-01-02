package AWSTestPractice;

public class sixthQuestion {

    public static int getMaxAggregateTemp(int [] tempChange,int ln){
        int maxi = Integer.MIN_VALUE;
        int totalSum = 0;
        int sSum = 0;
        for(int i = 0 ;i < ln;i++){
            totalSum += tempChange[i];
        }

        for(int i = 0;i < ln;i++){
            maxi = Math.max(maxi,Math.max(totalSum,sSum + tempChange[i]));
            sSum -= tempChange[i];
            totalSum+= tempChange[i];
        }
        return maxi;
    }
    public static void main(String[] args) {
        int tempChange[] = {-1,2,3}; // op is 5
        int n = 3;
        int ln = tempChange.length;
        int res = getMaxAggregateTemp(tempChange,ln);
        System.out.println(res);
    }
}
