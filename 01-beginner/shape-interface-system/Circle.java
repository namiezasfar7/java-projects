//CIRCLE CLASS
public class Circle extends Shape implements Drawable, Resizable {

    //DECLARE ATTRIBUTES
    double radius;

    //INITIALIZE
    Circle(String color, double radius){

        super(color);

        this.radius = radius;
    }

    //DECLARE METHOD
    //TO STRING METHOD
    @Override
    public String toString(){

        return "Circle{ Color : " + super.color + ", Radius : " + this.radius + " }";
    }

    //GET AREA METHOD
    @Override
    double getArea(){

        return Math.PI * this.radius * this.radius;
    }

    //DRAW METHOD
    @Override
    public void draw(){

        System.out.println("Drawing circle with radius " + this.radius);
    }

    //RESIZE METHOD
    @Override
    public void resize(double factor){

        System.out.println("New Radius : " + (this.radius * factor));
    }
}