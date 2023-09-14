
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class StringSpliceAndDice {
    public static void main(String[] args) {
        String[] wordArray = new String[]{"Hello", "World", "How", "are", "you"};
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordArray));

        String sentence = "";

        for (String word : wordArray) {
            sentence += word + " ";
        }
        System.out.println("Our sentence using concat: " + sentence);

        sentence = String.join(" ", "Hello", "World", "How", "are", "you");
        System.out.println("Our sentence using join, variable list of String: " + sentence);

        sentence = String.join(" ", wordArray);
        System.out.println("Our sentence using join, Array of String: " + sentence);

        sentence = String.join(" ", wordList);
        System.out.println("Our sentence using join, ArrayList of String: " + sentence);


        StringJoiner sj = new StringJoiner(" ");
        for (String word : wordArray) sj.add(word);
        sentence = sj.toString();
        System.out.println("Our sentence using StringJoiner: " + sentence);


        sentence = String.join(" ", wordList);
        String[] splitWords = sentence.split(" ");
        System.out.println(Arrays.toString(splitWords));


        sentence = String.join("\u0020\t\u0020\n", wordList);
        System.out.println("Our sentence with spaces and tabs and carriage returns: " + sentence);

        splitWords = sentence.split("\\s+");
        System.out.println(Arrays.toString(splitWords));

        sentence = String.join(" ", wordList);  
        splitWords = sentence.split(" ", 2);
        System.out.println(Arrays.toString(splitWords));


    }
}