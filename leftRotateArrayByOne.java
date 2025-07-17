package Day_3_array;

import java.util.Scanner;

public class leftRotateArrayByOne {

    public static void rotateArrayByOne(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; ++i) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        System.out.println("Enter Size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        rotateArrayByOne(arr, n);
        System.out.println("\nArray after rotating left by one position:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
