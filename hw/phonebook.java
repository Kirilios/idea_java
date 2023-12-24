package hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phonebook {
    public Map<String, List<Integer>> phoneBook = new HashMap<>();

    // Добавляет запись в телефонную книгу
    public void add(String name, Integer phoneNum) {
        // Если запись с именем уже существует, добавляем новый номер телефона
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            // Если записи с именем нет, создаем новую запись
            List<Integer> phoneList = new ArrayList<>();
            phoneList.add(phoneNum);
            phoneBook.put(name, phoneList);
        }
    }

    // Поиск номеров телефона по имени
    public List<Integer> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    // Возвращает всю телефонную книгу
    public Map<String, List<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
class Printeros {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        phonebook myPhoneBook = new phonebook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(myPhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}

