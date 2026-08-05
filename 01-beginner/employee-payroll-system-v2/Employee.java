//EMPLOYEE CLASS
public abstract class Employee {

    //DECLARE ATTRIBUTES
    protected String employeeID;
    protected String name;
    protected double basicSalary;

    //INITIALIZE
    Employee(String employeeID, String name, double basicSalary){

        this.employeeID = employeeID;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    //DECLARE METHODS
    //TO STRING
    @Override
    public String toString(){

        return "Employee{ Employee ID : " + this.employeeID +
                     ", Employee Name : " + this.name +
                     ", Basic Salary : Rs. " + this.basicSalary + " }";
    }

    //CALCULATE SALARY
    abstract double calculateSalary();

    //DISPLAY DETAILS
    public void displayDetails(){

        System.out.println("Employee ID   : " + this.employeeID);
        System.out.println("Employee Name : " + this.name);
        System.out.println("Basic Salary  : Rs. " + this.basicSalary);
    }
}