package co.develhope.Javadoc02;

/**
 * This class make an instance of the ArithmeticOperators.java class and print the result.
 * @author Luca Di Leo
 */
public class Tester {
    public static void main(String[] args){
        ArithmeticOperators arithmeticOpObject = new ArithmeticOperators();
        System.out.println(arithmeticOpObject.sum(1, 2));
        System.out.println(arithmeticOpObject.sub(3, 5));
        System.out.println(arithmeticOpObject.mul(8, 3));
        System.out.println(arithmeticOpObject.div(4, 2));

    }
}
