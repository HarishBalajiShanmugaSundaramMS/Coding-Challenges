import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit for Fibonacci Series: ");
        int limit = sc.nextInt();
        System.out.println("Poistion 0 "+0);
        System.out.println("Poistion 1 "+1);
        for (int i = 0; i <= limit-2; i++) {
            sum = a + b;
            System.out.println("Poistion " +(i+2)+" "+sum);
            a = b;
            b = sum;
        }

    }
}