package co.develhope.InterfaceAbstractionOverride;

public class Boat extends AbstractVehicle {
    public double maxKnotSpeed;
    public int boatKilosWeight;

    public Boat(double maxSpeed, int weight){
        this.type = "boat";
        this.maxKnotSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    /**
     * Method that gives boat's max knot speed and boat weight
     * @param maxKnotSpeed  double that give us info about max speed
     * @param boatKilosWeight int that give us info about the total weight the boat can carry
     * @return a String with all the info in one line
     */
    public String getBoatWeightAndSpeed(double maxKnotSpeed, int boatKilosWeight){
        return "The total boat's weight is: "+ boatKilosWeight + " The max speed is: " +maxKnotSpeed ;
    }

    @Override
    public void doVehicleSound(){
        System.out.println("boat sounds!");
    }
}
