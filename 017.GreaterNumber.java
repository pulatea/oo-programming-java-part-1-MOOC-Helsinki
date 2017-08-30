import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int fnumber = Integer.parseInt(reader.nextLine());
        
          System.out.print("Type the second number: ");
        int snumber = Integer.parseInt(reader.nextLine());
        
        if(fnumber == snumber){
            System.out.println("Numbers are equal!");
        }else{
        System.out.println("Greater number is: " + Math.max(fnumber, snumber));
    }
    }
}
