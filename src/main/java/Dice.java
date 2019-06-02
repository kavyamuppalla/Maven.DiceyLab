public class Dice {
    private int noofdice;
    public Dice(int noofdice) {
        this.noofdice = noofdice;
    }
    public int tossAndSum() {
        int number = 0;
        for(int i =0; i < noofdice; i++) {
            number += (int)(Math.random()*6) + 1;
        }
        return number;
    }


}
