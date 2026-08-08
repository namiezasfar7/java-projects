//THEORY COURSE
public class TheoryCourse extends Course {

    //INITIALIZE
    public TheoryCourse(String courseCode, String courseName, int credits){

        super(courseCode, courseName, credits);
    }

    //DECLARE METHODS
    @Override
    public void calculateFee(){

        System.out.println("Theory Course Fee : Rs. " + (super.credits * 5000));
    }
}