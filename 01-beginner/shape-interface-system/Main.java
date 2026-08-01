//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE ARRAY
        Shape[] shapes = {new Circle("Red", 22.5),
                          new Rectangle("Blue", 10.5, 12)};
        
        //LOOP UNTIL CONDITION IS TRUE
        for(Shape shape : shapes){

            //CALL METHOD
            shape.displayColor();
            System.out.println("Area : " + shape.getArea());
            shape.draw();
            shape.resize(2.0);

            System.out.println();
        }
    }
}