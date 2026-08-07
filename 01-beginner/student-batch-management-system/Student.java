//STUDENT CLASS
public class Student {

    //DECLARE ATTRIBUTES
    private String studentID;
    private String name;
    private int age;

    //INITIALIZE
    public Student(String studentID, String name, int age){

        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    //DECLARE METHODS
    //DISPLAY DETAILS
    public void displayStudent(){

        System.out.println("Student ID   : " + this.studentID);
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Age  : " + this.age);
    }
}