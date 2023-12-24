package seminars;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class analyNumbers {
    public static void analyzeNumbers(Integer[] arr) {
        // Создаем список ArrayList и заполняем его числами из исходного массива
//        List<Integer> numbersList = new ArrayList<>(Arrays.asList(arr));
//        numbersList.addAll(Arrays.asList(arr));
//        System.out.println(numbersList);
//    }}

//}
//        // Сортируем список по возрастанию
//        bubbleSort(numbersList);
//
//        // Выводим отсортированный список
//        System.out.println("Sorted list: " + numbersList);
//
//        // Находим и выводим минимальное значение
//        int min = findMin(numbersList);
//        System.out.println("Minimum is " + min);
//
//        // Находим и выводим максимальное значение
//        int max = findMax(numbersList);
//        System.out.println("Maximum is " + max);
//
//        // Находим и выводим среднее арифметическое
//        double average = calculateAverage(numbersList);
//        System.out.println("Average is = " + average);
//    }
//
//    private static void bubbleSort(List<Integer> list) {
//        int n = list.size();
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (list.get(j) > list.get(j + 1)) {
//                    // меняем элементы местами
//                    int temp = list.get(j);
//                    list.set(j, list.get(j + 1));
//                    list.set(j + 1, temp);
//                }
//            }
//        }
//    }
//
//    private static int findMin(List<Integer> list) {
//        int min = Integer.MAX_VALUE;
//        for (int num : list) {
//            if (num < min) {
//                min = num;
//            }
//        }
//        return min;
//    }
//
//    private static int findMax(List<Integer> list) {
//        int max = Integer.MIN_VALUE;
//        for (int num : list) {
//            if (num > max) {
//                max = num;
//            }
//        }
//        return max;
//    }
//
//    private static double calculateAverage(List<Integer> list) {
//        int sum = 0;
//        for (int num : list) {
//            sum += num;
//        }
//        return (double) sum / list.size();
//    }
//}
         //Создаем список ArrayList и заполняем его числами из исходного массива
        List<Integer> numbersList = new ArrayList<>();
        Collections.addAll(numbersList, arr);

        // Сортируем список по возрастанию
        Collections.sort(numbersList);

        // Выводим отсортированный список
        System.out.println("Sorted list: " + numbersList);

        // Находим и выводим минимальное значение
        int min = Collections.min(numbersList);
        System.out.println("Minimum is " + min);

        // Находим и выводим максимальное значение
        int max = Collections.max(numbersList);
        System.out.println("Maximum is " + max);

        // Находим и выводим среднее арифметическое
        double average = calculateAverage(numbersList);
        System.out.println("Average is = " + average);
    }
    public static double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }
}
