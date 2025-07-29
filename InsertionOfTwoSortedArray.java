package Day_7;
import java.util.*;

public class InsertionOfTwoSortedArray {
//    public static List<Integer> intersection(int[] a, int n, int[] b, int m) {
//        List<Integer> ans = new ArrayList<>();
//        int[] visited = new int[m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (a[i] == b[j] && visited[j] == 0) {
//                    ans.add(a[i]);
//                    visited[j] = 1;
//                    break;
//                }
//            }
//        }
//        return ans;
//    }



    // OPTIMAL SOLUTION
    public static List<Integer> intersection(int[] a, int n, int[] b, int m) {
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i<n & j<m){
            if (a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i]>b[j]) {
                j++;
            }else {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        List<Integer> ans = intersection(a, n, b, m);
        for (int it : ans) {
            System.out.print(it + " ");
        }
    }
}
