package Array;

import java.util.Scanner;

public class Sorted {
    public static boolean sorted_array(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i-1]){

            } else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter num : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is sorted : " + sorted_array(arr));
    }
}
