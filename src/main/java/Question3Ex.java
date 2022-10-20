import java.util.Arrays;
public class Question3Ex {
    public static void main(String[] args) {
        String []array = {"Paris", "London", "New York", "Stockholm"};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
