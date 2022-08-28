package newcompany;

public class cwh_29_practice_set {
    public static void main(String[] args) {
        //Practice probllem 1
        /*float [] marks  = {23.0f,65.0f,566.0f};
        float sum = 0;
        for(float element:marks){
            sum+= element;

        }
        System.out.println("The value of sum is: " + sum);
        */

        //Practice Problem 2
        /*
        float [] marks  = {23.0f,65.0f,566.0f};
        float num = 65.0f;
        boolean isAnArray = false;

        for(float element:marks){
            if (num == element) {
                isAnArray = true;
                break;
            }
        }
        if (isAnArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not in the array ");
        }

         */
          //Problem 3
        /*
        float [] marks  = {23.0f,65.0f,566.0f};
        float sum = 0;
        for(float element:marks){
            sum+= element;

        }
        System.out.println("The value of average marks is: " + sum/ marks.length);
          */

        //Problem 4
        /*
        int [][] mat1 = {
                {1,2,3},
                {4,5,6}
        };
        int [][] mat2 = {
                {7,8,9},
                {10,11,12}
        };
        int [][] result= {
                {0,0,0},
                {0,0,0}
        };

        for (int i = 0;i<mat1.length;i++) { //row number of times
            for (int j = 0;j<mat1[i].length;j++) { // column number of times
                System.out.format("Setting value for i = %d and j = %d\n",i,j );
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        //Printing the elements of 2-D array
        for (int i = 0;i<mat1.length;i++) {
            for (int j = 0;j<mat1[i].length;j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println("");//Prints a new line

        }

         */

        //Problem 5
        // a[i] is replaced with l-i-1 to get the element it has to be replaced with.
//       int arr [] = {1,2,3,4,5,6};
//       int l = arr.length;
//       int n = Math.floorDiv(l,2);
//       int temp;
//
//        for (int i = 0; i < n; i++) {
//            //Swaping method is used.
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//
//
//        }
//        for (int element : arr) {
//            System.out.print(element + " " );
//        }

        // Problem 6
        /*
        int arr [] = {1,2,300,4,5,6};
        int max = Integer.MIN_VALUE;
        // Integer.MIN_VALUE
        // Integer.MAX_VALUE
        for(int e : arr){
            if(e>max){
                max = e;

            }

        }
        System.out.println("The maximum element of the array is : " + max);
          */

        //Problem 7
        /*
        int arr [] = {10,2,300,4,5,6};
        int max = Integer.MAX_VALUE;
        // Integer.MIN_VALUE
        // Integer.MAX_VALUE
        for(int e : arr){
            if(e<max){
                max = e;

            }

        }
        System.out.println("The smallest element of the array is : " + max);
          */

        //Problem 8
        boolean isSorted = true;
        int arr [] = {1,2,3,4,5,6};
        for (int i = 0;i< arr.length-1;i++) {
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted ");
        } else {
            System.out.println("The array is not sorted");
        }

    }
}
