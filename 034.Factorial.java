import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int factorial = 1;
        int num = 1;
        
        while(num <= number){
            factorial *= num;
            num++;
        }
        
        System.out.println("Factorial is: " + factorial);

    }
}
