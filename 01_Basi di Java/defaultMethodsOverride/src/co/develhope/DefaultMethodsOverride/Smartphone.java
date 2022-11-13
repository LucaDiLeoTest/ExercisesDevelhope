package co.develhope.DefaultMethodsOverride;

import java.util.Objects;

public class Smartphone implements Cloneable{
    public String brandName;
    public String modelName;
    public int batterymAh;
    public SmartphonePrice producerPrice;
    public SmartphonePrice retailPrice;

    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }

    @Override
    public String toString(){
       return brandName + " | " + modelName + " | " + batterymAh + " | " + producerPrice + " | " + retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && brandName.equals(that.brandName) && modelName.equals(that.modelName) && producerPrice.equals(that.producerPrice) && retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}
