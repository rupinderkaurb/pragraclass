package sep16;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit number : ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i<=n; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i); //print even numbers
            sum = sum + i;
        }
            System.out.println("Sum of Even numbers is: " + sum);
        }
    }




//continue - skip the iteration
//break - completely exit the loop



//init
//check condition
//print statement
//increment

