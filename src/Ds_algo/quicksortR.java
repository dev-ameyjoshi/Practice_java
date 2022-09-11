package Ds_algo;

public class quicksortR {

    public static void main(String [] args ) {
        int  arr []  = {23,21,55,22,54};
      // int  arr []  = {43,56,32,88,69};
      //  int  arr []  = {74,95,11,45,99};
        int n = arr.length;
        quickSortRecursion(arr,0,n-2);
        System.out.println("Sorted array: ");
        printArray(arr); //ctrl + y to  delete the line.




    }

    //Termination Condition
static void quickSortRecursion(int [] arr,int low,int high) {
     int pivot;
     if (high > low) {
         //Termination Condition
         pivot = Partition(arr, low, high);
         quickSortRecursion(arr,low,pivot-1);
         quickSortRecursion(arr,pivot+1,high);
     }
 }
// Actual Division Of Array
 static int Partition(int [] arr,int low,int high){
        int left,right,pivot_item = arr[low];
        left = low;
        right = high;

        while(left<right){
            while(arr[left]<=pivot_item)
                left++;

            while(arr[right]>pivot_item)
                right--;

            if(left<right)
                swap(arr,left,right);


        }
        arr[low] = arr[right];
        arr[right] = pivot_item;
        System.out.println("The Pivot Element is : " + pivot_item);
        return right;
    }
    //Swap method to help sort the array.
 public static void swap(int [] arr,int left,int right){
        int temp;
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
 }
 //Function To print the array.
 static void printArray(int [] arr){
     for(int i = 0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
         System.out.println();
     }
 }

}
