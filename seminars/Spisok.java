package seminars;

import java.util.ArrayList;
import java.util.List;

//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.
public class Spisok {
    public static void main(String[] args){
        List list = new ArrayList<String>();
        list.add("asd");
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) list.remove(i);


        }
        System.out.println(list);
    }
}
