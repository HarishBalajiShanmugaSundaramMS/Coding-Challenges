/*
 * Author: HarishBalaji ShanmugaSundaram
 * Date: 09-July-2020
*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(final String[] args) {
        int number01 = 0, number02 = 1, sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Limit for Fibonacci Series: ");
            final int limit = sc.nextInt();
            if (limit == 0) {
                System.out.println("Poistion 0 " + 0);

            } else if (limit == 1) {
                System.out.println("Poistion 0 " + 0);
                System.out.println("Poistion 1 " + 1);

            } else {
                System.out.println("Poistion 0 " + 0);
                System.out.println("Poistion 1 " + 1);

                for (int i = 0; i <= limit - 2; i++) {
                    sum = number01 + number02;
                    System.out.println("Poistion " + (i + 2) + " " + sum);
                    number01 = number02;
                    number02 = sum;
                }
            }

        }
    }
}

// ? Algorithm
// * Step 01: Assign number01 = 0, number02 = 0, sum = 0
// * Step 02: Assign the limit to the value given by the user
// * Step 03: If the limit is 0, print 0
// * Step 04: If the limit is 1, print 0,1
// * Step 05: If the limit is more than 1, add number01 and number02 print the sum
// * Step 06: Assign number02 to number01 and sum to number02
// * Step07: Repeat Step05 and Step06 till for loop ends
