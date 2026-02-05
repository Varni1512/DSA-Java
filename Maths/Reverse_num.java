package Maths;

import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev_n = 0;

        while (number > 0) {
            int last_num = number % 10;
            rev_n = (rev_n * 10) + last_num;    
            number = number / 10;      
        }

        System.out.println(rev_n);
    }
}
