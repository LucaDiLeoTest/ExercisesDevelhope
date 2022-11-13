package co.develhope.classesAndObjects01;

public class TestProgrammers {
    public static void main(String [] args) {
        Programmer programmer01 = new Programmer();
        programmer01.name = "subject01";
        programmer01.age = 20;
        programmer01.wearGlasses = true;
        programmer01.drinkCoffe();
        programmer01.printDetails();

        Programmer programmer02 = new Programmer();
        programmer02.name = "subject02";
        programmer02.age = 25;
        programmer02.wearGlasses = false;
        programmer02.printDetails();
        programmer02.hasGlasses();
    }
}
