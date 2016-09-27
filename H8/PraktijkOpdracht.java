package H8;

/**
 * Created by Windows on 27-9-2016.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet{

    TextField tekstvak, tekstvak2;
    Button plusknop, minknop, deelknop, vermenigknop;
    Double eerste, tweede, uitkomst;


    public void init(){
        tekstvak = new TextField(10);
        tekstvak2 = new TextField(10);

        plusknop = new Button ("+");
        plusknop.addActionListener(new PlusListener() );
        minknop = new Button ("-");
        minknop.addActionListener(new MinListener() );
        deelknop = new Button ("/");
        deelknop.addActionListener(new DeelListener() );
        vermenigknop = new Button ("*");
        vermenigknop.addActionListener(new VermenigListener() );


        add(tekstvak);
        add(tekstvak2);
        add(vermenigknop);
        add(deelknop);
        add(plusknop);
        add(minknop);



        setSize(300,280);
    }

    public void paint(Graphics g){

    }



    class PlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            eerste = Double.parseDouble(tekstvak.getText());
            tweede = Double.parseDouble(tekstvak2.getText());
            uitkomst = eerste+tweede;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }

    class MinListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            eerste = Double.parseDouble(tekstvak.getText());
            tweede = Double.parseDouble(tekstvak2.getText());
            uitkomst = eerste-tweede;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();
        }
    }

    class DeelListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            eerste = Double.parseDouble(tekstvak.getText());
            tweede = Double.parseDouble(tekstvak2.getText());
            uitkomst = eerste/tweede;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }

    class VermenigListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            eerste = Double.parseDouble(tekstvak.getText());
            tweede = Double.parseDouble(tekstvak2.getText());
            uitkomst = eerste*tweede;
            tekstvak.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }
}
