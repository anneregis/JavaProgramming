import java.awt.*;
import java.awt.Panel.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="awt" width=600 height=600></applet>*/
public class awt extends Applet implements ActionListener,ItemListener
{
TextField name,age;
Choice browser;
CheckboxGroup cbg;
Checkbox male,female;
List os;
Button submit;
Panel p1,p2,p3,p4,p5,p6;
public void init()
{
setLayout(new GridLayout(5,2));
Label lname=new Label("Name: ");
name=new TextField(20);
p1=new Panel();
p1.setLayout(new FlowLayout());
p1.add(lname);
p1.add(name);

Label lage=new Label("Age: ");
age=new TextField(20);
p2=new Panel();
p2.setLayout(new FlowLayout());
p2.add(lage);
p2.add(age);

Label lsex=new Label("Sex: ");
cbg=new CheckboxGroup();
male=new Checkbox("Male",cbg,true);
female=new Checkbox("Female",cbg,false);
p3=new Panel();
p3.setLayout(new FlowLayout());
p3.add(lsex);
p3.add(male);
p3.add(female);

Label lbrowser=new Label("Browser: ");
browser=new Choice();
browser.add("Internet explorer");
browser.add("NetScape");
browser.add("Mozill firefox");
browser.add("Opera");
p4=new Panel();
p4.setLayout(new FlowLayout());
p4.add(lbrowser);
p4.add(browser);

Label los=new Label("Operating System: ");
os=new List(4);
os.add("Win 98");
os.add("Win-NT");
os.add("Solaris");
os.add("MAC-OS");
p5=new Panel();
p5.setLayout(new FlowLayout());
p5.add(los);
p5.add(os);

submit=new Button("Submit");
p6=new Panel();
p6.setLayout(new FlowLayout());
p6.add(submit);

add(p1);
add(p2);
add(p3);
add(p4);
add(p5);
add(p6);
submit.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
repaint();
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
g.setFont(new Font("Timesnewroman", Font.BOLD, 20));
g.setColor(Color.blue);
g.drawString("Name: "+name.getText(),50,500);
g.drawString("Age: "+age.getText(),50,520);
g.drawString("Gender: "+cbg.getSelectedCheckbox().getLabel(),50,540);
g.drawString("Browser: "+browser.getSelectedItem(),50,560);
g.drawString("Operating system: "+os.getSelectedItem(),50,580);
}
}
