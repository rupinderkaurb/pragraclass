import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Limit number");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

                sum = sum + i;
            }
        }
        System.out.println("Sum is: " +sum);
    }
}
