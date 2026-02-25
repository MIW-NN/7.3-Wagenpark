package wagenpark.project.model;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class VestigingTest{

    @Test
    public void testAddCar() {
        var vestiging = new Vestiging("","");

        Assert.assertTrue(vestiging.autos.isEmpty());

        vestiging.voegAutoToe(new Auto("", "", LocalDate.of(2020,1,1) , 100,""));

        Assert.assertFalse(vestiging.autos.isEmpty());
    }

    @Test
    public void testGetCarsAfterDate() {
        var vestiging = new Vestiging("","");

        var localDateBefore = LocalDate.of(2020,1,1);
        var localDate = LocalDate.of(2021,1,1);
        var localDateAfter = LocalDate.of(2021,2,1);

        vestiging.voegAutoToe(new Auto("", "", localDateBefore , 100,""));
        vestiging.voegAutoToe(new Auto("", "", localDateBefore , 100,""));
        vestiging.voegAutoToe(new Auto("", "", localDateBefore , 100,""));
        vestiging.voegAutoToe(new Auto("", "", localDateAfter , 100,""));
        vestiging.voegAutoToe(new Auto("", "", localDateAfter , 100,""));
        vestiging.voegAutoToe(new Auto("", "", localDateAfter , 100,""));

        Assert.assertEquals(3, vestiging.geefAutosNaDatum(localDate).size());
    }

    @Test
    public void testTestToString() {
        var plaats = "plaats";
        var manager = "Peter Peterson";

        var vestiging = new Vestiging(plaats,manager);
        var localDate = LocalDate.of(2021,1,1);
        vestiging.voegAutoToe(new Auto("", "", localDate , 100,""));

        Assert.assertTrue(vestiging.toString().contains(plaats));
        Assert.assertTrue(vestiging.toString().contains(manager));
        Assert.assertTrue(vestiging.toString().contains(localDate.toString()));
    }
}
