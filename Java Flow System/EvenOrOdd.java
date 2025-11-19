import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
  System.out.println("enter the number to check even or ODD");
  float f = s.nextFloat();
  int i = (int)f;
  if(f%2==0){
    System.out.println("even");
  }else{
    System.out.println("odd");
  }
    }
}
