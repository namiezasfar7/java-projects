//DEVELOPER CLASS
public class Developer extends Employee {

    //DECLARE ATTRIBUTES
    private int overtimeHours;
    private double hourlyRate;

    //INITIALIZE
    Developer(String employeeID, String name, double basicSalary, int overtimeHours, double hourlyRate){

        super(employeeID, name, basicSalary);

        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    //DECLARE METHODS
    //TO STRING
    @Override
    public String toString(){

        return "Developer{ Employee ID : " + super.employeeID +
                    ", Employee Name : " + super.name +
                    ", Basic Salary : Rs. " + super.basicSalary +
                    ", Overtime Hours : " + this.overtimeHours +
                    ", Hourly Rate : Rs. " + this.hourlyRate + " }";
    }

    //CALCULATE SALARY
    @Override
    public double calculateSalary(){

        return basicSalary + (overtimeHours * hourlyRate);
    }
}