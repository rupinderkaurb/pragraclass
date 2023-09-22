package sep16;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int number1;
        int number2;
        int input;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the first number");
       number1 = scanner.nextInt();
       System.out.println("Enter the second number");
        number2 = scanner.nextInt();
        System.out.println("Enter the Input 1 for addition");
        System.out.println("Enter the Input 2 for subtraction");
        System.out.println("Enter the Input 3 for multiplication ");
        input = scanner.nextInt();
        if (input == 1){
            int sum = number1 + number2;

        System.out.println("Sum: " + sum);

        }
            else if (input == 2) {
                int sub = number1 - number2;
                System.out.println("Subtraction: " +sub);
            }
            else if (input == 3) {
            int mult = number1 * number2;
            System.out.println("Multiplication: " +mult);
        }
            else if (input == 8) {
                System.out.println("Invalid input");
        }



        }

    }

