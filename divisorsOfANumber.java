package Day_1;

import java.util.Scanner;

public class divisorsOfANumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter A Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Divisors of " + num + " are:");
        Divisor(num);
        sc.close();
    }

    private static void Divisor(int num) {
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                System.out.print(i + "  ");
            }
        }
    }
}
