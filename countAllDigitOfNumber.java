
import java.util.Scanner;

public class countAllDigitOfNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter A Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int ans = count_Digit(num);
        System.out.println(ans);
    }

    private static int count_Digit(int num) {
        int count = 0;

        //   1st Approach
//        while(num!=0){
//            num = num/10;
//            count++;
//        }

        //   2nd Approach
        count = (int) (Math.log10(num) + 1);

//        count = (int) (Math.log10(Math.abs(num)) + 1);     //  for absolute / negative values

        return count;
    }


//    count All Odd Digit Of Number

//    private static int count_Digit(int num) {
//        int count = 0;
//        while(num!=0){
//            int rem = num%10;
//             num = num/10;
//            if (rem %2 !=0) {
//                count++;
//            }
//        }
//        return count;
//    }
}
