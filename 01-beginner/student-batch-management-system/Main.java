//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //DECLARE OBJECTS
        Student student01 = new Student("S01", "Sheshanth", 18);
        Student student02 = new Student("S02", "Lakmina", 18);

        Batch batch01 = new Batch("B01", "DSE261F", student01, student02);

        //CALL METHODS
        batch01.displayBatch();
    }
}