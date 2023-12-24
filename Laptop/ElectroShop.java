package Laptop;

import java.util.*;


class ElectroShop extends Laptop {
    public ElectroShop(String model, int ram, int capacity, String oc, String color) {
        super(model, ram, capacity, oc, color);
    }

    public static void main(String[] args) {
        Set<Laptop> Laptops = createLaptopSet();

        Map<String, Object> filter = askCriteria();

        List<Laptop> filtiredLaptop = filteredLaptop(Laptops, filter);
        printer(filtiredLaptop);
    }

    private static Set<Laptop> createLaptopSet() {
        // Создаем несколько Laptopов для примера
        Set<Laptop> Laptops = new HashSet<>();
        Laptops.add(new Laptop("MaddysonBook", 16, 512, "Windows 10", "red"));
        Laptops.add(new Laptop("BookOfPapich", 32, 256, "CasualOS", "gray"));
        Laptops.add(new Laptop("NSBook(МощныйЧел)", 8, 1, "Windows 10", "black"));
        return Laptops;
    }

    private static Map<String, Object> askCriteria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ram");
        System.out.println("2 - capacity");
        System.out.println("3 - OC");
        System.out.println("4 - color");

        Map<String, Object> filter = new HashMap<>();

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Введите минимальное value ram:");
                int ram = scanner.nextInt();
                filter.put("ram", ram);
                break;
            case 2:
                System.out.println("Введите минимальное value объема ЖД:");
                int capacity = scanner.nextInt();
                filter.put("capacity", capacity);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String oc = scanner.nextLine();
                filter.put("oc", oc);
                break;
            case 4:
                System.out.println("Введите color:");
                String color = scanner.nextLine();
                filter.put("color", color);
                break;
            default:
                System.out.println("Некорректный ввод");
        }
        return filter;
    }
    private static List<Laptop> filteredLaptop(Set<Laptop> Laptops, Map<String, Object> filter) {
        List<Laptop> filtered = new ArrayList<>();

        for (Laptop Laptop : Laptops) {
            if (correctCriteria(Laptop, filter)) {
                filtered.add(Laptop);
            }
        }

        return filtered;
    }

    private static boolean correctCriteria(Laptop Laptop, Map<String, Object> filter) {
        for (Map.Entry<String, Object> entry : filter.entrySet()) {
            String criteria = entry.getKey();
            Object value = entry.getValue();

            switch (criteria) {
                case "ram":
                    if (Laptop.getram() < (int) value) {
                        return false;
                    }
                    break;
                case "capacity":
                    if (Laptop.getcapacity() < (int) value) {
                        return false;
                    }
                    break;
                case "oc":
                    if (!Laptop.getoc().equalsIgnoreCase((String) value)) {
                        return false;
                    }
                    break;
                case "color":
                    if (!Laptop.getcolor().equalsIgnoreCase((String) value)) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private static void printer(List<Laptop> Laptops) {
        if (Laptops.isEmpty()) {
            System.out.println("Laptops, по критериям, не найдены.");
        } else {
            System.out.println("Laptops, по критериям:");
            for (Laptop Laptop : Laptops) {
                System.out.println(Laptop);
            }
        }
    }
}
