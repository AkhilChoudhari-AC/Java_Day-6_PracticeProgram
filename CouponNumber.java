package Day6LogicalProgram;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to generate that many Random numbre");
        int a = sc.nextInt();
        Random randomGenerator = new Random();
        System.out.println("The " + a + " Random Numbers are: ");
        for (int i = 0; i < a; i++) {
            System.out.println(randomGenerator.nextInt(100) + 1);
        }

    }}
