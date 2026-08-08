//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE ARRAY
        Course[] courses = {new TheoryCourse("C101", "Computer Systems", 4),
                            new PracticalCourse("C102", "Digital Logics", 3, 2000),
                            new ResearchCourse("C103", "AI & ML", 5, 5000)};
        
        //LOOP UNTIL CONDITION IS TRUE
        for(Course course : courses){

            printLine();
            System.out.println("Course Code    : " + course.getCourseCode());
            System.out.println("Course Name    : " + course.getCourseName());
            System.out.println("Course Credits : " + course.getCredits());

            printLine();
            course.calculateFee();
            printLine();
        }
    }

    //PRINT LINE METHOD
    public static void printLine(){

        System.out.println("=====================================");
    }
}