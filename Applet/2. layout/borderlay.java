//Border Layout
import java.awt.*;
import java.applet.*;
import java.util.*;
/*<applet code="borderlay" height=400 width=600>
</applet>
*/
public class borderlay extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());
		setFont(new Font("Arial",0,15));
		add(new Button("Button 1 (NORTH)"), BorderLayout.NORTH);
		add(new Button("Button 2 (CENTER)"), BorderLayout.CENTER);
		add(new Button("Button 3 (WEST)"), BorderLayout.WEST);
		add(new Button("Button 4 (EAST)"), BorderLayout.EAST);
		add(new Button("Button 5 (SOUTH)"), BorderLayout.SOUTH);
	}
	public Insets getInsets()
	{
		return new Insets(10,10,10,10);
	}
}
		
