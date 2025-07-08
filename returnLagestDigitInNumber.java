package Day_1;

import java.util.Scanner;

public class returnLagestDigitInNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter A Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int ans = largest_Number(num);
        System.out.println(ans);
        sc.close();
    }

    private static int largest_Number(int num) {
        int original = num;
        int max = original%10;
        while (original!=0){
            int last = original%10;
            if (max<last){
                max = last;
            }
            original = original/10;
        }
        return max;
    }
}
