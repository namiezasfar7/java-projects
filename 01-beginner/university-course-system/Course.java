//COURSE CLASS
public abstract class Course {

    //DECLARE ATTRIBUTES
    String courseCode;
    String courseName;
    int credits;

    //INITIALIZE
    Course(String courseCode, String courseName, int credits){

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    //DECLARE GETTERS
    public String getCourseCode(){

        return this.courseCode;
    }

    public String getCourseName(){

        return this.courseName;
    }

    public int getCredits(){

        return this.credits;
    }

    //DECLARE METHODS
    abstract void calculateFee();
}