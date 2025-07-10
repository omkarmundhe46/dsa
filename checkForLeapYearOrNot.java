package Day_2;

import java.util.Scanner;

public class checkForLeapYearOrNot {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (leap_year(year)){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }

    private static boolean leap_year(int year) {
        return ((year%4==0 && year%100!=0) || (year%400==0));
    }
}
