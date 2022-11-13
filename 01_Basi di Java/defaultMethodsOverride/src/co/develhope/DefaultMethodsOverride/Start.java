package co.develhope.DefaultMethodsOverride;

public class Start {
    public static void main(String[] args){
    SmartphonePrice producer1 = new SmartphonePrice("producer price ", 1199.9);
    SmartphonePrice producer2 = new SmartphonePrice("producer price ", 1099.9);
    SmartphonePrice retail1 = new SmartphonePrice("retail price ", 799.9);
    SmartphonePrice retail2 = new SmartphonePrice("retail price ", 699.9);

    Smartphone iphone = new Smartphone("IPHONE", "Iphone 13", 3240, producer1, retail1);
    Smartphone samsung = new Smartphone("SAMSUNG", "Samsung s23",3000, producer2, retail2);

        System.out.println("Smartphone: " + iphone);
        System.out.println("Smartphone: " + samsung);

        System.out.println("are the two phones equals? " + iphone.equals(samsung));

        try{
            System.out.println("-----Creating a smartphone clone-----");
            Smartphone samsungClone = (Smartphone) samsung.clone();
            System.out.println("phone clone: " + samsungClone);
            System.out.println("are phone and his clone equals? " + samsung.equals(samsungClone));
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error, the smartphone are different");
        }
    }
}
