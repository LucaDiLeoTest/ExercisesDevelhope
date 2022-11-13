package entities;
import annotations.*;
public class Greetings {

    @DevAnnotation(DevName = "John",DevSurname = "Walker")
    public void sayWelcome(){
        System.out.println("welcome user");
    }

    @DevAnnotation(DevName = "Mark",DevSurname = "Brown")
    public void sayGoodbye(){
        System.out.println("goodbye user");
    }
}
