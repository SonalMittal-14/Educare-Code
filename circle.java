import java.util.Scanner;

public class circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Radius of Circle : ");
        double radius = scanner.nextDouble();
        double pie = 3.14;

        double area = pie * radius * radius;
        double circum = 2 * pie * radius;

        System.out.println("Area is : " + area);
        System.out.println("Circumference is : "+ circum);

        scanner.close();
    }
}
