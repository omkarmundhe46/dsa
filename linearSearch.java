package Day_3_array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        System.out.println("Enter Size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target Element To Search: ");
        int target = sc.nextInt();
        int ans = linear_Search( arr, n, target);
        System.out.println(ans);
    }

    private static int linear_Search(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
