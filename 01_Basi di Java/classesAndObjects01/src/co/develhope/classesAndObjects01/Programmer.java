package co.develhope.classesAndObjects01;

public class Programmer {
    public String name;
    public int age;
    public boolean wearGlasses;

    public void drinkCoffe(){
        System.out.println("Espresso is the secret!");
    }
    public void printDetails(){
        System.out.printf("%s is a %s -yo programmer %n", name, age);
    }
    public void hasGlasses() {
        System.out.printf("Is %s wearing glasses? %b %n", name, wearGlasses);
    }
}
