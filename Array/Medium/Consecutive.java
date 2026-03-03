import java.util.HashSet;

public class Consecutive {

    public boolean isConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (max - min + 1 != arr.length) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return false; 
            }
            set.add(num);
        }

        return true;
    }

    public static void main(String[] args) {
        Consecutive consecutive = new Consecutive();

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(consecutive.isConsecutive(arr1)); // true
    }
}