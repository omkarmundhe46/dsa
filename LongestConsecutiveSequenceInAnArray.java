package Day_8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequenceInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Longest_Consecutive_Sequence_In_An_Array(arr,n);
        System.out.println(ans);
    }

    // OPTIMAL SOLUTION
    public static int Longest_Consecutive_Sequence_In_An_Array(int[] arr, int n) {
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }
        for (int it : st) {
            if (!st.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (st.contains(x + 1)) {
                    x += 1;
                    cnt += 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }




//    public static int Longest_Consecutive_Sequence_In_An_Array(int [] arr, int n){
//        int logest = 1;
//        for (int i = 0; i < n; i++) {
//            int count = 1;
//            int x = arr[i];
//            while (linear(arr,n,x+1)){
//                count++;
//                x++;
//            }
//            logest = Math.max(logest,count);
//        }
//        return logest;
//    }
//
//    private static boolean linear(int[] arr, int n, int ele) {
//        for (int i = 0; i < n; i++) {
//            if (arr[i]==ele){
//                return true;
//            }
//        }
//        return false;
//    }
}
