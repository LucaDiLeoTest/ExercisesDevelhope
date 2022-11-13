package co.develhope.InterfaceAbstractionOverride;

public class Start {
    public static void main(String[] args){
        Car car = new Car(4, 4, 15.000);
        car.showVehicleDetails();
        car.doVehicleSound();

        Boat boat = new Boat(45.82, 200);
        boat.showVehicleDetails();
        boat.doVehicleSound();
        boat.getBoatWeightAndSpeed(45.82, 200);

    }
}
