package H5; /**
 * Created by Windows on 12-9-2016.
 */

import java.applet.*;
import java.awt.*;

public class PraktijkOpdracht extends Applet {
        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;
    public void init(){
        setSize(800, 300);
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 220;
        hoogte = 100;
    }


    public void paint(Graphics g){


                                        /* Teksten */
        g.drawString("Lijn", 125, 50);
        g.drawString("Rechthoek", 105, 175);
        g.drawString("Afgeronde Rechthoek", 85, 295);
        g.drawString("Gevulde rechthoek met ovaal", 295, 175);
        g.drawString("Gevulde ovaal", 340, 295);
        g.drawString("Taartpunt met ovaal eromheen", 535, 175);
        g.drawString("Cirkel", 605, 295);
                                        /* Tekeningen */
        g.drawLine(30, 30, 250, 30);
        g.drawRect(30, 60, breedte, hoogte);
        g.drawRoundRect(30, 180, breedte, hoogte, 30, 30);
        g.setColor(opvulkleur);
        g.fillRect(270, 60, breedte, hoogte);
        g.fillArc(270, 180, breedte, hoogte, 90, 360);
        g.fillArc(510, 60, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawArc(270, 60, breedte, hoogte, 90, 360);
        g.drawArc(510, 60, breedte, hoogte, 90, 360);
        g.drawArc(570, 180, hoogte, hoogte, 0, 360);


    }

}
