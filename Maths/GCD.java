package Maths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        //optimal approach - Equilateral Algorithm
        while (n1 > 0 && n2 > 0) {
            if(n1 > n2){
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        if(n1 == 0){
            System.out.print(n2);
        } else {
            System.out.print(n1);
        }

        // worst case 

        // int GCD = 1;
        // for(int i = 1; i <= Math.min(n1, n2); i++){
        //     if(n1 % i == 0 && n2 % i == 0){
        //         GCD = i;
        //     }
        // }
        // System.out.println(GCD);
    }
}
