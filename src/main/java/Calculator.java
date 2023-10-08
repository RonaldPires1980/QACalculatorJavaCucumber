import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int numberOne = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
        int numberTwo = scanner.nextInt();

        System.out.print("Enter the operation (Sum, Subtraction, Multiplication ou Division): ");
        String operation = scanner.next();

        double result = calculate(numberOne, numberTwo, operation);
        System.out.println("The result of the operation is : " + result);

        scanner.close();
    }

    public static double calculate(int numberOne, int numberTwo, @org.jetbrains.annotations.NotNull String operation) {
        double result = 0;
        int sum = numberOne + numberTwo;
        int subtraction = numberOne - numberTwo;
        double multiplication = numberOne * numberTwo;
        double division = (double) numberOne / numberTwo;

        switch (operation) {
            case "Sum":
                return sum;
            case "Subtraction":
                return subtraction;
            case "Multiplication":
                return multiplication;
            case "division":
                if (numberTwo != 0) {
                    return  division;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }

           default:
                System.out.println("Invalid operation. Please choose addition, subtraction, multiplication or division.");
        }
        return result;

    }
}




