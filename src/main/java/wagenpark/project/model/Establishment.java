package wagenpark.project.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Establishment {
    String place;
    String manager;
    ArrayList<Car> cars;

    public Establishment(String place, String manager) {
    }

    public void addCar(Car car) {
    }

    public ArrayList<Car> getCarsAfterDate(LocalDate date) {
        return new ArrayList<>();
    }
    @Override
    public String toString() {
        return "";
    }
}
