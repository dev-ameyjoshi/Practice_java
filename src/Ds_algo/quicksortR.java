package Ds_algo;

public class quicksortR {

    public static void main(String [] args ) {
        int  arr []  = {23,21,55,22,54};
        int n = arr.length;
        quickSortRecursion(arr,0,n-2);
        System.out.println("Sorted array: ");
        printArray(arr);



    }

static void quickSortRecursion(int [] arr,int low,int high) {
     int pivot;
     if (high > low) {
         //Termination Condition
         pivot = Partition(arr, low, high);
         quickSortRecursion(arr,low,pivot-1);
         quickSortRecursion(arr,pivot+1,high);
     }
 }

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
        return right;
    }
 public static void swap(int [] arr,int left,int right){
        int temp;
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
 }
 static void printArray(int [] arr){
     for(int i = 0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
         System.out.println();
     }
 }

}
