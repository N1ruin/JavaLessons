package Lesson32.task123.repository;

import Lesson32.task123.model.Car;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class CarRepository {
    //task1
    public void saveCarToFile(Car car) {

        try (FileOutputStream fos = new FileOutputStream("./resources/CarCatalog.txt", true)) {
            fos.write(car.toString().getBytes(StandardCharsets.UTF_8));
            fos.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveAllCars(Car[] cars) {
        try (FileOutputStream fos = new FileOutputStream("./resources/CarCatalog.txt", false)) {
            for (Car car : cars) {
                if (car != null) {
                    fos.write(car.toString().getBytes(StandardCharsets.UTF_8));
                    fos.write('\n');
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadAllCars(Car[] cars) {
        try (FileInputStream fis = new FileInputStream("./resources/CarCatalog.txt")) {
            String carsDataString = new String(fis.readAllBytes());
            if (carsDataString.isEmpty()) {
                System.out.println("Car catalog is empty");
                return;
            }

            String[] carsData = carsDataString
                    .replaceAll("Car\\{number", "")
                    .replaceAll("vinNumber", "")
                    .replaceAll("year", "")
                    .replaceAll("color", "")
                    .replaceAll("['=}]", "")
                    .split("\n");
            for (int i = 0; i < carsData.length; i++) {
                String[] fields = carsData[i].replaceAll(" ", "").split(",");
                System.out.println(Arrays.toString(fields));
                String number = fields[0];
                String vinNumber = fields[1];
                int year = Integer.parseInt(fields[2]);
                String color = fields[3];
                cars[i] = new Car(number, vinNumber, year, color);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
