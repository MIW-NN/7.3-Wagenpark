package wagenpark.project.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Establishment {
    String place;
    String manager;
    ArrayList<Car> cars;

    public Establishment(String place, String manager) {
        this.place = place;
        this.manager = manager;
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public ArrayList<Car> getCarsAfterDate(LocalDate date) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getDateOfIssuingOfLicensePlate().isAfter(date)) {
                result.add(car);
            }
        }
        return result;
    }
    @Override
    public String toString() {
        Collections.sort(cars);
        StringBuilder resultString = new StringBuilder();
        resultString.append(String.format("Plaats: %s\nManager: %s\n\n", place, manager));
        for (Car car: cars) {
            resultString.append(car + "\n");
        }
        return resultString.toString();
    }
}
