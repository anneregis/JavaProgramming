import java.io.*;
class bank
{
static double bal=10000;
void deposit(double d)
{
bal=bal+d;
System.out.println(d +"\t\t\t\t\t\t"+ bal);
}
void withdraw(double w)
{
bal=bal-w;
System.out.println("\t"+"\t\t"+ w +"\t\t\t"+bal);
}
}
class depositing extends Thread
{
public void  run()
{
double l=1000;
bank d =new bank();
for(int i=1;i<10;i++)
{
d.deposit(l);
l=l+100;
}
}
}
class withdrawal extends Thread
{
public void run()
{
double l=100;
bank b=new bank();
for(int i=1;i<10;i++)
{
b.withdraw(l);
l=l+100;
}
}
}
class balanc
{
public static  void main(String args[])
{
depositing d=new depositing();
withdrawal w=new withdrawal();
System.out.println("\t\t\tPASS  BOOK");
System.out.println("\n  ");
System.out.println("DEPOSIT(Rs)\t\tWITHDRAWAL(Rs)\t\t BALANCE(Rs) ");
System.out.println("=======     \t\t===========   \t\t========    ");
System.out.print(10000.0);
System.out.println("\t\t\t\t\t\t 10000.0");
d.start();
w.start();
}
}
