import java.util.Scanner;

public class MathExercises {
    public static void main(){
        //basic maths exercises
        Scanner scanner = new Scanner(System.in);

        int userChoice;

        System.out.println("---------Mathematics---------");
        System.out.println("What would you like to do? (1/2/3)");
        System.out.println("1. Calculate area of a rectangle.");
        System.out.println("2. Calculate circumference and area of a circle.");
        System.out.println("3. Calculate the hypotenuse of a right angled triangle.");
        userChoice = scanner.nextInt();

        if(userChoice == 1){
            System.out.println("-------- Rectangle Area Calculator---------");
            double length;
            double breadth;

            System.out.print("Enter the length of the rectangle: ");
            length = scanner.nextDouble();
            System.out.print("Enter the breadth of the rectangle: ");
            breadth = scanner.nextDouble();
            scanner.nextLine();

            double area = length * breadth;
            System.out.println("Area of the rectangle is: " + area + " cm²");
            System.out.println("--------Area Calculator---------");
        }
        else if(userChoice == 2){
            double radius,area, circumference;
            System.out.print("Enter the radius of the circle: ");
            radius = scanner.nextDouble();
            circumference = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius, 2);
            System.out.printf("Circumference of the circle is %.2f \n", circumference);
            System.out.printf("Area of the circle is %.2f square units\n", area);

        }
        else if (userChoice == 3) {
            double a, b, c;
            System.out.print("Enter length of side a: ");
            a = scanner.nextDouble();
            System.out.print("Enter length of side b: ");
            b = scanner.nextDouble();
            c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("The side c is of: " + c + " units.");
        }
        else{
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}