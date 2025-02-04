import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double squareRoot = Math.sqrt(number);

        System.out.println("Square root is :" + squareRoot);

        scanner.close();
    }
}

