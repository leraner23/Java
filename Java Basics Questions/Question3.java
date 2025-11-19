import java.util.Scanner;

public class Question3 {
    
    public static void main(String[] args) {
  char [] v = {'a','e','i','o','u'};
  Scanner s = new Scanner(System.in);
  System.out.println("enter the character");
  char c = s.next().charAt(0);

//   if(c !=(int) c){
  if(Character.isLetter(c)){
     for(int i = 0; i<5; i++){
        if(v[i]  == c){
            System.out.println("vowels");
            break;
        }else 
            {}
        
            System.out.println("not vowels");
        }
     } else {
        System.out.println("enter the String character only");
     }
    }
}
