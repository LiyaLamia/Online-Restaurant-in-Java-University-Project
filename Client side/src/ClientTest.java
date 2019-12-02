import javax.swing.JFrame;
import javax.swing.UIManager;


public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception e)
		{
			
		}
		
		ClientFrame app;
		if(args.length==0)
			app=new ClientFrame("127.0.0.1");
		else
			app=new ClientFrame( args[ 0 ] );
		
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//		app.runClient();
	}

}
