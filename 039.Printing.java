public class Printing {

    public static void printStars(int amount) {
        int number = 0;
    
        while(number < amount){
            System.out.print("*");
            number++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int number = 0;
        
        while(number < sideSize){
            printStars(sideSize);
            //System.out.println();
            number++;
        }
        
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int number = 0;
        while(number < height){
            printStars(width);
            //System.out.println();
            number++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        
        int number = 0;
        
        while(number < size){
            number++;
            printStars(number);
            //System.out.println("");           
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, you can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
 
        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
}
