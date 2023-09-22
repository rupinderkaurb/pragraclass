package sep16;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int input = scanner.nextInt();
        System.out.println("Enter number1");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2");
        int number2 = scanner.nextInt();

        switch(input) {
            case 1 :
            int sum = number1+number2;
            System.out.println("Addition: " +sum);
            break;



            case 2:
                int sub = number1 - number2;
                System.out.println("Subtraction: " + sub);
                break;

            case 3:
                int mult = number1 * number2;
                System.out.println("Multiplication: " +mult);
                break;
            default:
                System.out.println("No Calculations");
        }

    }
}
