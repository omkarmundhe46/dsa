package Day_5;

import java.util.Scanner;

public class findMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Find_Missing_Number(arr, n);
        System.out.println(ans);
    }

//    public static int Find_Missing_Number(int[] arr, int n){
//        int org = (n*(n+1))/2;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//        }
//        return org-sum;
//    }

    public static int Find_Missing_Number(int[] arr, int n){
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor1 ^= arr[i];
        }
        for (int i = 0; i <= n; i++) {
            xor2 ^= i;
        }
        return xor1^xor2;
    }
}
