
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        
        System.out.print("Type a number: ");
        int fnumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int snumber = Integer.parseInt(reader.nextLine());
        
        System.out.println("The biggest number of the two number given was: " + 
                Math.max(fnumber, snumber));
    }
}
