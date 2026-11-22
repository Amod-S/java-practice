import java.util.Scanner;

public class Main {

    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Enter your weight: ");
//        double weight = scanner.nextDouble();
//
//        System.out.print("Are you an adult? (true/false): ");
//        boolean isAdult = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old.");
//        System.out.println("You weigh " + weight + "kg");
//        if(isAdult){
//            System.out.println("You are an adult");
//        }
//        else {
//            System.out.println("You are NOT an adult.");
//        }

        /*common issue: if we try to take a string input after taking input of an integer or a double,
        so we input an integer say 23, and hit enter(\n) then there is still a \n in the input buffer.
        the string input catches that \n an assigns it to the new string object. to avoid that, use
        scanner.newLine(); after the integer/double input. this clears out the input buffer.
        * */
        System.out.println("Enter integer: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.print("string: ");
        String abc = scanner.nextLine();

        System.out.println("int: "+num);
        System.out.println("abc: "+abc);

        scanner.close();

    }
}
