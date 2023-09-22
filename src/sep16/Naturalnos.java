package sep16;

public class Naturalnos {
    public static void main(String[] args)
    {
        int sum=0;
        System.out.println("The first 10 natural numbers are: \n");
        for (int i=0; i<=10; i++)
        {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("\n");
        System.out.println("Sum of natural numbers is: " +sum);

    }

}
