package eindtoets;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
import java.net.URL;
/**
 * Created by Windows on 15-12-2016.
 */
public class Slotmachine extends Applet{


    Button speelknop, koopknop;
    int random, random2, random3, krediet;
    Image[] fruit;
    Image[] fruit2;
    Image[] fruit3;
    URL pad;
    String gewonnen, letop;
    boolean img,img2,scherm;
    AudioClip sound;

    public void init(){

        speelknop = new Button("Speel");
        speelknop.addActionListener( new speelknop());
        koopknop = new Button("Koop 10 kredietpunten");
        koopknop.addActionListener( new koopknop());
        koopknop.setEnabled(false);

        random = 0;
        random2 = 0;
        random3 = 0;
        krediet = 10;


        pad = Slotmachine.class.getResource("plaatjes/");
        fruit = new Image[19];
        for (int i = 0; i < fruit.length; i++) {
            fruit[i] = getImage(pad, "fruit_" + (i+1) + ".jpg");
        }

        fruit2 = new Image[19];
        for (int i = 0; i < fruit2.length; i++) {
            fruit2[i] = getImage(pad, "fruit_" + (i+1) +".jpg");
        }

        fruit3 = new Image[19];
        for (int i = 0; i < fruit3.length; i++) {
            fruit3[i] = getImage(pad, "fruit_" + (i+1) +".jpg");
        }



        gewonnen = "";
        letop = "";

        img = false;
        img2 = false;
        scherm = false;

        add(speelknop);
        add(koopknop);



        setSize(350,320);
    }

    public void paint(Graphics g){
        if(scherm == true){
            g.drawImage(fruit[random], 40, 50, this);
            g.drawImage(fruit2[random2], 110, 50, this);
            g.drawImage(fruit3[random3], 180, 50, this);
        }
        g.drawString("Krediet: " + krediet,60,250);
        g.drawString(gewonnen,60,270);
        g.drawString(letop,60,290);

    }

    class speelknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            krediet--;
            scherm = true;
            gewonnen = "";
            Random r1 = new Random();
            random = r1.nextInt(fruit.length);
            Random r2 = new Random();
            random2 = r2.nextInt(fruit2.length);
            Random r3 = new Random();
            random3 = r3.nextInt(fruit3.length);

            if(krediet <= 0){
                krediet = 0;
                speelknop.setEnabled(false);
                koopknop.setEnabled(true);
                letop = "Om verder te kunnen spelen moet u krediet kopen";
            }
            if(krediet> 0){
                if (fruit[random] == fruit2[random2] || fruit[random] == fruit3[random3] || fruit2[random2] == fruit[random] || fruit2[random2] == fruit3[random3] || fruit3[random3] == fruit[random] || fruit3[random3] == fruit2[random2]) {
                    krediet = krediet + 4;
                    gewonnen = "Gewonnen: 4";
                    sound = getAudioClip(pad, "casino.wav");
                    sound.play();
                }
                if (fruit[random] == fruit2[random2] && fruit[random] == fruit3[random3] && fruit2[random2] == fruit3[random3]) {
                    krediet = krediet + 20;
                    gewonnen = "Gewonnen: 20";
                    sound = getAudioClip(pad, "casino.wav");
                    sound.play();
                }
            }
            repaint();
        }
    }
    class koopknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            krediet = krediet + 10;
            koopknop.setEnabled(false);
            speelknop.setEnabled(true);
            letop = "";
            repaint();
        }
    }
}

