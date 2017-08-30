import java.util.Scanner;
public class Temperatures {
public static void main(String[] args) {

    Scanner reader = new Scanner(System.in); 
    
    while (true) {
        System.out.print("Enter a daily temperature: ");
        double dailyTemp = Double.parseDouble(reader.nextLine());

        if (dailyTemp > -31.0 && dailyTemp < 41.0) {
        Graph.addNumber(dailyTemp);

        }

            }

    // Graph is used as follows:

    //Graph.addNumber(dailyTemp);
    // Remove or comment out these lines above before trying to run
}
}
