//INTERN CLASS
public class Intern extends Employee {

    //DECLARE ATTRIBUTES
    private double allowance;

    //INITIALIZE
    Intern(String employeeID, String name, double basicSalary, double allowance){

        super(employeeID, name, basicSalary);

        this.allowance = allowance;
    }

    //DECLARE METHODS
    //TO STRING
    @Override
    public String toString(){

        return "Intern{ Employee ID : " + super.employeeID +
                    ", Employee Name : " + super.name +
                    ", Basic Salary : Rs. " + super.basicSalary +
                    ", Allowance : Rs. " + this.allowance + " }";
    }

    //CALCULATE SALARY
    @Override
    public double calculateSalary(){

        return basicSalary + allowance;
    }
}