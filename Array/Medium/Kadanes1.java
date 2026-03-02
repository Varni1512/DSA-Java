// Kadane's Algorithm with Subarray Printing
public class Kadanes1 {

    public static void maxSubArray(int[] nums) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        int start = 0;      
        int ansStart = 0;   
        int ansEnd = 0;     

        for (int i = 0; i < nums.length; i++) {

            if (sum == 0) {
                start = i;
            }
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum Sum: " + maxi);
        System.out.print("Subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maxSubArray(arr);
    }
}