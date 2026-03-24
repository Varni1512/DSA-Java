class Solution {
    public long findPascalElement(int r, int c) {
        int n = r - 1;
        int k = c - 1;

        long result = 1;

        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }
}

public class Pascal1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int r = 5, c = 3;
        System.out.println(sol.findPascalElement(r, c));
    }
}
