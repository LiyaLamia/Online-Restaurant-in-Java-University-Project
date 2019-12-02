import javax.swing.JFrame;
import javax.swing.UIManager;


public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception e)
		{
			
		}
		Server app=new Server();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.runServer();

	}

}
