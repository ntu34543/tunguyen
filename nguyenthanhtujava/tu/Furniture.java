package tu;
import java.util.Scanner;

public class Furniture {
    public static void main(String[] args) {
        System.out.println("Choose:\n1.Pine\n2.Oak\n3.Mahogany");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String wood_type;
        wood_type=sc.nextLine();
        switch(wood_type) {
            case "1": System.out.print("You choose pine with price 100$");break;
            case "2": System.out.print("You choose oak with price 225$");break;
            case "3": System.out.print("You choose mahogany with price 310$");break;
            default: System.out.print("No result and price is 0$");
        }
    }        
}
    
