//Flow Layout
import java.awt.*;	
import java.applet.*;
import java.awt.event.*;
/*<applet code="flowlay" height=200 width=300>
</applet>
*/
public class flowlay extends Applet implements ItemListener
{
	Checkbox win98,winxp,mac,linux;
	String msg=""; 
	public void init()
	{
		setBackground(Color.pink);
		setFont(new Font("TimesNewRoman",Font.BOLD,16));
		//set Left aligned Flow Layout 
		setLayout(new FlowLayout(FlowLayout.LEFT));
		win98=new Checkbox("Windows 98",null,true);
		winxp=new Checkbox("Windows XP");
		mac=new Checkbox("Mac OS");
		linux=new Checkbox("Linux");
		add(win98);
		add(winxp);
		add(mac);
		add(linux); 		
		//Register to receive item events 	
		win98.addItemListener(this);
		winxp.addItemListener(this);
		mac.addItemListener(this);
		linux.addItemListener(this);
	}
	//Repaint when status of checkbox changes 
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	//Display current status of the check boxes 
	public void paint(Graphics g)
	{
		msg="Current State: ";
		g.drawString(msg,6,80);
		msg="Windows 98: " + win98.getState();
		g.drawString(msg,11,100);
		msg="Windows XP: " + winxp.getState();
		g.drawString(msg,11,120);
		msg="Mac OS: " + mac.getState();
		g.drawString(msg,11,140);
		msg="Linux: " + linux.getState();
		g.drawString(msg,11,160);
	}
}



