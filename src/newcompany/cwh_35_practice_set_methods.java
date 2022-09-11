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
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern_rec(int n){
        if(n>0) {
            pattern_rec(n - 1);


            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = n-1;i>=0;i--) {    // 6
            for (int j = 0;j<=i;j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    static void pattern3(){
        for (int i = 0; i<= 5;i++) {
            for (int j = 0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4;i>0;i--) {
            for (int j = 0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n){
        /*
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        */
// Short code + readibility is a must.
        if(n==1 | n==2){
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }

    }

// Explanation through each iteration :

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
//        multiplication(7);
//        System.out.println();
//        pattern(7);

        //Problem 3
//        System.out.println();
//        int c = SumRec(3);
//        System.out.println(c);

        //Problem 4
//        System.out.println();
//        pattern2(7);
//        System.out.println();

//        pattern3();

//        problem 4


        System.out.print(fib(7));
        System.out.println();

        // Problem 8
      pattern_rec(5);




    }
}
