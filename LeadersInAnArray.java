package Day_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeadersInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = Leaders_In_An_Array(arr, n);
        for (int it : ans) {
            System.out.print(it + " ");
        }
    }

    public static List<Integer> Leaders_In_An_Array(int[] nums, int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] >= nums[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
