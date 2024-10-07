package wagenpark.project.model;

import java.time.LocalDate;

public class Auto implements Comparable<Auto> {
    private String merk;
    private String model;
    private LocalDate datumAfgifteKenteken;
    private int kilometerstand;
    private String kenteken;

    public Auto(String merk, String model, LocalDate datumAfgifteKenteken, int kilometerstand, String kenteken) {
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public int compareTo(Auto o) {
        return 0;
    }
}
