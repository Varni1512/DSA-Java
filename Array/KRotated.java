package Array;

import java.util.Scanner;

public class KRotated {

    // Function to reverse part of array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void krotated_array(int[] a, int len, int d) {
        d = d % len; 

        reverse(a, 0, d - 1);
        reverse(a, d, len - 1);
        reverse(a, 0, len - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.print("Enter rotation steps: ");
        int d = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter num: ");
            arr[i] = sc.nextInt();
        }

        int len = arr.length;

        krotated_array(arr, len, d);

        System.out.println("Rotated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
