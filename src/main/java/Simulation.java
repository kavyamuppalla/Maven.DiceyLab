public class Simulation {
private  int noofdice;
private int noofruns;
Bins b;
public Simulation(int noofdice, int noofruns) {
    this.noofdice = noofdice;
    this.noofruns = noofruns;
    this.b = new Bins(2,12);
}

public void runSimulation() {
Dice d = new Dice(noofdice);

for (int i = 0 ; i < noofruns; i++) {
    int sum = d.tossAndSum();
    b.incrementBin(sum);
}
}
public void printResults() {
    System.out.println("Simulation of" +noofdice+ "dice tossed for " +noofruns);
    for (int i = 2;i<=12; i++){
        System.out.println(i +" :"+b.getBin(i));
    }
}
public static void main(String args[]) {
    Simulation n = new Simulation(2,10000);
    n.runSimulation();
    n.printResults();
}
}
