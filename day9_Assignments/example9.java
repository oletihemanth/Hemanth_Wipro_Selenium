package day9_Assignments;

//Q9. Write a program that sorts a list of cities by population using Comparator.

import java.util.*;

class City {
    String name;
    int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " (Population: " + population + ")";
    }
}

public class example9 {
    public static void main(String[] args) {
        List<City> cityList = new ArrayList<>();

        cityList.add(new City("AMerica", 8419600));
        cityList.add(new City("Los Angeles", 3980400));
        cityList.add(new City("Chicago", 2716000));
        cityList.add(new City("UAE", 2328000));

        System.out.println("Before Sorting:");
        for (City city : cityList) {
            System.out.println(city);
        }

        cityList.sort(Comparator.comparingInt(c -> c.population));

        System.out.println("\nAfter Sorting by Population (Ascending):");
        for (City city : cityList) {
            System.out.println(city);
        }
        cityList.sort(Comparator.comparingInt((City c) -> c.population).reversed());

        System.out.println("\nAfter Sorting by Population (Descending):");
        for (City city : cityList) {
            System.out.println(city);
        }
    }
}

