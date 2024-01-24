package OOPSeminars.Seminar6.DIP;

public interface Engine {
    public default void start(){
        System.out.println("Engine launched");
    }
}
