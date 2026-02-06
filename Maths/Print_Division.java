package Maths;

import java.util.*;

class Solution {
    // Function to get all divisors
    public List<Integer> getDivisors(int N) {
        // Create a list to store divisors
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                res.add(i);

                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }

        Collections.sort(res);

        return res;
    }
}

public class Print_Division {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 36;
        List<Integer> result = sol.getDivisors(N);

        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
