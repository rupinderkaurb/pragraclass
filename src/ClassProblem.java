public class ClassProblem {
    public static void main(String[] args){
        int marks=70;
        if (marks > 0 && marks<=40){
            System.out.println("Grade is Fail");
        }
      else  if (marks>40 && marks<=60){
            System.out.println("Grade is B");

        }
       else if (marks>60 && marks<=80){
            System.out.println("Grade is B+");

        }
       else if (marks>80 && marks<=90){
            System.out.println("Grade is A");
        }
        else if (marks>90 && marks<=99){
            System.out.println("Grade is A+");
        }
        else if (marks==100) {
            System.out.println("You are Alien");
        }

    }

}
