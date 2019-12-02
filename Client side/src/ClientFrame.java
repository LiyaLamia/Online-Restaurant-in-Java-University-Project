import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ClientFrame extends JFrame{
	
	private JButton btn;
	private JButton a,b,c,d,e;
	private String menu;
	private int bill=0;
	private JTextField textField;
	
	public ClientFrame(String host)
	{
		super("Client");
		
//		Client client=new Client(host);
		
		setLayout(new GridLayout(2,2));
		
		textField=new JTextField();
		
		Icon ic=new ImageIcon(getClass().getResource("6.png"));
		btn=new JButton(ic);
		a=new JButton(new ImageIcon("1.png"));
		b=new JButton(new ImageIcon("2.png"));
		c=new JButton(new ImageIcon("3.png"));
		d=new JButton(new ImageIcon("4.png"));
		e=new JButton(new ImageIcon("5.png"));
		
		a.setBackground(Color.WHITE);
		b.setBackground(Color.WHITE);
		c.setBackground(Color.WHITE);
		d.setBackground(Color.WHITE);
		e.setBackground(Color.WHITE);
		btn.setBackground(Color.WHITE);
		
		//add(textField);
		
		add(a);
		add(b);
		add(c);
		add(d);
		add(btn);
		add(e);
		
		
		
//		try {
//			menu=InetAddress.getLocalHost().getHostAddress()+" has ordered ";
//		} catch (UnknownHostException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		a.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + "Pizza|";
						bill += 100;
					}
				}
				
				);
		
		b.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
							menu =menu + "Hotdog|";
							bill += 70;						
					}
				}
				
				);
		
		c.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
							menu =menu + "French fry|";
							bill += 60;
					}
				}
				
				);
		
		d.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub						
							menu =menu + "Pasta|";
							bill += 110;
					}
				}
				
				);
		
			
		
		btn.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub						
//						client.runClient(menu);						
//						client.closeConnection();
					}
				}
				
				);
		
		e.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub						
						System.exit(0);
					}
				}				
				);

		
		//displayArea = new JTextArea();
		//add( new JScrollPane( displayArea ), BorderLayout.CENTER );
		setSize( 900, 600 );
		setVisible( true );
	}

}
