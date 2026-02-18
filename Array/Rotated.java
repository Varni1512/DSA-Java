package Array;

import java.util.Scanner;

public class Rotated {
    public static void rotated_array(int[] a){
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        a[a.length - 1] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter num : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Rotated array : " );
        rotated_array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
