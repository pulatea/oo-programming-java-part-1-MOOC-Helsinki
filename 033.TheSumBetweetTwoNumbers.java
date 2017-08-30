
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int fnum = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        int snum = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while(fnum <= snum){
            sum += fnum;
            fnum++;
        }
        
        System.out.println("Sum is: " + sum);
        
    }
}
