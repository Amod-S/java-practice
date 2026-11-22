import java.util.Scanner;

public class Madlibs {
    public static void main(){
        //this program calculates the area of a rectangle by taking input of the side measurements.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--------Mad Libs game-----------");

        String adjective1;
        String noun1;
        String verb;
        String noun2;
        String adjective2;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("\nEnter an noun (animal): ");
        noun1 = scanner.nextLine();
        System.out.print("\nEnter an verb (action in -ing form): ");
        verb = scanner.nextLine();
        System.out.print("\nEnter an noun (person/place/thing): ");
        noun2 = scanner.nextLine();
        System.out.print("\nEnter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.println("I am a " + adjective1 + " " + noun1 + ".");
        System.out.println("I am " + verb + " with a " + noun2 + ".");
        System.out.println("It is very " + adjective2 + "!");

        scanner.close();
    }
}
















