package sep16;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

            if(flag &&  number > 1)
            {
                System.out.println("Number is prime");
            }
            else
            {
                System.out.println("Number is not prime");
            }
        }
    }


