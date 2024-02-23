package wagenpark.project.model;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class EstablishmentTest{

    @Test
    public void testAddCar() {
        var establishment = new Establishment("","");

        Assert.assertTrue(establishment.cars.isEmpty());

        establishment.addCar(new Car("", "", LocalDate.of(2020,1,1) , 100,""));

        Assert.assertFalse(establishment.cars.isEmpty());
    }

    @Test
    public void testGetCarsAfterDate() {
        var establishment = new Establishment("","");

        var localDateBefore = LocalDate.of(2020,1,1);
        var localDate = LocalDate.of(2021,1,1);
        var localDateAfter = LocalDate.of(2021,2,1);

        establishment.addCar(new Car("", "", localDateBefore , 100,""));
        establishment.addCar(new Car("", "", localDateBefore , 100,""));
        establishment.addCar(new Car("", "", localDateBefore , 100,""));
        establishment.addCar(new Car("", "", localDateAfter , 100,""));
        establishment.addCar(new Car("", "", localDateAfter , 100,""));
        establishment.addCar(new Car("", "", localDateAfter , 100,""));

        Assert.assertEquals(3, establishment.getCarsAfterDate(localDate).size());
    }

    @Test
    public void testTestToString() {
        var place = "plaats";
        var manager = "Peter Peterson";

        var establishment = new Establishment(place,manager);
        var localDate = LocalDate.of(2021,1,1);
        establishment.addCar(new Car("", "", localDate , 100,""));

        Assert.assertTrue(establishment.toString().contains(place));
        Assert.assertTrue(establishment.toString().contains(manager));
        Assert.assertTrue(establishment.toString().contains(localDate.toString()));
    }
}