//PERSON CLASS
public class Person {

    //DECLARE ATTRIBUTES
    String name;
    int age;
    Address address;

    //INITIALIZE
    Person(String name, int age, Address address){

        this.name = name;
        this.age = age;
        this.address = address;
    }

    //DECLARE METHODS
    //DISPLAY INFO
    public void displayInfo(){

        System.out.println("Name    : " + this.name);
        System.out.println("Age     : " + this.age);
        System.out.println("Address : " + this.address);
    }
}