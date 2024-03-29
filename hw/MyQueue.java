package hw;

import java.util.LinkedList;
//enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди
public class MyQueue<T> {
    // Напишите свое решение ниже
        LinkedList<T> queue = new LinkedList<>();
    public void enqueue(T element){
        // Напишите свое решение ниже
            queue.addLast(element);

    }

    public T dequeue(){
        // Напишите свое решение ниже
        return queue.removeFirst();
    }

    public T first(){
        // Напишите свое решение ниже
        return queue.getFirst();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return new LinkedList<>(queue);
    }
}
class Printero {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
