//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE ARRAY
        Employee[] employees = {new Manager("E101", "Alice", 80000, 15000),
                                new Developer("E102", "Bob", 70000, 2, 6000),
                                new Developer("E103", "John", 70000, 5, 6000),
                                new Intern("E104", "Charlie", 25000, 5000),
                                new Manager("E105", "Thomas", 80000, 20000)};
        
        //LOOP UNTIL CONDITION IS TRUE
        for(Employee employee : employees){

            line();
            System.out.println("Employee Type : " + employee.getClass().getSimpleName());
            employee.displayDetails();
            System.out.println("Final Salary  : " + employee.calculateSalary());
            line();
        }
    }

    //LINE METHOD
    public static void line(){

        System.out.println("--------------------------------");
    }
}