//UNDERGRADUATE STUDENT
class UndergraduateStudent extends Student {

    //DECLARE METHODS
    @Override
    public double calculateFinalMark(double assignmentMark, double examMark){

        return (assignmentMark * 0.40) + (examMark * 0.60);
    }
}