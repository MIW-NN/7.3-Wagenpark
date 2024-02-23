package wagenpark.project.controller;

import wagenpark.project.model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class WagenparkLauncher {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "S 100D", LocalDate.of(2019, 5,5), 12646, "TR-264-X");
        Car car2 = new Car("Dacia", "Logan MPV", LocalDate.parse("2017-08-16"), 46367, "KS-567-W");
        Car car3 = new Car("Toyota", "Prius", LocalDate.parse("2015-03-02"), 63234, "GG-111-K");
        System.out.println(car3); // Voor het testen van de klasse Auto

        Establishment vestiging = new Establishment("Goumere", "Albert Mol");
        vestiging.addCar(car1);
        vestiging.addCar(car2);
        vestiging.addCar(car3);
        System.out.println(vestiging);

        ArrayList<Car> autosNaDatum = vestiging.getCarsAfterDate(LocalDate.parse("2016-12-31"));
        System.out.println("Auto's na 31 december 2016");
        for (Car auto : autosNaDatum) {
            System.out.println(auto);
        }
    }
}
