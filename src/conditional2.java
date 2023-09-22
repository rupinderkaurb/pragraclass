public class conditional2 {
    public static void main(String[] args) {
        int age = 65;
        if (age < 16) {
            System.out.println("You can not drive");
        } else if (age >= 16 && age < 19) {
            System.out.println("You can not drive on 400 highways");

        } else if (age >= 19 && age < 65) {
            System.out.println("You are eligible to drive");
        } else if (age >= 65) {
            System.out.println("Take permission from wife");
        }



    }
}