import entities.Car;
public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Car car = new Car("panda 4x4", 12000);
        car.getCarDetails();
        car.printCarDetails();
    }
}