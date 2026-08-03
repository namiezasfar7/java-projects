//RESEARCH STUDENT
class ResearchStudent extends Student {

    //DECLARE METHODS
    @Override
    public double calculateFinalMark(double assignmentMark, double examMark) {
        
        return (assignmentMark * 0.70) + (examMark * 0.30);
    }
}