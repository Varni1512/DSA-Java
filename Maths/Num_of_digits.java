package Maths;

import java.util.Scanner;

public class Num_of_digits {
    public static int countDigits(int n){
        int count = 0;
        while(n > 0){
            count = count + 1;
            n = n / 10;
        }
        return count;
    }
    
    public static int countshort(int n){
        int cnt = (int) (Math.log10(n) + 1);
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        while (number > 0) {
            int last_num = number % 10;
            count = count + 1;
            number = number / 10;            
        }

        System.out.println(count);
    }
}
