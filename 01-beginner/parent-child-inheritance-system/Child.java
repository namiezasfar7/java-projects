//CHILD CLASS
class Child extends Parent {

    //DECLARE ATTRIBUTES
    private String middleName;

    //PARAMETERIZED CONSTRUCTOR
    public Child(String firstName, String middleName, String lastName){

        //CALL PARENT CONSTRUCTOR
        super(firstName, lastName);

        this.middleName = middleName;
    }

    //DECLARE METHOD
    //SET MIDDLE NAME
    public void setMiddleName(String middleName){

        this.middleName = middleName;
    }

    //PRINT FULL NAME
    public void printFullName(){

        System.out.println("Full Name : " + super.firstName + " " + this.middleName + " " + super.lastName);
    }
}