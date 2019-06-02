import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void getBinTest() {
        Bins b = new Bins(2,12);
        b.incrementBin(2);
        b.incrementBin(2);
        b.incrementBin(2);
        int x = b.getBin(2);
        Assert.assertEquals(3,x);
    }
}
