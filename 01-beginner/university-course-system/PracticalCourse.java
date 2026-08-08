//PRACTICAL COURSE
public class PracticalCourse extends Course {

    //DECLARE ATTRIBUTES
    private double labFee;

    //INITIALIZE
    public PracticalCourse(String courseCode, String courseName, int credits, double labFee){

        super(courseCode, courseName, credits);

        this.labFee = labFee;
    }

    //DECLARE METHODS
    @Override
    public void calculateFee(){

        System.out.println("Practical Course Fee : Rs. " + (super.credits * 7000 + this.labFee));
    }
}