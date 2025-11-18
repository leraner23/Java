import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the int datatype value");
        int n = s.nextInt();
        s.nextLine();
          System.out.println("Enter the double datatype value");
    double d = s.nextDouble();
        s.nextLine();
 
        // Implicit casting
        double sum1 = d+n;
        System.out.println("Implicit : "+ sum1);

         // Explicit casting
        int sum2 = (int)d + n;
        System.out.println("Explicit : "+ sum2);

    }
}
