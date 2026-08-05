//MANAGER CLASS
public class Manager extends Employee {

    //DECLARE ATTRIBUTES
    private double bonus;

    //INITIALIZE
    Manager(String employeeID, String name, double basicSalary, double bonus){

        super(employeeID, name, basicSalary);

        this.bonus = bonus;
    }

    //DECLARE METHODS
    //TO STRING
    @Override
    public String toString(){

        return "Manager{ Employee ID : " + super.employeeID +
                    ", Employee Name : " + super.name +
                    ", Basic Salary : Rs. " + super.basicSalary +
                    ", Bonus : Rs. " + this.bonus + " }";
    }

    //CALCULATE SALARY
    @Override
    public double calculateSalary(){

        return basicSalary + bonus;
    }
}