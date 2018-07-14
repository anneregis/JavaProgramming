import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class fr extends Frame implements ActionListener
{
 Label name,rno,m1,m2,m3,m4,m5,total,avg,y,d;
 TextField tname,trno,tm1,tm2,tm3,tm4,tm5,ttotal,tavg;
 Choice year,department;
 Button Calculate;
 String str;
fr()
{
 setBackground(Color.cyan);
 setVisible(true);
 Init();
}
 public void Init()
 {
   setLayout(null);
   name= new Label("NAME",Label.LEFT);
   rno= new Label("ROLLNO",Label.LEFT);
   m1= new Label("MARK1",Label.LEFT);
   m2= new Label("MARK2",Label.LEFT);
   m3= new Label("MARK3",Label.LEFT);
   m4= new Label("MARK4",Label.LEFT);
   m5= new Label("MARK5",Label.LEFT);
   total= new Label("TOTAL",Label.LEFT);
   avg = new Label("AVERAGE",Label.LEFT);
   y= new Label("YEAR",Label.LEFT);
   d= new Label("DEPARTMENT",Label.LEFT);
   year = new Choice();
   year.addItem("2007");
   year.addItem("2008");
   year.addItem("2009");
   department = new Choice();
   department.addItem("it");
   department.addItem("ct");
Calculate = new Button("Calculate");
Calculate.setBounds(250,700,120,50);
Calculate.addActionListener(this);
 add(Calculate);
name.setBounds(150,50,100,20);
rno.setBounds(150,100,100,20);
y.setBounds(150,150,100,20);
d.setBounds(150,200,100,20);
m1.setBounds(150,250,100,20);
m2.setBounds(150,300,100,20);
m3.setBounds(150,350,100,20);
m4.setBounds(150,400,100,20);
m5.setBounds(150,450,100,20);
total.setBounds(150,500,100,20);
avg.setBounds(150,550,100,20);
    tname = new TextField(15);
    trno= new TextField(15);
    tm1= new TextField(15);
    tm2= new TextField(15);
    tm3= new TextField(15);
    tm4= new TextField(15);
    tm5= new TextField(15);
    ttotal= new TextField(15);
    tavg= new TextField(15);
add(name); add(tname);
add(rno);add(trno);
add(y); add(year);
add(d); add(department);
add(m1);add(tm1);

add(m2);add(tm2);
add(m3); add(tm3);
add(m4); add(tm4);
add(m5); add(tm5);
add(total); add(ttotal);
add(avg); add(tavg);
tname.setBounds(250,50,120,20);
trno.setBounds(250,100,120,20);
year.setBounds(250,150,120,20);
department.setBounds(250,200,120,20);
tm1.setBounds(250,250,120,20);
tm2.setBounds(250,300,120,20);
tm3.setBounds(250,350,120,20);
tm4.setBounds(250,400,120,20);
tm5.setBounds(250,450,120,20);
ttotal.setBounds(250,500,120,20);
tavg.setBounds(250,550,120,20);
  tname.addActionListener(this);
  trno.addActionListener(this);
  tm1.addActionListener(this);
  tm2.addActionListener(this);
  tm3.addActionListener(this);
  tm4.addActionListener(this);
  tm5.addActionListener(this);
  ttotal.addActionListener(this);
  tavg.addActionListener(this);
addWindowListener(new WindowAdapter()
{
 public void WindowClosing(WindowEvent We)
{
 System.exit(0);
}
});}
  public void actionPerformed(ActionEvent e)
 {
  String str=e.getActionCommand();
  if(str.equalsIgnoreCase("Calculate"))
   {
      String a=tm1.getText();
      int k1=Integer.parseInt(a);
      a=tm2.getText();
      int k2=Integer.parseInt(a);
      a=tm3.getText();
      int k3=Integer.parseInt(a);
      a=tm4.getText();
      int k4=Integer.parseInt(a);
      a=tm5.getText();
      int k5=Integer.parseInt(a);
      int tott=k1+k2+k3+k4+k5;
      int avge=tott/5;
       String s1=String.valueOf(tott);
     ttotal.setText(s1);
       String s2=String.valueOf(avge);

       tavg.setText(s2);
 }}
 public void paint(Graphics g)
 {
  g.drawString("studentdetails",40,40);
 }
public static void main(String[] args)
{
new fr();
}}
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class fr extends Frame implements ActionListener
{
 Label name,rno,m1,m2,m3,m4,m5,total,avg,y,d;
 TextField tname,trno,tm1,tm2,tm3,tm4,tm5,ttotal,tavg;
 Choice year,department;
 Button Calculate;
 String str;
fr()
{
 setBackground(Color.cyan);
 setVisible(true);
 Init();
}
 public void Init()
 {
   setLayout(null);
   name= new Label("NAME",Label.LEFT);
   rno= new Label("ROLLNO",Label.LEFT);
   m1= new Label("MARK1",Label.LEFT);
   m2= new Label("MARK2",Label.LEFT);
   m3= new Label("MARK3",Label.LEFT);
   m4= new Label("MARK4",Label.LEFT);
   m5= new Label("MARK5",Label.LEFT);
   total= new Label("TOTAL",Label.LEFT);
   avg = new Label("AVERAGE",Label.LEFT);
   y= new Label("YEAR",Label.LEFT);
   d= new Label("DEPARTMENT",Label.LEFT);
   year = new Choice();
   year.addItem("2007");
   year.addItem("2008");
   year.addItem("2009");
   department = new Choice();
   department.addItem("it");
   department.addItem("ct");
Calculate = new Button("Calculate");
Calculate.setBounds(250,700,120,50);
Calculate.addActionListener(this);
 add(Calculate);
name.setBounds(150,50,100,20);
rno.setBounds(150,100,100,20);
y.setBounds(150,150,100,20);
d.setBounds(150,200,100,20);
m1.setBounds(150,250,100,20);
m2.setBounds(150,300,100,20);
m3.setBounds(150,350,100,20);
m4.setBounds(150,400,100,20);
m5.setBounds(150,450,100,20);
total.setBounds(150,500,100,20);
avg.setBounds(150,550,100,20);
    tname = new TextField(15);
    trno= new TextField(15);
    tm1= new TextField(15);
    tm2= new TextField(15);
    tm3= new TextField(15);
    tm4= new TextField(15);
    tm5= new TextField(15);
    ttotal= new TextField(15);
    tavg= new TextField(15);
add(name); add(tname);
add(rno);add(trno);
add(y); add(year);
add(d); add(department);
add(m1);add(tm1);

add(m2);add(tm2);
add(m3); add(tm3);
add(m4); add(tm4);
add(m5); add(tm5);
add(total); add(ttotal);
add(avg); add(tavg);
tname.setBounds(250,50,120,20);
trno.setBounds(250,100,120,20);
year.setBounds(250,150,120,20);
department.setBounds(250,200,120,20);
tm1.setBounds(250,250,120,20);
tm2.setBounds(250,300,120,20);
tm3.setBounds(250,350,120,20);
tm4.setBounds(250,400,120,20);
tm5.setBounds(250,450,120,20);
ttotal.setBounds(250,500,120,20);
tavg.setBounds(250,550,120,20);
  tname.addActionListener(this);
  trno.addActionListener(this);
  tm1.addActionListener(this);
  tm2.addActionListener(this);
  tm3.addActionListener(this);
  tm4.addActionListener(this);
  tm5.addActionListener(this);
  ttotal.addActionListener(this);
  tavg.addActionListener(this);
addWindowListener(new WindowAdapter()
{
 public void WindowClosing(WindowEvent We)
{
 System.exit(0);
}
});}
  public void actionPerformed(ActionEvent e)
 {
  String str=e.getActionCommand();
  if(str.equalsIgnoreCase("Calculate"))
   {
      String a=tm1.getText();
      int k1=Integer.parseInt(a);
      a=tm2.getText();
      int k2=Integer.parseInt(a);
      a=tm3.getText();
      int k3=Integer.parseInt(a);
      a=tm4.getText();
      int k4=Integer.parseInt(a);
      a=tm5.getText();
      int k5=Integer.parseInt(a);
      int tott=k1+k2+k3+k4+k5;
      int avge=tott/5;
       String s1=String.valueOf(tott);
     ttotal.setText(s1);
       String s2=String.valueOf(avge);

       tavg.setText(s2);
 }}
 public void paint(Graphics g)
 {
  g.drawString("studentdetails",40,40);
 }
public static void main(String[] args)
{
new fr();
}}
