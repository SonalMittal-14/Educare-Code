import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you First Number : ");
        int a = scanner.nextInt();
        System.out.println("Enter you Second Number : ");
        int  b = scanner.nextInt();
        System.out.println("Enter you Third Number : ");
        int c = scanner.nextInt();

        int lastDigit_1 = a % 10;
        int lastDigit_2 = b % 10;
        int lastDigit_3 = c % 10;

        int sum = lastDigit_1 + lastDigit_2 + lastDigit_3;

        System.out.println("Sum of the Last Digits is : " + sum);

        scanner.close();
    }
}