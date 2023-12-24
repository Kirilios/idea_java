package hw;

import java.util.Arrays;

public class HeapSort {
    // Метод для построения сортирующего дерева
    public static void buildTree(int[] array, int length, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            // Обмен элементов и рекурсивный вызов для поддерева
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            buildTree(array, length, largest);
        }
    }

    // Метод для выполнения сортировки кучей
    public static void heapSort(int[] array, int length) {
        // Построение сортирующего дерева (heapify)
        for (int i = length / 2 - 1; i >= 0; i--) {
            buildTree(array, length, i);
        }

        // Извлечение элементов из корня и перестройка дерева
        for (int i = length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            buildTree(array, i, 0);
        }
    }
}
class P {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}

