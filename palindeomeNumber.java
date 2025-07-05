package Day_1;

import java.util.Scanner;

public class palindeomeNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter A Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        boolean ans = palindrome_Number(num);
        System.out.println(ans);
        sc.close();
    }

    private static boolean palindrome_Number(int num) {
        int original = num;
        int rev = 0;
        while(num != 0){
            int rem = num%10;
            rev = rev *10 + rem;
            num = num/10;
        }
        return original == rev;
    }
}
