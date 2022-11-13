package co.develhope.Javadoc01;

/**
 * This class instance the methods of the class WordGames.java .
 * @author Luca Di Leo
 */
public class Tester {
    /**
     * The main method is used for instantiate and object and to print something on console.
     * @param args
     */
    public static void main(String[] args){
        WordGames wordGamesObject = new WordGames();
        System.out.print(wordGamesObject.addHelloWord("tester: "));
        System.out.print(wordGamesObject.getFullName("Luca", " Di Leo"));
    }
}
