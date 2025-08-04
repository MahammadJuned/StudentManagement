import java.util.Scanner;
import java.util.InputMismatchException;
public class CalculatorApp {
    static Scanner sc = new Scanner(System.in);
    public static double addition(double a, double b) {
        return a + b;
    }
    public static double subtraction(double a, double b) {
        return a - b;
    }
    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
    }

    public static double getValidDouble(String prompt) {
        while(true) {
            try {
                System.out.println(prompt);
                return sc.nextDouble();
            } catch(InputMismatchException e) {
                System.out.println("Invalid input please enter a valid number");
                sc.next();
            }
        }
    }

       public static int getValidInt(String prompt) {
        while(true) {
            try {
                System.out.println(prompt);
                return sc.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Invalid input please enter a valid option");
                sc.next();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("**********WELCOME TO THE CALCULATOR APP**********");
        while(true) {
        System.out.println("Enter the operation you want to do: ");
        System.out.println("PRESS 1 TO ADD TWO NUMBERS");
        System.out.println("PRESS 2 TO SUBTRACT TWO NUMBERS");
        System.out.println("PRESS 3 TO MULTIPLY TWO NUMBERS");
        System.out.println("PRESS 4 TO DIVIDE TWO NUMBERS");
        System.out.println("PRESS 0 TO EXIT THE SYSTEM");
        int option = getValidInt("Enter your option here: ");
        if(option == 0) {
            System.out.println("**********THANK YOU**********");
            System.out.println("Exiting the System...");
            System.exit(0);
        }
        if(option < 0 || option > 4) {
            System.out.println("Enter a valid option");
            System.out.println("------------------------------------");
            continue;
        }
        double a = getValidDouble("Enter the first number: ");
        double b = getValidDouble("Enter the second number: ");
        
        
        switch(option) {
            case 1 : System.out.println("Addition of " + a + " and " + b + " is: " + addition(a,b));
                     System.out.println("------------------------------------");
                         break;
            case 2  :System.out.println("Subtraction of " + a + " and " + b + " is: " + subtraction(a,b));
                     System.out.println("------------------------------------");
                         break;
            case 3 : System.out.println("Multiplication of " + a + " and " + b + " is: " + multiplication(a,b));
                     System.out.println("------------------------------------");
                         break;
            case 4 :  while(b == 0) {
                        b= getValidDouble("Denominator cannot be zero, Enter a valid denominator:");
                        }
                      System.out.println("Division of " + a + " and " + b + " is: " + division(a,b));
                      System.out.println("------------------------------------");
                      break;     
        }
        }
    }
}