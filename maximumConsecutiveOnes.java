package Day_3_array;

import java.util.Scanner;

public class maximumConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println("Enter Size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Max_Consecutive_Ones( arr,  n);
        System.out.println(ans);
    }

    private static int Max_Consecutive_Ones(int[] arr, int n) {
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1){
                count++;
                maxi = Math.max(maxi,count);
            }
            else {
                count = 0;
            }
        }
        return maxi;
    }
}
