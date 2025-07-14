package Day_3_array;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        System.out.println("Enter Size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = largest_Element( arr,  n);
        System.out.println(ans);
    }

    private static int largest_Element(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
