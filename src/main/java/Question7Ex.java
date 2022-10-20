import java.util.*;
public class Question7Ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println(" Enter The size of an array ");
        n = input.nextInt();

        int arr[] = new int[n];
        System.out.println(" Enter the elements of array ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
