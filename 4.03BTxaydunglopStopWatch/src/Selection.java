import java.util.Arrays;
import java.util.Random;

public class Selection {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] numbers = new int[10000];
        Random rand = new Random();

        int n = rand.nextInt(50);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(90000);
        }


        stopWatch.start();
        Selectionsort.sortAscending(numbers);
        stopWatch.stop();
        System.out.println(Arrays.toString(numbers));
        System.out.println(stopWatch.getElapsedTime());
    }
}

