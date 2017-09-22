import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        
        System.out.println("");
        
        System.out.print("Length of the end part: ");
        int lengthOfTheEndPart = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        System.out.print("Result: " + word.substring(word.length() - lengthOfTheEndPart, word.length()));
    
        System.out.println("");
    }
}
