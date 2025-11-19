
 class ExampleOfArithmetticException {
     public static void main(String[] args) {
        try{
         int a = 1;
         int div;
         div = 1/0;
         System.out.println("divisible");
        }catch(ArithmeticException e){
         System.out.println("Arithemtic Exception occured");
        }
    
     }
}
