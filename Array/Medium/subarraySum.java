import java.util.*;
public class subarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: there's one way to have a sum of 0 (by taking no elements)
        
        for(int i = 0;i<nums.length;i++) {
            sum += nums[i];
            int remove = sum - k;
            count += map.getOrDefault(remove, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        subarraySum ss = new subarraySum();
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = ss.subarraySum(nums, k);
        System.out.println(result); // Output: 2
    }
}