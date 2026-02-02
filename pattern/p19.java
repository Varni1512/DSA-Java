class Solution {
    public void pattern19(int N) {
        // Initial spaces for upper half
        int iniS = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }

        // Initial spaces for lower half
        iniS = 2 * N - 2;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }
    }
}

public class p19 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern19(N);
    }
}
