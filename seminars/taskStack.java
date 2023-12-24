package seminars;

public class taskStack {
    public static void main(String[] args){
        MyStack mayStack = new MyStack();
        System.out.println(MyStack.size());
        mayStack.push(22);
        mayStack.push(25);
        mayStack.push(30);
        mayStack.push(13);
        System.out.println(mayStack.pop());
        System.out.println(mayStack.peek());
        System.out.println(mayStack.pop());
        System.out.println(mayStack.peek());
        System.out.println(mayStack.pop());
        System.out.println(mayStack.peek());
        System.out.println(mayStack.pop());
        System.out.println(mayStack.peek());
    }
}
