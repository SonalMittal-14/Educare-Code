import java.util.Scanner;

public class average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");;
        int a = scanner.nextInt();
        System.out.println("Enter Second Number : ");;
        int b = scanner.nextInt();
        System.out.println("Enter Third Number : ");;
        int c = scanner.nextInt();

        double avg = (a+b+c)/3.0;
        System.out.println("Average is : "+avg);

        scanner.close();
    }
}
