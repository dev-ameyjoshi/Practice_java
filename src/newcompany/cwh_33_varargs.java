package newcompany;

public class cwh_33_varargs {
    static int sum(int ...arr){
        // the ... packs all the argument values into an arr and then it is passed,
        // Rather than passing multiple arguments for each single single value.
        // available as  int [] arr;
        int result = 0;
        for(int a:arr){
            //passing an aditional argument here like int x will make it compulsory to
            // add at least one value while calling the function.
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("The sum of all the values is : "+(sum(2,3,4,5,6,777,85)));
    }
}
