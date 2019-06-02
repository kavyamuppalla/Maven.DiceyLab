import org.junit.Assert;
import org.junit.Test;


public class DiceTest {
    @Test
    public void tossAndSumTestTwoDice() {
        Dice d = new Dice(2);
        int num = d.tossAndSum();
        Assert.assertTrue(num >=2);
        Assert.assertTrue(num <=12);

    }
public void tossAndSumTestFiveDice() {
        Dice d = new Dice(5);
        int num = d.tossAndSum();
        Assert.assertTrue(num >=5);
        Assert.assertTrue(num <=30);
}
}

