import java.util.Scanner;

public class heronsFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side of triangle : ");
        double a = scanner.nextDouble();
        System.out.println("Enter second side of triangle : ");
        double b = scanner.nextDouble();
        System.out.println("Enter third side of triangle : ");
        double c = scanner.nextDouble();

        if(a+b > c && b+c > a && a+c>b){
            double s = (a+b+c) /2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("The area of Tringle using Heron's Formula is :" + area);
        }else{
            System.out.println("Invalid Traingle ");
        }

        scanner.close();

    }
}
