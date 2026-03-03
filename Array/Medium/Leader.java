import java.util.*;

public class Leader {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(arr[i]);
            }
        }

        Collections.reverse(leaders);
        for (int num : leaders) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        printLeaders(arr);
    }
}