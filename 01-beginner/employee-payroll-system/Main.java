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

    public void set(int hoursWorked){
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
        //CREATE OBJECT
        Employee employee01 = new Employee("Sheshanth", 100000, 45);

        //PRINT OUTPUT
        System.out.println("Employee Name : " + employee01.getName());
        System.out.println("Basic Salary : " + employee01.getBasicSalary());
        System.out.println("Hours Worked : " + employee01.getHoursWorked());
        System.out.println("Net Salary : " + employee01.calculateNetSalary());
    }
}