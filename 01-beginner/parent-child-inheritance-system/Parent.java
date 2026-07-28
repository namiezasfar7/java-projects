//PARENT CLASS
class Parent {

    //DECLARE ATTRIBUTES
    protected String firstName;
    protected String lastName;

    //PARAMETERIZED CONSTRUCTOR
    public Parent(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
    }

    //DECLARE METHOD
    //SET FIRST & LAST NAME
    public void setName(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
    }

    //PRINT NAME
    public void printName(){

        System.out.println("Name : " + this.firstName + " " + this.lastName);
    }
}