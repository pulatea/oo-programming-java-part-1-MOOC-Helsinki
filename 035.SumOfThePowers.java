
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int num = 0;
        int sum = 0;
        
        while(num <= number){
            sum += Math.pow(2, num);
            num++;
        }
        
        System.out.println("The result is: " + sum);

    }
}
