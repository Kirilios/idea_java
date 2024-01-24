package OOPSeminars.Seminar6.ISP;

public class Circle implements Shape3D {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public double volume() {
        return 0;
    }
}
