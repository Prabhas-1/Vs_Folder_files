import java.awt.*;
import java.applet.*;

class Shapes extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Different Shapes",15,15);
        g.drawLine(10,20,50,60);
        g.drawRect(10,70,40,40);
        g.setColor(Color.red);
        g.fillRect(10,90,50,40);
        
    }
}

/*
<applet code="Shapes" width=200 height=200>
</applet>
*/