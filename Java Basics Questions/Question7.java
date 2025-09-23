import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = s.nextInt();
        s.nextLine();

        if(n%5== 0 && n%7==0){
            System.out.println("divisible by 5 & 7");
        }else {
             System.out.println(" not divisible by 5 & 7");
        }
    }
}
