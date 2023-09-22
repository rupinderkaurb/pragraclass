import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the starting range of Even numbers");
        int start = obj.nextInt();
        System.out.println("Enter the stop range of Even numbers");
        int stop = obj.nextInt();
        int i = start;
        while (i <= stop) {
             System.out.println(i);
             i = i+2;
         }

    }
}
