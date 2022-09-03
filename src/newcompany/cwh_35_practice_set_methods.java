package newcompany;

public class cwh_35_practice_set_methods {

    static void multiplication(int n){
        for (int i = 1;i<=10;i++) {
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }

    static void pattern(int n){
        for (int i = 0;i<n;i++) {
            for(int j =0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // sum(n) =  sum(n-1) + n
    // sum(n) = 3 + sum(2);
    // sum(n) = 3 + 2 + sum(1)
    // sum(n) = 3+2+1
    static int SumRec(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n + SumRec(n-1);
        }
    }

    public static void main(String[] args) {
        //Problem 1
        multiplication(7);
        System.out.println();
        pattern(7);

        //Problem 3
        System.out.println();
        int c = SumRec(3);
        System.out.println(c);


    }
}
