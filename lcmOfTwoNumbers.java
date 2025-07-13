package Day_2;

import java.util.Scanner;

public class lcmOfTwoNumbers {
    public static int GCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        return (n1 == 0) ? n2 : n1;
    }

    public static int LCM(int n1, int n2){
        int lcm = (n1*n2)/GCD(n1,n2);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int ans = LCM(n1, n2);
        System.out.println(ans);
        scanner.close();
    }
}
