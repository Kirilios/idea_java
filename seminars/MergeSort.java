package seminars;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] a) {
        if (a.length > 1) {
            int mid = a.length / 2;
            int[] leftHalf = new int[mid];
            int[] rightHalf = new int[a.length - mid];

            // Заполняем левую и правую половины
            System.arraycopy(a, 0, leftHalf, 0, mid);
            System.arraycopy(a, mid, rightHalf, 0, a.length - mid);

            // Рекурсивно сортируем левую и правую половины
            mergeSort(leftHalf);
            mergeSort(rightHalf);

            int i = 0, j = 0, k = 0;

            // Слияние отсортированных половин

            while (i < leftHalf.length && j < rightHalf.length) {
                if (leftHalf[i] < rightHalf[j]) {
                    a[k] = leftHalf[i];
                    i++;
                } else {
                    a[k] = rightHalf[j];
                    j++;
                }
                k++;
            }

            // Добавляем оставшиеся элементы, если они есть
            while (i < leftHalf.length) {
                a[k] = leftHalf[i];
                i++;
                k++;
            }

            while (j < rightHalf.length) {
                a[k] = rightHalf[j];
                j++;
                k++;
            }
        }
        return a;
    }

    public static class Printer3 {
        public static void main(String[] args) {
            int[] a;

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                a = new int[]{5, 1, 6, 2, 3, 4};
            } else {
                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            }

            MergeSort answer = new MergeSort();
            String itresume_res = Arrays.toString(answer.mergeSort(a));
            System.out.println(itresume_res);
        }
    }
}
