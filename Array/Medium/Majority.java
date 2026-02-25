//Moor's voting Algorithm
package Medium;

public class Majority {
    public static int majorityElement(int[] nums) {
        int n = nums.length;        
        int cnt = 0;
        int el = 0;
        
        // Step 1: Find the potential majority element
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        
        // Step 2: Verify the candidate
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }
        
        // Return the element if it's a majority
        if (cnt1 > (n / 2)) {
            return el;
        }
        
        // No majority found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        
        int ans = majorityElement(arr);
        
        System.out.println("The majority element is: " + ans);
    }
}
