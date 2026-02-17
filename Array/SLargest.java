package Array;

import java.util.Scanner;

public class SLargest {
    public static int second_largest(int[] arr){
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                slargest = largest;
               largest = arr[i];
            }else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static int second_smallest(int[] arr){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest){
                ssmallest = smallest;
               smallest = arr[i];
            }else if(arr[i] != smallest && arr[i] < ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter num : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Second largest no. is : " + second_largest(arr));
        System.out.println("Second smallest no. is : " + second_smallest(arr));
    }
}
