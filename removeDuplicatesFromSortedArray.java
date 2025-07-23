package Day_4;

import java.util.Scanner;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = Remove_Duplicates_From_Sorted_Arrays(arr, n);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    private static int Remove_Duplicates_From_Sorted_Arrays(int[] arr, int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
