import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Client {
	private JTextField textField;
	private JTextArea displayArea;
	
	private String message="";
		
		
	private ObjectInputStream input;
	private ObjectOutputStream output;
	private Socket client;
	private String chatServer;
	
	public Client(String host,String msg)
	{	
		chatServer=host;	
		//System.out.println("Testing");
		runClient(msg);
		closeConnection();
	}
	
	public void runClient(String msg)
	{
		try
		{
			connectToServer();
			getStreams();
			//processConnection();
			sendData(msg);
		}
		catch(EOFException eofException)
		{
			System.out.println( "\nClient terminated connection" );
		}
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
		finally
		{
			closeConnection();
		}
	}
	
	

	public void closeConnection()
	{				
		try
		{
			output.close();
			input.close();
			client.close();
		}
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
	}
	private void sendData( String message )
	{
		try
		{
			output.writeObject( message);
			output.flush();
		}
		catch ( IOException ioException )
		{
			System.out.println("\nError writing object" );
		}
	}

	private void connectToServer() throws IOException
	{	
		client =new Socket (InetAddress.getByName(chatServer),12345);
			
	}

//	private void displayMessage(final String messageToDisplay) {
//		// TODO Auto-generated method stub
//		SwingUtilities.invokeLater(
//				new Runnable()
//				{
//					public void run()
//					{
//						displayArea.append(messageToDisplay);
//					}
//				}
//			);
//	}
	
	private void getStreams() throws IOException
	{
		output = new ObjectOutputStream( client.getOutputStream() );
		output.flush();
		
		//input = new ObjectInputStream( client.getInputStream() );	
	}
	
//	private void processConnection() throws IOException
//	{
//		try
//		{
//			message = ( String ) input.readObject();
//		}catch(ClassNotFoundException classNotFoundException)
//		{
//			System.out.println("\nUnknown object type received" );
//		}		
//	}
	
}
