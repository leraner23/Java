import java.util.Scanner;

public class Question10 {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature");
        double n = s.nextDouble();
        s.nextLine();

        //convert into Int
        int temp1 = (int)n;

    if(n == temp1){
System.out.println("equal");

    }else{
        System.out.println(n);
        System.out.println(temp1);
    }
   } 
}
