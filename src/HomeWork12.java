import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class HomeWork12 {
    public static void main(String[] args) {

      int[] array = new int[10_000]; // Массив в обратном порядке
              for(int i=0; i<10_000;i++){
                  array[i] = 10_000 - i;
              }
 //     System.out.println("Массив в обратном порядке" + Arrays.toString(array) + "\n" );

      List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList()); // Список в обратном порядке

//      System.out.println("Список в обратном порядке" + list + "\n" );


        System.out.println( "Cортировка пузырьком" );

        long startTime1 = System.currentTimeMillis();
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
        System.out.println("\nВремя выполнения: " + (endTime1 - startTime1) + " млс\n");

        System.out.println( "\nCортировка с помощью Collections.sort" );
        long startTime2 = System.currentTimeMillis();

        Collections.sort(list);
        System.out.print(list + " ");

        long endTime2 = System.currentTimeMillis();

        // Результат выполнения сортировки с помощью Collections.sort

        System.out.println("\nВремя выполнения: " + (endTime2 - startTime2) + " млс");


    }
}