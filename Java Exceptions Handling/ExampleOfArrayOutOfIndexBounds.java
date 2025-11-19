public class ExampleOfArrayOutOfIndexBounds {
    public static void main(String[] args) {
        try {
            int [] numbers = new int[5];
            numbers[6] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("ArrayIndexOutOfBoundsException occured");
        }
    }
}
