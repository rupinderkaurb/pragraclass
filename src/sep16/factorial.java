package sep16;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the factorial number");
        int UserInput = scanner.nextInt();
        for(int i=1; i<=UserInput;i++){
            factorial = factorial * i;


        }
        System.out.println(factorial);

    }
}
