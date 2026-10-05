import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpielView extends JFrame {
    private GewinnModel model;

    private JLabel lblRundenErgebnis;
    private JLabel lblGesamtPunkte;
    private JTextField txtSpielerZahl;
    private JTextField txtComputerZahl;
    private JButton btnNochEinmal;

    public SpielView() {
        model = new GewinnModel(0);

        setTitle("Zahlen-Gewinnspiel (v1.0)");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));