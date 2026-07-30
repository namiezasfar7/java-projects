//CAR CLASS
public class Car extends Vehicle {

    //DECLARE ATTRIBUTES
    String fuelType;

    //PARAMETERIZE CONSTRUCTORS
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
    void move(){

        System.out.println(this.brand + " is moving at " + this.speed + " km/h with Fuel Type " + fuelType);
    }

    void refuel(){

        System.out.println(this.brand + " is refueling with " + fuelType);
    }
}