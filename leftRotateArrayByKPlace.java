package Day_3_array;

import java.util.Scanner;

public class leftRotateArrayByKPlace {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of K (no. of places to rotate left): ");
        int k = sc.nextInt();
        System.out.println("Original Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        leftRotate(arr, k);
        System.out.println("\nArray after rotating left by " + k + " places:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}
