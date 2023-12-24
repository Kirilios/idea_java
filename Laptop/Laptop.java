package Laptop;
//Подумать над структурой класса Laptop для магазина техники - выделить поля и методы.
// Реализовать в java
// Создать множество Laptopов (Set).
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет Laptopи,
// отвечающие фильтру.
// Критерии фильтрации можно хранить в любой удобной
// вам структуре данных(map, set, list, array). Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ram
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - color …
// Далее нужно запрocить минимальные значения для указанных критериев
// - сохранить параметры фильтрации можно также в Map.
//public class Laptop {
//    int ram;
//    int capacity;
//    int oc;
//    String color;
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public void setOc(int oc) {
//        this.oc = oc;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setRam(int ram) {
//        this.ram = ram;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public int getOc() {
//        return oc;
//    }
//
//    public int getRam() {
//        return ram;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//}
import java.util.*;
class Laptop {
    private String model;
    private int ram;
    private int capacity;
    private String oc;
    private String color;

    public Laptop(String model, int ram, int capacity, String oc, String color) {
        this.model = model;
        this.ram = ram;
        this.capacity = capacity;
        this.oc = oc;
        this.color = color;
    }

    public String getmodel() {
        return model;
    }

    public int getram() {
        return ram;
    }

    public int getcapacity() {
        return capacity;
    }

    public String getoc() {
        return oc;
    }

    public String getcolor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", capacity=" + capacity +
                ", oc='" + oc + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

