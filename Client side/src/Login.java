import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class Login extends JFrame{
	
	JPanel panel;
	JTextField tf;
	String loginName;
	JButton bt;
	public  Login() {
		setLayout(null);
		Font font=new Font("Verdana",Font.PLAIN,16);
		
		panel=new JPanel();
		panel.setBackground(new Color(0,0,0,125));
		panel.setLayout(null);
		panel.setBounds(340, 340, 160, 110);
		
		tf=new JTextField(8);
		tf.setBounds(25, 20, 100, 30);
		//tf.setOpaque(true);
		tf.setFont(font);
		tf.setBackground(new Color(0,0,0,125));
		tf.setForeground(Color.WHITE);
		
		bt=new JButton("Login");
		bt.setBounds(25,65, 100, 30);
		bt.setContentAreaFilled(false);		
		bt.setForeground(Color.WHITE);
		bt.setFont(font);
				
		
		setContentPane(new JLabel(new ImageIcon(getClass().getResource("home.png"))));
		
		panel.add(tf);
		panel.add(bt);
		
		
		
		add(panel);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(150,75);
		setSize(900,592);
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
//				if(!tf.getText().equals(null))
//				{
					loginName=tf.getText()+">>";
					//System.out.println(loginName);
					setVisible(false);
					dispose();
					ClientHome cHome=new ClientHome(loginName);
//				}
				
				
			}
		});
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				loginName=e.getActionCommand()+">>";
				//System.out.println(loginName);
				setVisible(false);
				dispose();
				ClientHome cHome=new ClientHome(loginName);
			}
		});
	}
	
	public static void main(String [] args) {
	try
	{
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	}
	catch(Exception e)
	{
		
	}		
		Login app=new Login();
		//JFrame frame =new JFrame();
		//frame.setUndecorated(true);
		//frame.setContentPane(new JLabel(new ImageIcon("home1.png")));
		//frame.add(app);		
	}

}
