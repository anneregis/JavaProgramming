import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="gridbag" width=200 height=200></applet>*/
public class gridbag extends Applet
{
	Button b1, b2, b3, b4, b5, b6;
	GridBagLayout gbl;
	GridBagConstraints gbc;

	public void init()
	{
		gbl = new GridBagLayout();
		setLayout(gbl);
		gbc = new GridBagConstraints();
		b1 = new Button("first button");
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridwidth = 1;
		gbc.weightx = 1.00;
		gbl.setConstraints(b1, gbc);
		add(b1);
		b2 = new Button("second button");
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbl.setConstraints(b2, gbc);
		add(b2);
		b3 = new Button("third button");
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbl.setConstraints(b3, gbc);
		add(b3);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		b4 = new Button("fourth button");
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbl.setConstraints(b4, gbc);
		add(b4);
		b5 = new Button("fifth button");
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbl.setConstraints(b5, gbc);
		add(b5);
		b6 = new Button("sixth button");
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbl.setConstraints(b6, gbc);
		add(b6);
	}
}
