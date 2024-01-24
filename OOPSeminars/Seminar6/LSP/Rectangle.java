package OOPSeminars.Seminar6.LSP;

public class Rectangle  extends Quadrangle{

    private int width;
    private int height;
    @Override
    public double area() {
        return height * width;
    }
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
}
