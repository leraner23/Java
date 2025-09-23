import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of countries: ");
        int n = s.nextInt();

        s.nextLine();
        long[] p = new long[n]; // long
        String[] name = new String[20];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the name and population of countries: ");
            name[i] = s.nextLine();
            p[i] = s.nextLong();
            s.nextLine();
        }
        float maximum = p[0];
        for (int i = 0; i < n - 1; i++) {
            if (maximum < p[i + 1]) {
                maximum = p[i + 1];

            }
        }

        System.out.println("maximum population :" + maximum);
        ;
    }
}
