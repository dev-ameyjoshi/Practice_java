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
    public static void main(String[] args) {
        int n = 11;
        System.out.println("The value of factorial is : "+factorial(n));
        System.out.println("The value of factorial is : "+iterative(n));
        //Try Fibonacci series
    }
}
