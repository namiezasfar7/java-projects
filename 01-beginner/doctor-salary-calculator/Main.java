//DOCTOR CLASS
class Doctor {

    //DECLARE ATTRIBUTES
    protected int id;
    protected double salary;

    //PARAMETERIZE CONSTRUCTOR
    public Doctor(int id, double salary){

        this.id = id;
        this.salary = salary;
    }

    //DECLARE METHOD
    //PRINT DETAILS
    public void printDetails(){

        System.out.println("Doctor ID : " + id);
        System.out.printf("Salary : Rs. %.2f", salary);
    }
}

//SURGEON CLASS
class Surgeon extends Doctor {

    //DECLARE ATTRIBUTES
    protected int hours;
    protected double hourlyRate;

    //PARAMETERIZE CONSTRUCTOR
    public Surgeon(int id, double salary, int hours, double hourlyRate){

        //CALL PARENT CONSTRUCTOR
        super(id, salary);

        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    //DECLARE METHOD
    //PRINT DETAILS
    public void calculateSalary(){

        salary = salary + (hours * hourlyRate);
    }
}

//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE OBJECT
        Surgeon surgeon01 = new Surgeon(101, 50000, 45, 1500);

        //CALL METHODS
        surgeon01.calculateSalary();

        surgeon01.printDetails();
    }
}