//MAIN CLASS
public class Main {
    public static void main(String[] args) {
        
        //DECLARE VARIABLES
        double assignmentMark = 80.0;
        double examMark = 70.0;

        //CREATE OBJECTS
        Student ugStudent = new UndergraduateStudent();
        Student pgStudent = new PostgraduateStudent();
        Student resStudent = new ResearchStudent();

        //CALL METHODS
        double ugFinal = ugStudent.calculateFinalMark(assignmentMark, examMark);
        double pgFinal = pgStudent.calculateFinalMark(assignmentMark, examMark);
        double resFinal = resStudent.calculateFinalMark(assignmentMark, examMark);

        //PRINT OUTPUT
        System.out.println("Undergraduate Student Final Mark : " + ugFinal);
        System.out.println("Postgraduate Student Final Mark  : " + pgFinal);
        System.out.println("Research Student Final Mark      : " + resFinal);
    }
}