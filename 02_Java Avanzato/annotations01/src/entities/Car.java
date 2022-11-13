package entities;
public class Car {
    public String modelName;
    public double mileage;

    public  Car(String model, double miles){
        this.modelName = model;
        this.mileage = miles;
    }
    @Deprecated
    public void printCarDetails(){
        System.out.println(modelName + " " + mileage);
    }

    public void getCarDetails(){
        System.out.println(modelName);
        System.out.println(mileage);
    }

}
