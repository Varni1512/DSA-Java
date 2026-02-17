package Array;

import java.util.Scanner;

public class Largest {

    public static int largest_element(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter num : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("largest num is : " + largest_element(arr));
    }
}
