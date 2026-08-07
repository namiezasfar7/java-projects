//BATCH CLASS
public class Batch {

    //DECLARE ATTRIBUTES
    private String batchID;
    private String batchName;

    private Student student01;
    private Student student02;

    //INITIALIZE
    public Batch(String batchID, String batchName, Student student01, Student student02){

        this.batchID = batchID;
        this.batchName = batchName;
        this.student01 = student01;
        this.student02 = student02;
    }

    //DECLARE METHODS
    //DIPLAY METHODS
    public void displayBatch(){

        System.out.println("===============================");

        System.out.println("Batch ID   : " + this.batchID);
        System.out.println("Batch Name : " + this.batchName);

        System.out.println("===============================");

        System.out.println("Student 01");
        student01.displayStudent();

        System.out.println("===============================");

        System.out.println("Student 02");
        student02.displayStudent();

        System.out.println("===============================");
    }
}