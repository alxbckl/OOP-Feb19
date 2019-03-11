import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ChatSpammerKonstruktor extends JFrame{

    Sender sende;

    JTextField tanzahl;
    JTextField tzeit;
    JTextField tSatz;

    JTextField tanzahlE;
    JTextField tzeitE;

    JButton bstart;
//JButton bschließen;

    public ChatSpammerKonstruktor(Sender sende){

        this.sende = sende;
        tanzahl = new JTextField("");
        tanzahlE = new JTextField("Wie viele Wörter sollen geschrieben werden?");
        tanzahlE.setEditable(false);
        tSatz = new JTextField("hier Satz eingeben");
        tzeit = new JTextField("");
        tzeitE = new JTextField("Zeitlicher Abstand in ms");
        tzeitE.setEditable(false);
        bstart = new JButton("start");
//bschließen = new JButton("schließen");

        tanzahl.setBounds(10, 10, 300, 40);
        tanzahlE.setBounds(10, 55, 300, 20);
        tSatz.setBounds(230, 80, 300, 40);
        tzeit.setBounds(320, 10, 150, 40);
        tzeitE.setBounds(320, 55, 150, 20);
        bstart.setBounds(110, 80, 100, 40);
//bschließen.setBounds(130, 60, 100, 40);

        bstart.addActionListener(new actionListener());

        add(tanzahl);
        add(tanzahlE);
        add(tSatz);
        add(tzeit);
        add(tzeitE);
        add(bstart);
//add(bschließen);

    }

    public class actionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == bstart){

                int time;
                time = Integer.parseInt(tzeit.getText());

                int menge = Integer.parseInt(tanzahl.getText());

                String Satz = tSatz.getText();

                sende.senden(time, menge, Satz);

            }
        }
    }
}