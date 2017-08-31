import java.util.Scanner;
public class ManyPrints{
    
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many"
                + "? ");
        int x = Integer.parseInt(in.nextLine());
        
        int times = 0;
        
        while(times < x){
            printText();
            times++;
        }
    }
    
     public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }  
}
