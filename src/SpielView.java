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
        JPanel topPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        topPanel.add(new JLabel("Rundenergebnis:", SwingConstants.CENTER));
        topPanel.add(new JLabel("Gesamtpunkte:", SwingConstants.CENTER));

        lblRundenErgebnis = new JLabel("Tippe eine Zahl von 1 bis 9", SwingConstants.CENTER);
        lblRundenErgebnis.setOpaque(true);
        lblRundenErgebnis.setBackground(Color.WHITE);

        lblGesamtPunkte = new JLabel("30", SwingConstants.CENTER);
        lblGesamtPunkte.setOpaque(true);
        lblGesamtPunkte.setBackground(Color.WHITE);

        topPanel.add(lblRundenErgebnis);
        topPanel.add(lblGesamtPunkte);

        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        centerPanel.add(new JLabel("Deine Zahl:", SwingConstants.CENTER));
        centerPanel.add(new JLabel("Computer:", SwingConstants.CENTER));

        txtSpielerZahl = new JTextField();
        txtSpielerZahl.setHorizontalAlignment(JTextField.CENTER);

        txtComputerZahl = new JTextField();
        txtComputerZahl.setHorizontalAlignment(JTextField.CENTER);
        txtComputerZahl.setEditable(false);

        centerPanel.add(txtSpielerZahl);
        centerPanel.add(txtComputerZahl);

        btnNochEinmal = new JButton("Noch einmal!");

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(btnNochEinmal, BorderLayout.SOUTH);