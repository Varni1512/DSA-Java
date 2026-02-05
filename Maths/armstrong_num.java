package Maths;

import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int current = number;
        int sum = 0;

        while (number > 0) {
            int last_num = number % 10;
            sum = sum + (last_num * last_num * last_num);
            number = number / 10;      
        }

        if(sum == current){
            System.out.println("number is Armstrong");
        }else{
            System.out.println("number is not Armstrong");
        }
    }
}
