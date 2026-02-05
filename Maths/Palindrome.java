package Maths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int current = number;
        int rev_n = 0;

        while (number > 0) {
            int last_num = number % 10;
            rev_n = (rev_n * 10) + last_num;    
            number = number / 10;      
        }

        if(rev_n == current){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }

    }
}
