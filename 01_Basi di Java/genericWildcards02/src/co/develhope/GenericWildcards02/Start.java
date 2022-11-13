package co.develhope.GenericWildcards02;

public class Start {
    public static void main(String[] args) {
        GenericsClass <Integer> genObj1 = new GenericsClass();
        GenericsClass <Integer> genObj2 = new GenericsClass();
        GenericsClass <String> genObj3 = new GenericsClass();
        GenericsClass <String> genObj4 = new GenericsClass();

        genObj1.setT(12);
        genObj2.setT(13);
        genObj3.setT("This is a string");
        genObj4.setT("This is a string");

        System.out.println(GenericsClass.isEqual(genObj1, genObj2));
        System.out.println(GenericsClass.isEqual(genObj3, genObj4));
    }
}