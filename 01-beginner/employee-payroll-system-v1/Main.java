import java.util.Scanner;

//EMPLOYEE CLASS
class Employee {
    //DECLARE ATTRIBUTES
    private String name;
    private double basicSalary;
    private int hoursWorked;

    //INITIALIZE
    public Employee(String name, double basicSalary, int hoursWorked){
        this.name = name;
        this.basicSalary = basicSalary;
        this.hoursWorked = hoursWorked;
    }

    //DECLARE SETTERS
    public void setName(String name){
        this.name = name;
    }

    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    //DECLARE GETTERS
    public String getName(){
        return name;
    }

    public double getBasicSalary(){
        return basicSalary;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    //DECLARE METHODS
    //CALCULATE NET SALARY
    public double calculateNetSalary(){
        double overtime = 0;

        if (hoursWorked > 40) {
            overtime = (hoursWorked - 40) * 500;
        }

        double grossSalary = basicSalary + overtime;
        double tax = grossSalary * 0.10;

        return grossSalary - tax;
    }
}

//MAIN CLASS
public class Main {
    public static void main(String[] args){
        //CREATE SCANNER
        Scanner input = new Scanner(System.in);

        //DECLARE VARIABLES
        String name;
        double salary;
        int hoursWorked;

        //GET USER INPUT
        System.out.print("\nEnter Employee Name     : ");
        name = input.nextLine();

        System.out.print("Enter Employee Salary   : Rs. ");
        salary = input.nextDouble();

        System.out.print("Enter Hours Worked      : ");
        hoursWorked = input.nextInt();
        System.out.println();

        //CREATE OBJECT
        Employee employee01 = new Employee(name, salary, hoursWorked);

        //PRINT OUTPUT
        System.out.println("===================================");
        System.out.println("Employee Name           : " + employee01.getName());
        System.out.println("Basic Salary            : Rs. " + employee01.getBasicSalary());
        System.out.println("Hours Worked            : " + employee01.getHoursWorked());
        System.out.println("Net Salary              : Rs. " + employee01.calculateNetSalary());
        System.out.println("===================================\n");

        //CLOSE SCANNER
        input.close();
    }
}