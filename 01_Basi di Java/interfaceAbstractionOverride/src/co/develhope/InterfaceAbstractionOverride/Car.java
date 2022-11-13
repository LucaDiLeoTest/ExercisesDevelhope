package co.develhope.InterfaceAbstractionOverride;

public class Car extends AbstractVehicle{
    public int numberOfDoors;
    public double carPrice;

    public Car(int wheels, int doors, double price){
        this.type = "car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("The car has: " + numberOfDoors + "doors!");
    }
    @Override
    public void doVehicleSound(){
        System.out.println("Wrooom");
    }
}
