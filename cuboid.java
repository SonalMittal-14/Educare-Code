import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of a Cuboid : ");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth of a cuboid : ");
        double breadth = scanner.nextDouble();
        System.out.println("Enter height of a Cuboid : ");
        double height = scanner.nextDouble();

        double volume = length * breadth * height;
        double surface_area = 2 * (length *breadth + breadth * height + length * height);
        double diagonal = Math.sqrt(length * length + breadth * breadth + height * height);

        System.out.println("Volume of a Cuboid is : " + volume);
        System.out.println("Surface Area of a cuboid is : " + surface_area);
        System.out.println("Diagonal of a cuboid is : " + diagonal);

        scanner.close();

    }
}
