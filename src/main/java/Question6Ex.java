public class Question6Ex {
    public static void main(String[] args) {
        int array[] = {43,5,23,17,2,14};
        double average, total = 0;
        for(int i = 0; i < array.length; i++){
            total = total + array[i];
        }
        average = total/array.length;

        System.out.format(" The average is " + "%.1f", average);
    }
}
