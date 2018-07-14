import java.awt.* ;
import java.applet.*;


public class Lines extends Applet {
    public void paint(Graphics g ){
         g.drawLine( 0 , 0 , 100 , 100 ) ;
         g.drawLine( 0 ,100  , 100 , 0 ) ;
         g.drawLine(  40 , 25  , 250  , 180 ) ;
   }
}
