package wagenpark.project.model;

import java.time.LocalDate;

public class Car{
    private String brand;
    private String model;
    private LocalDate dateOfIssuingOfLicensePlate;
    private int mileage;
    private String licensePlate;

    public Car(String brand, String model, LocalDate dateOfIssuingOfLicensePlate, int mileage, String kenteken) {
    }

//    @Override
    public int compareTo(Car otherCar) {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
