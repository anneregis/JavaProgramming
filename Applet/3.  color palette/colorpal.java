import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="colorpal" width=500 height=500>
</applet>*/
public class colorpal extends Applet implements ItemListener,ActionListener,MouseListener
{
 Checkbox bg,fg;
 Button r,b,g,c,y,m,o,p;
 String msg;
public void init() 
{
  setLayout(new FlowLayout());
  r=new Button("RED");
  b=new Button("BLUE");
  g=new Button("GREEN");
  c=new Button("CYAN");
  y=new Button("YELLOW");
  m=new Button("MAGENTHA");
  o=new Button("ORANGE");
  p=new Button("PINK");
  add(r);
  add(b);
  add(g);
  add(c);
  add(y);
  add(m);
  add(o);
  add(p);
  msg="My WebPage Fore-Color";
  bg=new Checkbox("Background");
  fg=new Checkbox("Foreground");
  add(bg);
  add(fg);
  bg.addItemListener(this);
  fg.addItemListener(this);
  r.addActionListener(this);
  g.addActionListener(this);
  b.addActionListener(this);
  c.addActionListener(this);
  y.addActionListener(this);
  m.addActionListener(this);
  o.addActionListener(this);
  p.addActionListener(this);
  addMouseListener(this);
  
}
public void itemStateChanged(ItemEvent ie) 
{
repaint();
}
public void mousePressed(MouseEvent me){}
public void mouseClicked(MouseEvent me) {}
public void mouseEntered(MouseEvent me) {}
public void mouseExited(MouseEvent me) {}
public void mouseReleased(MouseEvent me) {}
public void actionPerformed(ActionEvent ae) 
{
  if(bg.getState()==true)
  {
   if(ae.getSource()==r)
     setBackground(Color.red);
   else if(ae.getSource()==b)
     setBackground(Color.blue);
   else if(ae.getSource()==g)
     setBackground(Color.green);
   else if(ae.getSource()==c)  
     setBackground(Color.cyan);
   else if(ae.getSource()==y)
     setBackground(Color.yellow);
   else if(ae.getSource()==m)
     setBackground(Color.magenta);
   else if(ae.getSource()==o)
     setBackground(Color.orange);
   else 
     setBackground(Color.pink);
   }
 if(fg.getState()==true)
 {
   if(ae.getSource()==r)
     setForeground(Color.red);
   else if(ae.getSource()==b)
     setForeground(Color.blue);
   else if(ae.getSource()==g)
     setForeground(Color.green);
   else if(ae.getSource()==c)
     setForeground(Color.cyan);   else if(ae.getSource()==y)
     setForeground(Color.yellow);
   else if(ae.getSource()==m)
     setForeground(Color.magenta);
   else if(ae.getSource()==o)
     setForeground(Color.orange);
   else if(ae.getSource()==p)
     setForeground(Color.pink);
  }
}
public void paint(Graphics g)
{
  g.drawString(msg,150,250);
}
}
