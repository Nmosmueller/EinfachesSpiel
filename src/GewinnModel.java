import java.util.Random;

public class GewinnModel {
    int gesamtPunkte;
    int spielerZahl;
    int computerZahl;
    int rundenErgebnis;

    public GewinnModel(int spielerzahl) {
        gesamtPunkte = 30;
        rundenErgebnis = 0;
        berechneRunde(spielerzahl);
        berechneComputerZahl();

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
    public void berechneComputerZahl() {
        int random = new Random().nextInt(1, 10);
        this.computerZahl = random;
    }
    public void berechneRunde(int spielerZahl) {
        this.spielerZahl = spielerZahl;
        if(spielerZahl == this.computerZahl) {
            this.gesamtPunkte = this.gesamtPunkte + 20;
        } else if((spielerZahl -1 == this.computerZahl) || (spielerZahl +1 == this.computerZahl)) {
            this.gesamtPunkte = this.gesamtPunkte + 5;
        }else {
            this.gesamtPunkte = this.gesamtPunkte - 10;
        }
        if(hatGewonnen()== true){
            System.out.println("Gewonnen");
        }
        if(hatVerloren()== true){
            System.out.println("Verloren");
        }
    }
    public boolean hatGewonnen(){
        if(this.gesamtPunkte >= 100) {
            return true;
        }else{
            return false;
        }
    }
    public boolean hatVerloren(){
        if(this.gesamtPunkte <= 0) {
            return true;
        }else {
            return false;
        }
    }
}
