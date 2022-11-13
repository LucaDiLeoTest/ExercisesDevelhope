package co.develhope.DefaultMethodsOverride;

public class SmartphonePrice implements Cloneable{
    public String priceType;
    public double priceInEuros;

    public SmartphonePrice(String type , double price){
        this.priceType = type;
        this.priceInEuros = price;
    }

    @Override
    public String toString() {
        return priceType + priceInEuros;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
