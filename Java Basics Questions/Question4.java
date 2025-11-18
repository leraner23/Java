import java.util.Scanner;

public class Question4 {

  
      public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.println("enter the number");
  float f = s.nextFloat();
 
  int i = (int)f;
   if(i != 1 ){
boolean ISprime = true;
for (int n = 2; n<= Math.sqrt(i); n++){
    if(i%n == 0){
        ISprime = false; 
        break;
    }
}
  if( ISprime == true){
    System.out.println("prime number");
  }else{
    System.out.println("not prime number");
  }
  

    }else {
      System.out.println("not a prime number");
    }
}
}