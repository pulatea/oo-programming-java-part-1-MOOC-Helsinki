import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        
        ArrayList<String> words = new ArrayList<String>();
        
        String word = "";
        
        while(true){
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);
            
            if(word.isEmpty())
                break;
        }
        
        Collections.reverse(words);
        System.out.println("You typed the following words: ");
        for(String allWords : words){
            System.out.println(allWords);
        }
    }
}
