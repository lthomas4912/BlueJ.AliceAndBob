/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
     System.out.println("Enter a name");
     Scanner oww = new Scanner(System.in);
     String name = oww.nextLine();
     
     if(name.equals("Alice") || name.equals("Bob")) {
         System.out.println("Hello " + name + ".");

    }

}
}