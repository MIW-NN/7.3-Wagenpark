package wagenpark.project.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Vestiging {
    String plaats;
    String manager;
    ArrayList<Auto> autos;

    public Vestiging(String plaats, String manager) {
        this.plaats = plaats;
        this.manager = manager;
        autos = new ArrayList<>();
    }

    public void voegAutoToe(Auto auto) {
        autos.add(auto);
    }

    public ArrayList<Auto> geefAutosNaDatum(LocalDate datum) {
        ArrayList<Auto> result = new ArrayList<>();
        for (Auto auto : autos) {
            if (auto.getDatumAfgifteKenteken().isAfter(datum)) {
                result.add(auto);
            }
        }
        return result;
    }
    @Override
    public String toString() {
        Collections.sort(autos);
        StringBuilder resultString = new StringBuilder();
        resultString.append(String.format("Plaats: %s\nManager: %s\n\n", plaats, manager));
        for (Auto auto: autos) {
            resultString.append(auto + "\n");
        }
        return resultString.toString();
    }
}
