//CAR CLASS
public class Car extends Vehicle {

    //DECLARE ATTRIBUTES
    String fuelType;

    //INITIALIZE
    Car(String brand, int speed, String fuelType){

        super(brand, speed);

        this.fuelType = fuelType;
    }

    //DECLARE METHODS
    @Override
    public String toString(){

        return "Vehicle{ Brand : " + brand + ", Speed : " + speed + ", Fuel Type : " + fuelType + "}";
    }

    @Override
    void fuelUp(){

        System.out.println(brand + " refueling with " + fuelType);
    }
}