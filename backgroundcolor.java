

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class backgroundcolor extends Applet{
    public void init(){
	setBackground(Color.BLUE);
	resize(400,400);
    }
    public void paint(Graphics g){
	g.drawString("welcome the first screen",50,50);
    }
}
