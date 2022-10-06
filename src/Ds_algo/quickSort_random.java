package Ds_algo;


import java.util.Random;

public class quickSort_random {
    //Random Function For Pivot element.
    static void random(int arr[],int low,int high)
    {

        Random rand= new Random();
        int pivot = rand.nextInt(high-low)+low;

        int temp1=arr[pivot];
        arr[pivot]=arr[high];
        arr[high]=temp1;
    }

    //Partition Function To Sort the array.
    static int partition(int arr[], int low, int high)
    {
        // pivot is chosen randomly
        random(arr,low,high);
        int pivot = arr[high];


        int i = (low-1); // index of smaller element
        for (int j = low; j < high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    //Termination Condition , calls itself again and again to eliminate the recursion
    // if condition is not satisfied.
    static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
            now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
//To print the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {92, 55, 12, 54, 3, 4};
        int n = arr.length;

        sort(arr, 0, n-1);

        System.out.println("Sorted array");
        printArray(arr);
    }
}
