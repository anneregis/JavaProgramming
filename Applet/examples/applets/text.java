import java.applet.*;
import java.awt.*;

public class text extends Applet
{//Declare a textfield
TextField text1;
TextField text2;
public void init()
{
text1=new TextField(20);
add(text1);
text1.setText("5");
text2=new TextField(20);
add(text2);
text2.setText("5");


//text1.setText("Welcome to java");
}
public void paint(Graphics g)
{
int x=0,y=0,z=0;
String s1,s2,s;
s1=text1.getText();
x=Integer.parseInt(s1);
s2=text2.getText();
y=Integer.parseInt(s2);
z=x+y;
s=String.valueOf (z);
g.drawString(s,100,75);
}
}