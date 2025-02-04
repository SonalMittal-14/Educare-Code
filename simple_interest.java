import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal : ");
        int p = scanner.nextInt();
        System.out.println("Enter Rate : ");
        int rate = scanner.nextInt();
        System.out.println("Enter Time : ");
        int time = scanner.nextInt();

        double simpleInterest = (p * rate * time) / 100.0;

        System.out.println("Simple Interest is : " + simpleInterest);

        scanner.close();
    }
}
