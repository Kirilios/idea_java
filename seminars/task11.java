package seminars;

import java.util.ArrayList;
import java.util.List;

//Каталог товаров книжного магазина сохранен
// в виде двумерного списка List<ArrayList<String>> так,
// что на 0-й позиции каждого внутреннего списка содержится название жанра,
// а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
public class task11 {
    static List<ArrayList<String>> bookshop = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> prose = new ArrayList<>();
        prose.add(0,"проза");
        prose.add("Война и мир");
        prose.add("Евгений Онегин");
        ArrayList<String> poetry = new ArrayList<>();
        poetry.add(0,"комедия");
        poetry.add("Горе от ума");
        poetry.add("Жизнь");
        addBooks(prose);
        addBooks(poetry);
        System.out.println(bookshop);
    }
    public static void addBooks(ArrayList<String> books){
      bookshop.add(books);
    }
}
