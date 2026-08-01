//SHAPE CLASS
public abstract class Shape implements Drawable, Resizable {

    //DECLARE ATTRIBUTES
    String color;

    //INITIALIZE
    Shape(String color){

        this.color = color;
    }

    //DECLARE METHODS
    //TO STRING METHOD
    @Override
    public String toString(){

        return "Shape{ Color : " + color + " }";
    }

    //ABSTRACT GET AREA METHOD
    abstract double getArea();

    //DISPLAY COLOR METHOD
    void displayColor(){

        System.out.println("Color : " + this.color);
    }
}