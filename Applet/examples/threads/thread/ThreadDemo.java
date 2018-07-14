import java.lang.*;


public class ThreadDemo
{

    public static void main (String[] arg)
    {

        nine nineThread;
	thirteen thirteenThread;
	seven sevenThread;

        nineThread = new nine ();
	thirteenThread =new thirteen();
	sevenThread =new seven();

          nineThread.start ();;
	 thirteenThread.start ();;
	 sevenThread.start ();;

    }
}
