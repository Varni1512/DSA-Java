package Array;

import java.util.Scanner;

public class Duplicate {
    public static int removeDuplicate(int[] arr){
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter num : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Total unique element is : "+ removeDuplicate(arr));
    }
}
