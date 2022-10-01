import java.util.Random;

public class ArrayGenerator {

    private static final int DEFAULT_UPPER_BOUND = 100;
    private static final int DEFAULT_INTERVAL_PARAMETER = 10;
    private static Random random = new Random();

    private ArrayGenerator() {

    }

    public static int[] getRandomArray(int arrayLength) {
        int[] array = new int[arrayLength];
        randomizeArray(array);
        return array;
    }

    public static int[] getAscOrderArray(int arrayLength) {
        int[] array = new int[arrayLength];
        ascOrderFill(array);
        return array;
    }

    public static int[] getDescOrderArray(int arrayLength) {
        int[] array = new int[arrayLength];
        descOrderFill(array);
        return array;
    }

    private static void randomizeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(DEFAULT_UPPER_BOUND);
        }
    }

    private static void ascOrderFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int parameter = (i + 1) * DEFAULT_INTERVAL_PARAMETER;
            array[i] = parameter + random.nextInt(parameter);
        }
    }

    private static void descOrderFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int parameter = (array.length - i) * DEFAULT_INTERVAL_PARAMETER;
            array[i] = parameter + random.nextInt(parameter);
        }
    }

}
