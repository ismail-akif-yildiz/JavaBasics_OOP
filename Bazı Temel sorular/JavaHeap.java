import java.util.Arrays;

public class HeapExample {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];

        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        
        System.out.println("Numbers dizisi içeriği:");
        System.out.println(Arrays.toString(numbers));
    }
}
