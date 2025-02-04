import java.util.Scanner;

public class sum_diff{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter Second Number: ");
        double b = scanner.nextDouble();

        double sum = a + b;
        double diff = a - b ;

        System.out.println("The Sum is : "+ sum);
        System.out.println("The Difference is : "+ diff);

        scanner.close();
    }
}