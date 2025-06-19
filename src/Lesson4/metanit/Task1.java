package Lesson4.metanit;

public class Task1 {
    public static void main(String[] args) {
        int population = 10_000_000;
        int birthRate = 14;
        int deathRate = 8;
        int years = 10;

        for (int i = 0; i < years; i++) {
            int increasePopulationForYear = population * (birthRate-deathRate)/1000;
            population += increasePopulationForYear;
        }
        System.out.println(population);
    }
}
