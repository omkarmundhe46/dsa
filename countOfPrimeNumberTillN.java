package Day_1;

import java.util.Scanner;

public class countOfPrimeNumberTillN {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter A Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (prime(i)) {
                count++;
            }
        }
        System.out.println("Total prime numbers from 1 to " + num + " are: " + count);
        sc.close();
    }

    private static boolean prime(int num) {
        if(num<=1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
