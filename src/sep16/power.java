package sep16;

import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base ");
        int base = scanner.nextInt();
        System.out.println("Enter the power");
        int power = scanner.nextInt();
        int result = 1;
        for(int i = 1; i<=power; i++){
            result = result*base;
        }
        System.out.println(result);

    }
}
