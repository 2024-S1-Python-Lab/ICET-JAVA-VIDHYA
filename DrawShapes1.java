import java.applet.Applet; 
import java.awt.*; 
public class DrawShapes1 extends Applet  
{ 
public void paint(Graphics g)  
{       
g.setColor(Color.GREEN);      // Set color  
g.drawLine(50, 200, 300, 200);       
g.setColor(Color.RED);     
g.drawRect(50, 50, 150, 100);   
g.setColor(Color.BLUE);     
g.drawOval(250, 50, 100, 100); //draw a circle (Oval with equal width & height) 
} 
}