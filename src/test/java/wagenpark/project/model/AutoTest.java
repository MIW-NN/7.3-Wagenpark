package wagenpark.project.model;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class AutoTest {

    @Test
    public void expectComparisonToReturn0_whenDateOfIssuingLicensePlateIsSame(){
        var date = LocalDate.of(2020,2,2);

        var car1 = new Auto("","",date, 0,"");
        var car2 = new Auto("as","d",date, 10,"123456");

        Assert.assertEquals(0, car1.compareTo(car2));
    }

    @Test
    public void expectComparisonToNotReturn0_whenDateOfIssuingLicensePlateIsDifferent(){
        var date1 = LocalDate.of(2020,2,2);
        var date2 = LocalDate.of(2020,10,2);

        var car1 = new Auto("","",date1, 0,"");
        var car2 = new Auto("as","d",date2, 10,"123456");

        Assert.assertNotEquals(0,car1.compareTo(car2));
    }
}