import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = sc.nextDouble();

        System.out.print("Enter another number: ");
        double b = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = sc.next();

        sc.close();

        double result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
            {
                // check for divide by zero
                if(b == 0) {
                    System.out.println("\nCannot divide by zero");
                    return;
                }
                result = a / b;
            }
                break;
            default:
            {
                System.out.println("\nInvalid operator");
                return;
            }
        }
        System.out.println("\nThe result is: " + result);
    }
}
