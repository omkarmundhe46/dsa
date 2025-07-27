package Day_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

//        int[] ans = Two_Sum(arr,n, target);
//        System.out.println(Arrays.toString(ans));

        boolean ans = Two_Sum(arr,n,target);
        System.out.println(ans);
        sc.close();

    }
//    public static int[] Two_Sum(int[] arr, int n, int target ){
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            int need =  target - arr[i];
//            if (mp.containsKey(need)){
//                return new int[]{mp.get(need), i};
//            }
//            mp.put(arr[i] , i);
//
//        }
//        return new int[] {-1,-1};
//    }


    //  THIS APPROACH IS FOR ONLY RETURN TRUE OR FALSE    BECAUSE IN INDEXING IT NOT WORK     BECAUSE OUT WE SORT THE ARRAY
    public static boolean Two_Sum(int[] arr, int n, int target ){
        Arrays.sort(arr);
        int l = 0;
        int r = n-1;
        while (l<r){
            if (arr[l] + arr[r] == target){
                return true;
            } else if (arr[l] + arr[r] < target) {
                l++;
            }
            else {
                r--;
            }
        }
        return false;
    }
}
