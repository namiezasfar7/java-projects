//RESEARCH COURSE
public class ResearchCourse extends Course {

    //DECLARE ATTRIBUTES
    private double researchFee;

    //INITIALIZE
    public ResearchCourse(String courseCode, String courseName, int credits, double researchFee){

        super(courseCode, courseName, credits);

        this.researchFee = researchFee;
    }

    //DECLARE METHODS
    @Override
    public void calculateFee(){

        System.out.println("Research Course Fee : Rs. " + (super.credits * 10000 + this.researchFee));
    }
}