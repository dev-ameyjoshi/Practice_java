package newcompany;

public class cwh_27_arrays {
    public static void main(String[] args) {
        int [] marks  = {88,55,67,33,45};
       // System.out.println(marks.length);
        for (int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
        // same is applicable for float data type.

        String [] students = {"Amey","Rishabh","Krish","Suresh"};
        System.out.println(students.length);

        // quick quiz : Displaying the array in reverse order (for loop)
        System.out.println("Printing the array in reverse order:");
        for (int i= marks.length -1;i>=0;i--) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing the array using the for each loop");
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
