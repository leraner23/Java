import java.util.Scanner;

public class Question1{
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the english marks");
    Byte e = s.nextByte();
    System.out.println("enter the english marks");
    Short sh = s.nextShort();
    System.out.println("enter the english marks");
    int i = s.nextInt();
    
    double d1 = (double)e;
    double d2 = (double)sh;
    double d3 = (double)i;

    double average = d1 + d2 + d3;
    System.out.println("average marks =" + average);

}
}