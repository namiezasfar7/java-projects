//MAIN CLASS
public class Main {
    public static void main(String[] args){

        //CREATE ARRAY
        Vehicle[] vehicles = {new Car("Toyota", 140, "Petrol"),
                              new ElectricCar("Tesla", 150, 67)};

        //LOOP UNTIL CONDITION IS TRUE
        for(Vehicle vehicle : vehicles){

            //CALL METHODS
            vehicle.fuelUp();
            vehicle.move();
            System.out.println();
        }
    }
}