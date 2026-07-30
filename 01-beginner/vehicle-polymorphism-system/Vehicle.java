//VEHICLE CLASS
public class Vehicle {

    //DECLARE ATTRIBUTES
    String brand;
    int speed;

    //PARAMETERIZE CONSTRUCTORS
    Vehicle(String brand, int speed){

        this.brand = brand;
        this.speed = speed;
    }

    //DECLARE METHODS
    void move(){

        System.out.println(this.brand + " is moving at " + this.speed + " km/h");
    }
}