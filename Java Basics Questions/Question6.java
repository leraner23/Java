import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);  
      System.out.println("enter the 1st number to  swap: ");
      int n1 = s.nextInt();
        s.nextLine();
      System.out.println("enter the 2nd number to  swap: ");
      int n2 = s.nextInt();

      // using airthmatic operations
      if(n1 % n2 == 0){
        System.out.println("already equal");
      }else{
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println(n1);
        System.out.println(n2);

      }
    }
}
