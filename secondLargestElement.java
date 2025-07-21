package Day_3_array;

import java.util.Scanner;

public class secondLargestElement {

    public static int secondLargestElement(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = secondLargestElement(arr, n);
        System.out.println(ans);
    }
}






//    public static void main(String[] args) {
//        System.out.println("Enter Size of array : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        System.out.println("Enter " + n + " elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int ans = second_Largest_Element( arr,  n);
//        System.out.println(ans);
//    }
//
//    private static int largest_Element(int[] arr, int n) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    private static int second_Largest_Element(int[] arr, int n) {
//        int Sec_max = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            if(arr[i] > Sec_max && arr[i]!=largest_Element(arr,n)){
//                Sec_max = arr[i];
//            }
//        }
//        return Sec_max;
//    }
//}
