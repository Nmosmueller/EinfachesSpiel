import java.util.Random;

public class GewinnModel {
    int gesamtPunkte;
    int spielerZahl;
    int computerZahl;
    int rundenErgebnis;

    public GewinnModel(int Zahleingegeben) {
        gesamtPunkte = 0;
        rundenErgebnis = 0;
        int random = new Random().nextInt(1, 10);
        if (Zahleingegeben != 0) {
            this.spielerZahl = Zahleingegeben;
        }
        this.computerZahl = random;

    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

}
