import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Server extends JFrame{
	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	private int counter=1;
	private JButton btn;
	public Server()
	{
		super("Server");
		
		enterField=new JTextField();
		enterField.setEditable(false);
		enterField.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent event) {
						// TODO Auto-generated method stub
						sendData(event.getActionCommand());
						enterField.setText("");
					}
				}
				
				);
		//add(enterField,BorderLayout.NORTH);
		
		
		
		displayArea=new JTextArea();
		displayArea.setEditable(false);
		add(new JScrollPane(displayArea),BorderLayout.CENTER);
		
		setSize(600,800);
		setVisible(true);
		
	}
	
	public void runServer()
	{
		try
		{
			server =new ServerSocket(12345,100);
			
			setTitle("Server ip: "+InetAddress.getLocalHost().getHostAddress());
			while(true)
			{
				try
				{
					waitForConnection();
					getStream();
					processConnection();
				}
				catch(EOFException eofException)
				{
					displayMessage("\nServer terminated connection");
				}
				finally
				{
					closeConnection();
					++counter;
				}
			}
		}
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
	}

	private void waitForConnection() throws IOException
	{
		displayMessage( "Waiting for connection\n" );

		connection=server.accept();
		displayMessage("Connection "+counter+"received from: "+connection.getInetAddress().getHostName());
	}
	
	private void getStream()throws IOException
	{
		output=new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		
		input=new ObjectInputStream(connection.getInputStream());
		
		displayMessage("\nGot I/O streams\n");
	}
	
	private void processConnection() throws IOException
	{
		String message="Connection Successfull";
		sendData(message);
		
		setTextFieldEditable(true);
		
		do
		{
			try
			{
				message=(String	)input.readObject();
//				if(message.equals("CLIENT>>> Order pizza") )
//					System.out.println("ordering");
				displayMessage( "\n" + message );
				JOptionPane.showMessageDialog(null, message);
			}
			catch ( ClassNotFoundException classNotFoundException )
			{
				displayMessage( "\nUnknown object type received" );
			}
		}while ( !message.equals( "CLIENT>>> TERMINATE" ) );
	}
	
	private void closeConnection()
	{
		displayMessage( "\nTerminating connection\n" );
		setTextFieldEditable( false );
		
		try
		{
			output.close();
			input.close();
			connection.close();
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
			output.writeObject("SERVER>>> " + message);
			output.flush();
			displayMessage( "\nSERVER>>> " + message );
		}
		catch ( IOException ioException )
		{
			displayArea.append( "\nError writing object" );
		}
	}
	private void displayMessage(final String messageToDisplay)
	{
		SwingUtilities.invokeLater(
				new Runnable()
				{
					public void run()
					{
						if(messageToDisplay == "CLIENT>>> order")
							System.out.println("ordering");
						displayArea.append(messageToDisplay );
					}
				}
				
				);
	}
	
	private void setTextFieldEditable(final boolean editable) {
		SwingUtilities.invokeLater(
				new Runnable()
				{
					public void run()
					{
						enterField.setEditable(editable);
					}
				}
				
				);
	}
}
