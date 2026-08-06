//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE OBJECTS
        Address address01 = new Address("Maitland Place", "Colombo", "Sri Lanka");
        Address address02 = new Address("Anna Nagar", "Chennai", "India");

        Person person01 = new Person("Namiez", 18, address01);
        Person person02 = new Person("Hafiez", 15, address02);

        //CALL METHODS
        person01.displayInfo();

        System.out.println("---------------------------------------");

        person02.displayInfo();
    }
}