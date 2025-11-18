import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the charater");
        char c = s.next().charAt(0);
    
        s.nextLine();
        int c1 = (int)c;
        System.out.println("in ASCII value: "+ c1);
    }
}
