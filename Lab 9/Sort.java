import java.util.Arrays;

/**
 * This class implements multiple sort algorithms.
 *
 * @author Abhi Purohit
 * @version (CSSSKL 143)
 */

/**
 * Questions:
 * When running the driver, the object is written to and
 * read from the file(data.obj). The program prints out the student
 * data that was saved.
 *
 * We converted a Java object into a byte stream. We read the object
 * back into memory, building the object again.
 */

public class Sort {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] bubbleArray = new int[SIZE];
        int[] selectionArray = new int[SIZE];
        int[] insertionArray = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            bubbleArray[i] = (int) (Math.random() * 52);
            selectionArray[i] = (int) (Math.random() * 52);
            insertionArray[i] = (int) (Math.random() * 52);
        }

        System.out.println("Array before bubble sort:");
        System.out.println(Arrays.toString(bubbleArray));
        bubbleSort(bubbleArray);
        System.out.println("Array after bubble sort:");
        System.out.println(Arrays.toString(bubbleArray));
        System.out.println();

        System.out.println("Array before selection sort:");
        System.out.println(Arrays.toString(selectionArray));
        selectionSort(selectionArray);
        System.out.println("Array after selection sort:");
        System.out.println(Arrays.toString(selectionArray));
        System.out.println();

        System.out.println("Array before insertion sort:");
        System.out.println(Arrays.toString(insertionArray));
        insertionSort(insertionArray);
        System.out.println("Array after insertion sort:");
        System.out.println(Arrays.toString(insertionArray));
    }

    public static void bubbleSort(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length - 1; j++) {
                if(numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] numbers, int indexA, int indexB) {
        int temp = numbers[indexA];
        numbers[indexA] = numbers[indexB];
        numbers[indexB] = temp;
    }

    // selection sort
    public static void selectionSort(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            int smallestIndex = findSmallest(numbers, i, numbers.length);
            swap(numbers, i, smallestIndex);
        }
    }

    public static int findSmallest(int[] arr, int begin, int end) {
        int minIndex = begin;
        int minValue = arr[begin];

        for (int i = begin + 1; i < end; i++) {
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }

        return minIndex;
    }

    // insertion sort
    public static void insertionSort(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {

            int key = numbers[i];
            int hole = i - 1;

            while (hole >= 0 && numbers[hole] > key) {
                numbers[hole + 1] = numbers[hole];
                hole--;
            }

            numbers[hole + 1] = key;
        }
    }
}