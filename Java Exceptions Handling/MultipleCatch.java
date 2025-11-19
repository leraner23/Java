import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("1: ArrayIndexOutOfBoundsException ");
             System.out.println("2: ArithmeticException ");
              System.out.println("3: NullPointerException ");
            System.out.println("enter the choice ");
            char c =  s.next().charAt(0);
            if(Character.isLetter(c)){
                System.out.println("enter among the options");
            }else{
                switch(c){
                    case '1': 
                        int [] aakriti = {1,2,3};
                        System.out.println(aakriti[4]);
                        break;
                        
                     case '2': 
                       int d = 2/0;
                       System.out.println(d);
                        break;
                        
                     case '3': 
                       String s1 = null;
                        System.out.println(s1.length());
                        break;
                       
                    default: 
                    // System.out.println("return home"); 
                    break;
                }
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(ArithmeticException a){
            System.out.println("ArithmeticException");

        }catch(NullPointerException n){
            System.out.println("NullPointerException");

        }
    }
}
