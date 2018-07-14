import java.awt.*;
import java.applet.*;
import java.io.*;
public class appleteg extends Applet
{
String msg;
public void init()
{
setBackground(Color.red);
setForeground(Color.black);
}
public void start()
{
msg = "hello";
}
public void paint(Graphics g)
{
g.drawString(msg,10,100);
g.drawOval(150,150,200,200);
g.drawOval(190,200,30,44);
g.drawOval(270,200,30,44);
g.fillOval(200,224,15,20);
g.fillOval(280,224,15,20);
g.drawLine(245,245,245,290);
g.drawArc(225,260,40,60,180,180);
g.drawArc(185,180,40,50,-180,-190);
g.drawArc(265,180,40,50,-180,-190);
}
}