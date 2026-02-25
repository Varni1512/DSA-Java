//Dutch National Flag algorithm.

// We divide the array into three partitions using three pointers – low, mid, and high.
// From 0 to low-1, we’ll keep only 0s
// From low to mid-1, only 1s
// From high+1 to n-1, only 2
// The range from mid to high is the unsorted zone we’re scanning and fixing. At each step:
// If arr[mid] == 0, it belongs to the left section → swap with low, move both low and mid.
// If arr[mid] == 1, it’s already in the middle section → just move mid.
// If arr[mid] == 2, it belongs to the right section → swap with high, only move high.

package Medium;

public class ZeroOne {
    public static void sortZeroOneTwo(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortZeroOneTwo(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
