package newcompany;

public class cwh_34_recursion {
    static int factorial(int n){
        //factorial (n) = n * n-1 * n-2.....
        //factorial(0) =1
        if (n == 0 | n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }

    }

    static int iterative(int n){
        //factorial (n) = n * n-1 * n-2.....
        //factorial(0) =1
        if (n == 0 | n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1;i<=n;i++) {
                product *=i;

            }
            return product;
        }

    }

    static int fib(int n){
        if (n <= 1) {
            return n;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }
    static int fibIterative(int n){
        if (n == 1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        else {
            int ogno;
            int num1 = 0;
            int num2 = 1;
            for (int i = 1; i < n; i++) {
                ogno = num1;
                num1 = num2;
                num2 = ogno + num1;
            }
            return num2;
        }

    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println("The value of factorial is : "+factorial(n));
        System.out.println("The value of factorial is : "+iterative(n));
        System.out.println("The value of Fibonacci is : "+fib(n));
        System.out.println("The value of Fibonacci is : "+fibIterative(n));
        //Try Fibonacci series
    }
}
