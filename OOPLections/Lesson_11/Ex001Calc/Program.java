package OOPLections.Lesson_11.Ex001Calc;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter((Model) new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
