import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWork12 {
    public static void main(String[] args) {

        System.out.println( "Cортировка пузырьком" );
        long startTime1 = System.currentTimeMillis();
        int[] array = new int[]
                {
                        1, 2, -6, 7, 6, 0, -7, -4, 5, -3, 3, 4, -5, -1, -2
                };

        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = array.length - 1; i >=1 ; i--) {
                if (array[i] < array[i-1]) {
                    isSorted = false;
                    temp = array[i - 1];
                    array[i - 1] =  array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(array) + " ");

        long endTime1 = System.currentTimeMillis();

        // Результат выполнения сортировки пузырьком
        System.out.println("Время выполнения: " + (endTime1 - startTime1) + " млс\n");

        System.out.println( "\nCортировка с помощью Collections.sort" );
        long startTime2 = System.currentTimeMillis();
        List<Integer> list = Arrays.asList(1, 2, -6, 7, 6, 0, -7, -4, 5, -3, 3, 4, -5, -1, -2);
        Collections.sort(list);
        System.out.print(list + " ");

        long endTime2 = System.currentTimeMillis();

        // Результат выполнения сортировки с помощью Collections.sort

        System.out.println("Время выполнения: " + (endTime2 - startTime2) + " млс");


    }
}