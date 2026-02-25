package wagenpark.project.model;

import java.time.LocalDate;

public class Auto implements Comparable<Auto>{
    private String merk;
    private String model;
    private LocalDate datumAfgifteKenteken;
    private int kilometerstand;
    private String kenteken;

    public Auto(String merk, String model, LocalDate datumAfgifteKenteken, int kilometerstand, String kenteken) {
        this.merk = merk;
        this.model = model;
        this.datumAfgifteKenteken = datumAfgifteKenteken;
        this.kilometerstand = kilometerstand;
        this.kenteken = kenteken;
    }

    @Override
    public int compareTo(Auto otherAuto) {
        return this.datumAfgifteKenteken.compareTo(otherAuto.datumAfgifteKenteken);
    }

    @Override
    public String toString() {
        return String.format("Merk: %s\nModel: %s\nDatum kenteken: %s\nKilometerstand: %d\nKenteken: %s\n",
                merk, model, datumAfgifteKenteken, kilometerstand, kenteken);
    }

    public LocalDate getDatumAfgifteKenteken() {
        return datumAfgifteKenteken;
    }
}
