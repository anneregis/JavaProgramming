import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MouseEvents extends Applet implements MouseListener
{
public void init()
{
addMouseListener(this);
}

public void mouseClicked(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="mouse clicked";
repaint();
}
public void mouseEntered(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="mouse entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="mouse exited";
repaint();
}
public void mousePressed(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="down";
repaint();
}
public void mouseReleased(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="up";
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,70,100)
}
