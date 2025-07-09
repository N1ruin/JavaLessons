package Lesson33.task1;

import Lesson32.task123.model.Car;

import java.io.*;

public class Main {
    public static final String CAR_CATALOG_PATH = "./resources/lesson33task1/carCatalog.txt";

    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0] = new Car("123", "999", 1999, "white");
        cars[1] = new Car("232", "23132", 2004, "red");
        cars[2] = new Car("923", "777", 2025, "black");

        File file = new File(CAR_CATALOG_PATH);
        if (!file.exists() || !file.isFile()) {
            throw new RuntimeException("File %s is not available".formatted(CAR_CATALOG_PATH));
        }
        saveBufferedWriter(cars, file);
    }

    private static void saveFileWriter(Car[] cars, File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (Car car : cars) {
                fileWriter.write(car.toString());
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveBufferedOutputStream(Car[] cars, File file) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

            for (Car car : cars) {
                String writebleString = car.toString() + "\n";
                byte[] bytes = writebleString.getBytes();
                bufferedOutputStream.write(bytes);
            }
        } catch (IOException e) {

        }
    }

    private static void saveBufferedWriter(Car[] cars, File file) {
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Car car : cars) {
                bufferedWriter.write(car.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
