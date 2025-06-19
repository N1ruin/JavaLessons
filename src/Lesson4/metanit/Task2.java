package Lesson4.metanit;

public class Task2 {
    public static void main(String[] args) {
        int population = 10_000_000;
        int born = 14;
        int death = 8;
        int years = 10;
        int minBorn = 7;
        int minDeath = 6;

        for (int i = 0; i < years; i++) {
            population += population * (born - death) / 1000;
            if (born >= minBorn) {
                born--;
            }
            if (death >= minDeath) {
                death--;
            }
        }
        System.out.println(population);
    }
}
