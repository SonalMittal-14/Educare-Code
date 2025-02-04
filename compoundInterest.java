import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount : ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate : ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time: ");
        double time = scanner.nextDouble();

        double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;

        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }
}
