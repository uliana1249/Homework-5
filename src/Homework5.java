import java.util.Random;
import java.util.ArrayList;

public class Homework5 {

    public static void main(String[] args) {
        int[] array1 = getRandomPositiveIntArray(5, 100);
        int[] array2 = getRandomPositiveIntArray(5, 100);
        //Task1
        System.out.println("Task 1:");
        System.out.print("Array: ");
        printArray(array1);
        System.out.print("\nReverse Array: ");
        printReverseArray(array1);

        //Task2
        System.out.println("\n\nTask 2:");
        int sum = 0;
        int count = 0;
        for (int item: array1) {
            if (item % 2 == 1) {
                sum = sum + item;
                count++;
            }
        }
        System.out.println("Count of odd numbers: " + count);
        System.out.println("Summ of odd numbers: " + sum);

        //Task3
        System.out.println("\nTask 3:");
        if (array1.length == array2.length) {
            int[] array3 = new int[array1.length];

            for (int i = 0; i<array1.length; i++) {
                array3[i] = array1[i] + array2[i];
            }
            System.out.print("Array 1: ");
            printArray(array1);
            System.out.print("\nArray 2: ");
            printArray(array2);
            System.out.print("\nArray 3: ");
            printArray(array3);
        }

        else {
            System.out.println("Array 1 and Array 2 have different length");
        }

        //Task4
        System.out.println("\n\nTask 4:");
        int[] array4 = getRandomPositiveNegativeIntArray(5, 100);
        System.out.println("Array 4: ");
        printArray(array4);
        ArrayList<Integer> positiveList = new ArrayList<Integer>();
        ArrayList<Integer> negativeList = new ArrayList<Integer>();
        for (int item3: array4) {
            if (item3 > 0) {
                positiveList.add(item3);
            }
            else {
                negativeList.add(item3);
            }
        }
        System.out.print("\nArray of positive items: ");
        printArrayList(positiveList);
        System.out.print("\nArray of negative items: ");
        printArrayList(negativeList);
    }

    public static int[] getRandomPositiveIntArray(int arrayLength, int maxValue){
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = new Random().nextInt(maxValue);
        }
        return array;
    }

    public static int[] getRandomPositiveNegativeIntArray(int arrayLength, int maxModuleValue){
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = new Random().nextInt(maxModuleValue)* (new Random().nextBoolean() ? -1 : 1);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int item: array) {
            System.out.print(item + " ");
        }
    }

    public static void printReverseArray(int[] array) {
        for (int item: array) {
            System.out.print(item + " ");
        }
    }

    public static void printArrayList(ArrayList<Integer> arrayList) {
        for (int item: arrayList) {
            System.out.print(item + " ");
        }
    }
}
