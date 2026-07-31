//ELECTRIC CAR CLASS
public class ElectricCar extends Vehicle {

    //DECLARE ATTRIBUTES
    int batteryLevel;

    //INITIALIZE
    ElectricCar(String brand, int speed, int batteryLevel){

        super(brand, speed);

        this.batteryLevel = batteryLevel;
    }

    //DECLARE METHODS
    @Override
    public String toString(){

        return "Vehicle{ Brand : " + brand + ", Speed : " + speed + ", Battery Level : " + batteryLevel + "}";
    }

    @Override
    void fuelUp(){

        System.out.println(brand + " charging. Battery : " + batteryLevel + "%");
    }
}