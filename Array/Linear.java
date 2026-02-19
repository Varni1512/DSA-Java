package Array;

import java.util.Scanner;

public class Linear {
    public static int linear_search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter num : ");
            arr[i] = sc.nextInt();
        }
       System.out.print("enter num for find the index of the element : ");
        int num = sc.nextInt();
       System.out.println("num is at index : " + linear_search(arr, num));
    }
}
