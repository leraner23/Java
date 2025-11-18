import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = s.nextInt();
        s.nextLine();
       String r = (n % 400 == 0 || (n%4 ==0 && n%100!=0))? "leap year" : " not leap year" ; // divisible by 400 and (divisible by 4 and not divisibile by 100)
       System.out.println(r);
    }
}
