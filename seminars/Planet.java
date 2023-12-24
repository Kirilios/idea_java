package seminars;

import java.util.ArrayList;
import java.util.List;

//Заполнить список названиями планет Солнечной системы
// в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
public class Planet {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Saturn");
        planets.add("Mercury");
        planets.add("Mars");
        planets.add("Pluto");
        planets.add("Sun");
        planets.add("Mercury");
        planets.add("Mars");
        countPlanet(planets);
    }

    public static void countPlanet(List<String> planets) {
        List<String> countPlanet = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String planet : planets) {
            if (!countPlanet.contains(planet)) {
                countPlanet.add(planet);
                int count = 0;
                for (int i = 0; i < planets.size(); i++) {
                    String currentPlanet = planets.get(i);
                    if (planet.equals(currentPlanet)) {
                        count++;
                    }

                }

                sb.append(planet).append(":").append(count).append(", ");
            }
        }
        System.out.println(sb);
    }
}
