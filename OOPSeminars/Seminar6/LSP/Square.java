package OOPSeminars.Seminar6.LSP;

public class Square extends  Quadrangle{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }
}
