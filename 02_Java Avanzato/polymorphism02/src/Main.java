import entities.Animal;
import entities.Cow;
import entities.Lion;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animale");
        animal.animalSound();
        Lion lion = new Lion("Simba");
        lion.animalSound();
        Cow cow = new Cow("Carolina");
        cow.animalSound();
    }
}