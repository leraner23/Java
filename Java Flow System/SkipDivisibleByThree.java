public class SkipDivisibleByThree {
   public static void main(String[] args) {
    System.out.println("Skip number divisibel by 3");
    for(int i = 1; i<=20; i++){
        if(i%3==0){
          continue;
        }
          System.out.println(i);
    }
   } 
}
