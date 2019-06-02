import java.util.HashMap;
import java.util.Map;

public class Bins {

    private int max;
    private int min;
    private Map<Integer,Integer> countmap;
    public Bins(int min, int max) {
    this.min = min;
    this.max = max;
    this.countmap = new HashMap<Integer, Integer>();
    for (int i=min; i<=max; i++) {
        this.countmap.put(i, 0);
    }
    }
    public int getBin(int number) {
        int count = 0;
        count = countmap.get(number);
        return count;
    }
    public void incrementBin(int num) {
       int value = countmap.get(num);
        countmap.put(num,++value);
    }
}

