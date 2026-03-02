import java.lang.reflect.Array;

public class Twosum {
    //brute force apporach 
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] sum(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        java.util.Arrays.sort(nums);
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{nums[left], nums[right]};
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sum(nums, target);
        int[] res = twoSum(nums, target);
        System.out.println("Values: " + result[0] + ", " + result[1]);
        System.out.println("Indices: " + res[0] + ", " + res[1]);
    }
}
