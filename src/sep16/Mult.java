package sep16;

import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What table should we print");
        int table = scanner.nextInt();
        int i = 1;

        do {

            int answer = table * i;
            System.out.println(table+ "*" +i+ "=" +answer);
            i++;
        }
            while (i <= 10);

        }

        }








