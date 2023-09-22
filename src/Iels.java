public class Iels {
    public static void main(String[] args) {
        int time = 22;
        int time1 = 20;
        if (time < 10) {
            System.out.println("Good morning");
        }
        else if (time < 18) {
            System.out.println("Good Day");

        } else {
            System.out.println("Good Evening");
        }
        String result = (time<18) ? "Good day." : "Good Evening.";
        System.out.println(result);

    }

}
