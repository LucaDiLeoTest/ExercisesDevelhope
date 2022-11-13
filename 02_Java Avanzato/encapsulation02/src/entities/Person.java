package entities;

public class Person {
    protected String name;
    protected String surname;
    protected double height;
    protected int age;

    //Encapsulation attributes
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
