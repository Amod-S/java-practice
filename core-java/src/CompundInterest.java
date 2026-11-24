import java.util.Scanner;

public class CompundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double totalAmt, principleAmt, roi, frequency, time;

        System.out.println("--Compound interest calculator--");
        System.out.println("Enter the details: ");
        System.out.print("Initial(principal) amount: ");
        principleAmt = scanner.nextDouble();
        System.out.print("Rate of interest: ");
        roi = scanner.nextDouble();
        System.out.print("Frequency of compounding: ");
        frequency = scanner.nextDouble();
        System.out.print("Total period of investment: ");
        time = scanner.nextDouble();

        totalAmt = principleAmt * Math.pow(1 + (roi / frequency), (frequency * time));

        System.out.printf("\nThe final amount after %f years is : %.2f Rs.", time, totalAmt);

        scanner.close();
    }
}
