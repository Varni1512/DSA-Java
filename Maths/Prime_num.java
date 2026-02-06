package Maths;

import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int counter = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                counter++;
                if (i != (n / i)) {
                    counter++;
                }
            }
        }
        if (counter == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
