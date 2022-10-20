public class Question4Ex {
    public static void main(String[] args) {
        int array1[] = {1, 15, 20};
        int array2[] = new int[array1.length];

        array2 = array1;
        array2[0]++;

        System.out.print(" Elements from first array: ");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.print(" \n Elements from the second array: ");
        for(int j = 0; j < array2.length; j++){
            System.out.print(array2[j] + " ");
        }
    }
}
