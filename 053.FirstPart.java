
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word ");
        String word = reader.next();
        
        System.out.println("");
        
        System.out.println("Length of the first part: ");
        int lengthOfFirstPart = reader.nextInt();
        
        System.out.println("Result: " + word.substring(0,lengthOfFirstPart));
        
        
    }
}
