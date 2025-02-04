import java.util.Scanner;

public class square_and_cube {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please your Highness!! Enter a Number: ");
        int a = scanner.nextInt();
        int square_root = a*a;
        int cube_root = a*a*a;

        System.out.println("Your Highness!! Sqaure root is : " + square_root);
        System.out.println("Your Highness !! Cube root is : "+ cube_root);

        scanner.close();
    }
}
