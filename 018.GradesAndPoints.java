
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points: [0-60]:");
        int points = Integer.parseInt(reader.nextLine());
        
        if(points <= 29){
            System.out.print("Failed.");
        }else if(points >= 30 && points <= 34){
            System.out.print("Grade: 1");
        }else if(points >= 35 && points <= 39){
            System.out.print("Grade: 2");
        }else if(points >= 40 && points <= 44){
            System.out.print("Grade: 3");
        }else if(points >= 45 && points <= 49){
            System.out.print("Grade: 4");
        }else //if(points >= 50 && points <= 60)
        {
            System.out.print("Grade: 5");
        }
//        }else{
//           System.out.print("The points should be between 0 - 60!");
//        }

    }
}
