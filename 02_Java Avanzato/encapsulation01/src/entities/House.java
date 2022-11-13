package entities;

import java.util.Arrays;

public class House {
    //Attributes
    private String address;
    private int floorsNumber;
    private String[] residentsNames;


    //Encapsulation for address attribute
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    //Encapsulation for floorsNumber attribute
    public void setFloorsNumber(int floors){
        this.floorsNumber = floors;
    }
    public int getFloorsNumber(){
        return floorsNumber;
    }

    //Encapsulation for residentsNames
    public void setResidentsNames(String[] residents){
        this.residentsNames = residents;
    }
    public String[] getResidentsNames(){
        return residentsNames;
    }

}
