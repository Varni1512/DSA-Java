package Array;

import java.util.*;

class Solution {
    public List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while (i < n && j < m) {

            // skip duplicates in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                i++;
            } 
            else if (arr2[j] < arr1[i]) {
                j++;
            } 
            else {
                ans.add(arr1[i]); // common element
                i++;
                j++;
            }
        }

        return ans;
    }
}

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4,5,6};
        int[] arr2 = {2,2,3,5,7};

        Solution obj = new Solution();
        List<Integer> result = obj.intersection(arr1, arr2);

        System.out.print("Intersection is: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
