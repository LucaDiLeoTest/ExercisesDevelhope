package co.develhope.inputAndOutput05;

import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //create a new Scanner
        System.out.println("Enter your age: ");
        int age = input.nextInt(); //read the integer number input from user
        System.out.printf("Your age is: %d", age);
        input.close(); //close the scanner(do not read anymore user input)
    }
}
