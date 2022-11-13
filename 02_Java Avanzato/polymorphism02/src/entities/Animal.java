package entities;
public class Animal {
    private String animalName;

    public Animal(String name){
        this.animalName = name;
    }
    public void animalSound(){
        System.out.println("default animal sound");
    }
}
