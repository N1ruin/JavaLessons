package Lesson33.task2;

import Lesson32.task123.model.Car;

import java.io.*;
import java.util.Arrays;

//да, можно декомпозировать и раздробить методы, вынеся логику парсинга в отдельный метод, но мне лень;D

public class Main {
    public static final String CAR_CATALOG_PATH = "./resources/lesson33task1/carCatalog.txt";

    public static void main(String[] args) {
        Car[] cars = new Car[3];

//        cars[0] = new Car("123", "999", 1999, "white");
//        cars[1] = new Car("232", "23132", 2004, "red");
//        cars[2] = new Car("923", "777", 2025, "black");

        File file = new File(CAR_CATALOG_PATH);
        if (!file.exists() || !file.isFile()) {
            throw new RuntimeException("File %s is not available".formatted(CAR_CATALOG_PATH));
        }
//        saveFileWriter(cars, file);
        parseCarBufferedReader(cars, file);
        System.out.println(Arrays.toString(cars));
    }

    private static void parseCarFileReader(Car[] cars, File file) {
        try (FileReader fileReader = new FileReader(file)) {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = fileReader.read()) != -1) {
                sb.append((char) c);
            }
            String[] carsInfo = sb.toString().split("\n");

            for (int i = 0; i < carsInfo.length; i++) {
                String[] carInfo = carsInfo[i].split(";");
                String number = carInfo[0];
                String vin = carInfo[1];
                int year = Integer.parseInt(carInfo[2]);
                String color = carInfo[3];
                cars[i] = new Car(number, vin, year, color);
            }

        } catch (IOException e) {
            throw new RuntimeException("File %s not available".formatted(file.getPath()));
        }
    }

    private static void parseCarBufferedInputStream(Car[] cars, File file) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            String allCarsInfo = new String(bis.readAllBytes());

            String[] carsInfo = allCarsInfo.split("\n");

            for (int i = 0; i < carsInfo.length; i++) {
                String[] carInfo = carsInfo[i].split(";");
                String number = carInfo[0];
                String vin = carInfo[1];
                int year = Integer.parseInt(carInfo[2]);
                String color = carInfo[3];
                cars[i] = new Car(number, vin, year, color);
            }
        } catch (IOException e) {
            throw new RuntimeException("File %s not available".formatted(file.getPath()));
        }
    }

    private static void parseCarBufferedReader(Car[] cars, File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String carInfo;
            int currentLineNumber = 0;
            while ((carInfo = bufferedReader.readLine()) != null) {
                String[] carFields = carInfo.split(";");
                for (int i = 0; i < carFields.length; i++) {
                    String number = carFields[0];
                    String vin = carFields[1];
                    int year = Integer.parseInt(carFields[2]);
                    String color = carFields[3];
                    cars[currentLineNumber] = new Car(number, vin, year, color);

                }
                currentLineNumber++;
            }
        } catch (
                IOException e) {
            throw new RuntimeException("File %s not available".formatted(file.getPath()));
        }
    }


    private static void saveFileWriter(Car[] cars, File file) {
        try (FileWriter fileWriter = new FileWriter(file, false)) {
            for (Car car : cars) {
                fileWriter.write(mapString(car));
            }
        } catch (IOException e) {
            throw new RuntimeException("File %s not available".formatted(file.getPath()));
        }
    }

    private static String mapString(Car car) {
        return "%s;%s;%d;%s\n".formatted(car.getNumber(), car.getVinNumber(), car.getYear(), car.getColor());
    }
}
