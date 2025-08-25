package Sheet;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[5];

        System.out.println("Enter 5 elements : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter value to remove: ");
        int val = sc.nextInt();

        int ans = removeElement(nums,val);
        System.out.println(ans);

        // Print the array after removal (optional)
        System.out.print("Updated array: ");
        for (int i = 0; i < ans; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


}
