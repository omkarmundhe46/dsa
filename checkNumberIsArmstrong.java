package Day_2;

import java.util.Scanner;

public class checkNumberIsArmstrong {

    public static int count_digit(int num){
        return (int) (Math.log10(num) + 1);
    }

    public static boolean ArmStrong(int num){
        int count = count_digit(num);
        int sum = 0;
        int copy = num;
        while (num > 0){
            int latNum = num%10;
            sum += Math.pow(latNum, count);
            num = num/10;
        }
        return sum == copy;
    }

    public static void main(String[] args) {
        System.out.println("Entre A Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (ArmStrong(num)){
            System.out.println(num + " is a ArmStrong Number");
        }
        else {
            System.out.println(num + "is not a ArmStrong Number");
        }
    }
}
