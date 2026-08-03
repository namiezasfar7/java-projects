//POSTGRADUATE STUDENT
class PostgraduateStudent extends Student {

    //DECLARE METHODS
    @Override
    public double calculateFinalMark(double assignmentMark, double examMark){
        
        return (assignmentMark * 0.50) + (examMark * 0.50);
    }
}