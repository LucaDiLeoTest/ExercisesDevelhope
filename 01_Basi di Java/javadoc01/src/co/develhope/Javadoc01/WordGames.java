package co.develhope.Javadoc01;

/**
 * This class use two methods to classify the user.
 * @author Luca Di Leo
 */
public class WordGames {
    /**
     * This method welcome with a word.
     * @param word  it's a String.
     * @return a String.
     */
    String addHelloWord(String word){
        return "Hello " + word;
    }

    /**
     * This method print on console name and surname of the user.
     * @param name it's a String.
     * @param surname it's a String.
     * @return a String.
     */
    String getFullName(String name, String surname){
        return name + surname;
    }

}
