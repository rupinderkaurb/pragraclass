import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the value of x");
        x = obj.nextInt();
        System.out.println("Enter the value of y");
        y = obj.nextInt();
        int z = x + y;
        System.out.println("Addition: " + z);



}
}

