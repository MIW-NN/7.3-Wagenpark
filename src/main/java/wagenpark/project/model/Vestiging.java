package wagenpark.project.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vestiging {
    String plaats;
    String manager;
    ArrayList<Auto> autos;

    public Vestiging(String plaats, String manager) {
    }

    public void voegAutoToe(Auto auto) {
    }

    public ArrayList<Auto> geefAutosNaDatum(LocalDate datum) {
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "";
    }
}
