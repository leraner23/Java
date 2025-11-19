import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);  
      System.out.println("enter the length");
      float l = s.nextFloat();

      System.out.println("enter the breadth");
      float b = s.nextFloat();

      double area = l*b;
      System.out.println("the area is :" + area);
    }
}
