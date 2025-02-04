import java.util.Scanner;

public class area_peri {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle : ");
        double l = scanner.nextDouble();
        System.out.println("Enter Breadth of Rectangle : ");
        double b = scanner.nextDouble();

        double area = l*b;
        double perimeter = 2 * (l+b);

        System.out.println("Area is : " + area);
        System.out.println("Perimeter is : "+ perimeter);

        scanner.close();
    }
}
