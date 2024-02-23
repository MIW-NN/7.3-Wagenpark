package wagenpark.project.model;

import java.time.LocalDate;

public class Car implements Comparable<Car>{
    private String brand;
    private String model;
    private LocalDate dateOfIssuingOfLicensePlate;
    private int mileage;
    private String licensePlate;

    public Car(String brand, String model, LocalDate dateOfIssuingOfLicensePlate, int mileage, String kenteken) {
        this.brand = brand;
        this.model = model;
        this.dateOfIssuingOfLicensePlate = dateOfIssuingOfLicensePlate;
        this.mileage = mileage;
        this.licensePlate = kenteken;
    }

    @Override
    public int compareTo(Car otherCar) {
        return this.dateOfIssuingOfLicensePlate.compareTo(otherCar.dateOfIssuingOfLicensePlate);
    }

    @Override
    public String toString() {
        return String.format("Merk: %s\nModel: %s\nDatum kenteken: %s\nKilometerstand: %d\nKenteken: %s\n",
                brand, model, dateOfIssuingOfLicensePlate, mileage, licensePlate);
    }

    public LocalDate getDateOfIssuingOfLicensePlate() {
        return dateOfIssuingOfLicensePlate;
    }
}
