import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;

                int minDistance = Math.min(
                        Math.min(top, down),
                        Math.min(left, right)
                );

                System.out.print(n - minDistance + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
