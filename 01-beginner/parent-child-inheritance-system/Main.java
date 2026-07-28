//MAIN CLASS
public class Main { 
    public static void main(String[] args){

        //CREATE OBJECT
        Parent parent01 = new Parent("NULL", "NULL");
        Child child01 = new Child("NULL", "NULL", "NULL");

        //CALL METHODS
        parent01.setName("John", "Doe");
        parent01.printName();

        child01.setName("John", "Doe");
        child01.setMiddleName("Man");
        child01.printFullName();
    }
}