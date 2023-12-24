package hw;

import java.util.LinkedList;

public class Revert {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        int size = ll.size();
        for (int i = 0; i < size / 2; i++) {
            // Swap elements at positions i and size - 1 - i
            Object temp = ll.get(i);
            ll.set(i, ll.get(size - 1 - i));
            ll.set(size - 1 - i, temp);
        }

        return ll;
    }

    static class Pr {
        public static void main(String[] args) {
            LinkedList<Object> ll = new LinkedList<>();

            if (args.length == 0 || args.length != 4) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                ll.add(1);
                ll.add("One");
                ll.add(2);
                ll.add("Two");
            } else {
                ll.add(Integer.parseInt(args[0]));
                ll.add(args[1]);
                ll.add(Integer.parseInt(args[2]));
                ll.add(args[3]);
            }

            Revert answer = new Revert();
            System.out.println(ll);
            LinkedList<Object> reversedList = answer.revert(ll);
            System.out.println(reversedList);
        }
    }
}

