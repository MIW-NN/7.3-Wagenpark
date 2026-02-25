package wagenpark.project.controller;

import wagenpark.project.model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class WagenparkLauncher {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Tesla", "S 100D", LocalDate.of(2019, 5,5), 12646, "TR-264-X");
        Auto auto2 = new Auto("Dacia", "Logan MPV", LocalDate.parse("2017-08-16"), 46367, "KS-567-W");
        Auto auto3 = new Auto("Toyota", "Prius", LocalDate.parse("2015-03-02"), 63234, "GG-111-K");
        System.out.println(auto3); // Voor het testen van de klasse Auto

        Vestiging vestiging = new Vestiging("Goumere", "Albert Mol");
        vestiging.voegAutoToe(auto1);
        vestiging.voegAutoToe(auto2);
        vestiging.voegAutoToe(auto3);
        System.out.println(vestiging);

        ArrayList<Auto> autosNaDatum = vestiging.geefAutosNaDatum(LocalDate.parse("2016-12-31"));
        System.out.println("Auto's na 31 december 2016");
        for (Auto auto : autosNaDatum) {
            System.out.println(auto);
        }
    }
}
