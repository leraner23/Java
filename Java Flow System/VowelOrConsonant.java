import java.util.Scanner;

public class VowelOrConsonant {
     public static void main(String[] args) {
  char [] v = {'a','e','i','o','u'};
  Scanner s = new Scanner(System.in);
  System.out.println("enter the character");
  char c = s.next().charAt(0);
  
   
  if(Character.isLetter(c)){
    c =Character.toLowerCase(c);
    switch (c) {
        case 'a':
            System.out.println("vowel");
            break;
            case 'e':
            System.out.println("vowel");
            break;
            case 'i':
            System.out.println("vowel");
            break;
            case 'o':
            System.out.println("vowel");
            break;
            case 'u':
            System.out.println("vowel");
            break;
    
        default:
        System.out.println("consonat");
            break;
    }
    }else{
        System.out.println("enter the string");
    }
}
}
