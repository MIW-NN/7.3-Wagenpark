package wagenpark.project.model;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class VestigingTest {

    @Test
    public void testVoegAutoToe() {
        var establishment = new Vestiging("","");

        Assert.assertTrue(establishment.autos.isEmpty());

        establishment.voegAutoToe(new Auto("", "", LocalDate.of(2020,1,1) , 100,""));

        Assert.assertFalse(establishment.autos.isEmpty());
    }

    @Test
    public void testGeefAutosNaDatum() {
        var establishment = new Vestiging("","");

        var localDateBefore = LocalDate.of(2020,1,1);
        var localDate = LocalDate.of(2021,1,1);
        var localDateAfter = LocalDate.of(2021,2,1);

        establishment.voegAutoToe(new Auto("", "", localDateBefore , 100,""));
        establishment.voegAutoToe(new Auto("", "", localDateBefore , 100,""));
        establishment.voegAutoToe(new Auto("", "", localDateBefore , 100,""));
        establishment.voegAutoToe(new Auto("", "", localDateAfter , 100,""));
        establishment.voegAutoToe(new Auto("", "", localDateAfter , 100,""));
        establishment.voegAutoToe(new Auto("", "", localDateAfter , 100,""));

        Assert.assertEquals(3, establishment.geefAutosNaDatum(localDate).size());
    }

    @Test
    public void testTestToString() {
        var place = "plaats";
        var manager = "Peter Peterson";

        var establishment = new Vestiging(place,manager);
        var localDate = LocalDate.of(2021,1,1);
        establishment.voegAutoToe(new Auto("", "", localDate , 100,""));

        Assert.assertTrue(establishment.toString().contains(place));
        Assert.assertTrue(establishment.toString().contains(manager));
        Assert.assertTrue(establishment.toString().contains(localDate.toString()));
    }
}