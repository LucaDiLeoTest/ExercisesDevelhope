package co.develhope.InterfaceAbstractionOverride;

public abstract class AbstractVehicle {
    public String type;
    public int numberOfWheels;
    public void showVehicleDetails(){
        System.out.println(type + " " + numberOfWheels);
    }
    public abstract void doVehicleSound();
}
