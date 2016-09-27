package H6;

/**
 * Created by Windows on 27-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet{
    double toetsCijfer1, toetsCijfer2, toetsCijfer3, gemiddeldeCijfer;

    public void init(){
        toetsCijfer1 = 5.9;
        toetsCijfer2 = 6.3;
        toetsCijfer3 = 6.9;
        gemiddeldeCijfer = (toetsCijfer1 + toetsCijfer2 + toetsCijfer3) / 3;
    }

    public void paint(Graphics g){
        g.drawString("Het gemiddelde is " + ((double) (int) (gemiddeldeCijfer * 10) / 10) , 20, 20);
    }
}


