package Day_1;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter A Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int ans = reverse_Number(num);
        System.out.println(ans);
    }

    private static int reverse_Number(int num) {
        int rev = 0;
        while(num != 0){
            int rem = num%10;
            rev = rev *10 + rem;
            num = num/10;
        }
        return rev;
    }
}
