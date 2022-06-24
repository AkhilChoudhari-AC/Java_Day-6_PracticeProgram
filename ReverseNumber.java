package Day6LogicalProgram;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int num;
        int reverse = 0;
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        for(;num != 0; num /= 10)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("The reverse of the number is :" +reverse);
    }
}
