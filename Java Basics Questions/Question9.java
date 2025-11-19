import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find factorial ");
        int n = s.nextInt();
        s.nextLine();
        if(n != 0){
        int [] fact = new int[100];
        int count = 0;
        for(int i = n; i>0; i--){
           if(n%i==0){
            fact[count] = i;
            count = count+1;
           
           }
        }
        System.out.println("Factorials are:");
        for(int i=0; i<count; i++){System.out.println( fact[i]);}
       
    } else{
        System.out.println("factorial of 0 is:" + 1);
    }
}
}
// factorial of 0 is 1.