import java.util.Scanner;

public class netsalary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr your basic salary : ");
        double basicSalary = scanner.nextDouble();

        double HRA = 0.10 * basicSalary;
        double DA = 0.15 * basicSalary;
        double gross_salary = basicSalary + HRA + DA;

        double IT = 0.05 * gross_salary;
        double PF = 0.12 * basicSalary; 
        double deduction = IT + PF;
  

        double netSalary = gross_salary - deduction;
        System.out.println("Your Net Salary is : "+netSalary);

        scanner.close();
    }
}
