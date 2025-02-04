import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        double commission = salary * 0.05;

        System.out.println("Your commission is: " + commission);

        scanner.close();
    }
}

