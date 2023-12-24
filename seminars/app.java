package seminars;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class app {
    //Реализовать консольное приложение, которое:
//Принимает от пользователя строку вида
//text:num
//Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
//Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
    static List<String> dataLst = new LinkedList<>();

    public static String prompt(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static void warning(int ind){
        for (int i=0; i<ind; i++){
            dataLst.add(null);
        }
    }

    public static String run(){

        System.out.println("Введите данные:");
        String inpMess = prompt();
        String[] splArr = inpMess.split(":");
        String word = splArr[0];
        int index = Integer.parseInt(splArr[1]);
        if (index>dataLst.size())
            warning(index);
        if ((word.equals("print")) && (dataLst.get(index)!=null)) {
            System.out.println(dataLst.get(index));
            dataLst.remove(index);
        }
        else
            dataLst.add(index, word);
        return inpMess;
    }
    public static void main(String[] args) {
        while(true){
            if (run().equals("q"))
                System.exit(0);
            run();
        }


    }
}