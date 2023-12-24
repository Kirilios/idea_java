package seminars;

import java.util.*;
import java.util.random.RandomGenerator;

//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
public class Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int n = 11;
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(11));

        }
        System.out.println(list);
        list.sort(null);
        //list.sort(Comparator.reverseOrder());
        Collections.sort(list);
        System.out.println(list);

    }
}
