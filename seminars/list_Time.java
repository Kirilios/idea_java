package seminars;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class list_Time {
    public static void main(String[] args) {
        int length = 1000000;
        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            intArrayList.add(i);
            intLinkedList.add(i);
        }
        int count = 0;
        long startTime3 = System.currentTimeMillis();
        Random random = new Random();

        while (count != 1000) {
            intArrayList.add(40000, random.nextInt());
            count += 2;
        }


        long endTime3 = System.currentTimeMillis();

        System.out.println(endTime3 - startTime3);
    }
}
