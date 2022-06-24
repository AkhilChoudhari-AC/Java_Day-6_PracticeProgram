package Day6LogicalProgram;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        int num, sum = 0;
        System.out.println("Enter a number to check its a Perfect Number or not");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if (num > 0) {

            for (int i = 1; i < num; i++)
                if ( num % i == 0) {
                    sum = sum + i;
                }
        }

        if ( sum == num) {
            System.out.println(num + " is a perfect number ");

        } else {
            System.out.println (num + " is not a perfect number ");
        }



    }
}
