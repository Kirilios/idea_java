package seminars;
//Дан произвольный массив целых чисел. Создайте список ArrayList,
// заполненный данными из этого массива.
// Необходимо удалить из списка четные числа и вернуть результирующий.
//
// Напишите свой код в методе removeEvenNumbers класса Answer.
// Метод removeEvenNumbers принимает на вход один параметр:
// Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class removeNum {
    public static void removeEvenNumbers(Integer[] arr) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : arr) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}
class Print {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        removeNum ans = new removeNum();
        ans.removeEvenNumbers(arr);
    }
}
