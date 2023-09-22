public class DifferentM {
    static void myStaticMethod() {
        System.out.println("Static Methods can be called without creating obects");


    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    // Main Method
public static void main(String[] args) {
        myStaticMethod(); //Call the static method
    // myPublicMethod(); This would cause an error as public methode can not be called without object

    DifferentM myObj = new DifferentM(); // Create an object of Main
    myObj.myPublicMethod();

}

    }

