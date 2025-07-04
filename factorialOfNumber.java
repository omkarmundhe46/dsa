package Day_1;

import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter A Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int ans = fact(num);
        System.out.println(ans);
        sc.close();
    }

    private static int fact(int num) {
        if (num == 0 || num == 1){
            return 1;
        }
        else{
            return num * fact(num - 1);
        }
    }
}
