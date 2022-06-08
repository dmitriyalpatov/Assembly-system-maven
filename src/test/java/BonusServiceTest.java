import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {


@Test
    public void shouldCalculateBonusIfSmallAmauntAndRegistered() {

        BonusService service = new BonusService();

        int actual = (int) service.calculate(1_000, true);
        int expected = 30;

        Assertions.assertEquals(expected, actual);


    }

@Test
    public void shouldCalculateBonusIfBigAmountAndRegistered() {

    BonusService service = new BonusService();

    int actual = (int) service.calculate(2_000_000, true);
    int expected = 500;

}
@Test
    public void YouShouldCalculateTheBonusIfTheAmountIsSmallAndNotRegistered() {

    BonusService service = new BonusService();

    int actual = (int) service.calculate(1_500, false);
    int expected = 15;

    Assertions.assertEquals(expected, actual);}

@Test
    public void youShouldCalculateTheBonusIfTheAmountIsBigAndNotRegistered() {

        BonusService service = new BonusService();

        int actual = (int) service.calculate(55_000, false);
        int expected = 500;

        Assertions.assertEquals(expected, actual);
    }


}



