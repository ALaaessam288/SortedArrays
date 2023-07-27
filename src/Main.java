import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int[] a = getIntegers(size);
        printIntegers(a);
    }

    private static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        // Sort the array in descending order
        Arrays.sort(unsortedArray);
        for (int i = 0; i < unsortedArray.length / 2; i++) {
            int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[unsortedArray.length - 1 - i];
            unsortedArray[unsortedArray.length - 1 - i] = temp;
        }
        return unsortedArray;
    }

    public static void printIntegers(int[] Array) {
        Array = sortIntegers(Array);
        // Sorting the array before printing in descending order
        for (int i = 0; i < Array.length; i++)
        System.out.println("Element " + i + " contents " +Array[i]);
    }
}
