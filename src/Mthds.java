public class Mthds {
    static int myMethod(int x, int y) {
        return x+y;

    }
    static double myMethod(double x, double y) {
        return x + y;
    }


    public static void main(String[] args){
        int z = myMethod(5, 3);
        double d = myMethod(4.3, 6.26);
        System.out.println(z);
        System.out.println(d);
    }

}
