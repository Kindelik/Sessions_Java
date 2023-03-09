package Seminar3;

import java.util.*;

public class Work3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Venera");
        planets.add("Mars");
        planets.add("Mercury");
        planets.add("Uran");
        planets.add("Mars");
        planets.add("Saturn");
        planets.add("Jupiter");
        planets.add("Neptune");
        planets.add("Venera");
        planets.add("Uran");
        planets.add("Venera");

        Set<String> planetsSet = new HashSet<>(planets);
        List<String> PlanetRepet = new ArrayList<>();


        for(String st : planetsSet){
            System.out.println(st+ ": " + Collections.frequency(planets,st));
        }

    }
}
