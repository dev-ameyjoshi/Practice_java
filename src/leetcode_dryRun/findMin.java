package leetcode_dryRun;
// Find min a sorted array  - aditya verma stack question 
public class findMin {
    public static int findMin(int[] nums) {

        int n = nums.length;
        int h = 0; // start
        int l = nums.length-1; // end

        while(h<=l){
            int mid  = h + (l-h)/2;

            int next = (mid+1)%n;
            int prev = (mid + n - 1)%n;
            //To check if the array was already sorted
            if(nums[mid] <= nums[l] && nums[mid] >= nums[h]) return nums[h];
            System.out.println(nums[h]);
            //if the mid element is less than both , the prev and next element.
            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev]) return nums[mid];
                //To decide if he section to search for the min element we look for the unsorted part of the array
                //but before that we see whether to search in sorted section or not.
            else if(nums[h] <= nums[mid]) h = mid + 1;
            else if(nums[mid] <= nums[l]) l = mid-1;
            System.out.println(nums[mid]);
            System.out.println(nums[h]);
            System.out.println(nums[l]);
        }

        return nums[0];

    }
    public static void main(String[] args) {
        int nums[] = {11 , 12 , 15 , 18, 2 , 5, 6,8};
        findMin(nums);
    }
}
