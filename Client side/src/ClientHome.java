

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class ClientHome extends JFrame{
	JPanel panelside,changepanel;
	JButton home,menu,about,order,exit;
	CardLayout card;
	private About aboutpanel ;
	private Menu menupanel;
	private Home homepanel;
	
	TestMenu tmenu;
	About tabout;
	
	
	boolean existMenu=false,existAbout=false;
	 
	public ClientHome(String loginName)
	{
		//setTitle("Client");
		setLayout(null);
		setUndecorated(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		card = new CardLayout() ;
		
		
		setContentPane(new JLabel(new ImageIcon("home.png")));
		
		panelside=new JPanel();
		panelside.setBounds(0,0,160,592);
		panelside.setBackground(new Color(0,0,0,125));	
		
		add(panelside);
		
		panelside.setLayout(null);
		
		home=new JButton("Home");
		home.setBounds(30, 30, 100, 40);
		home.setBackground(new Color(0,0,0,125));
		home.setForeground(Color.WHITE);
		home.setOpaque(true);
		
		menu=new JButton("Menu");
		menu.setBounds(30, 80, 100, 40);
		menu.setBackground(new Color(0,0,0,125));
		menu.setForeground(Color.WHITE);
		
		about=new JButton("About");
		about.setBounds(30, 130, 100, 40);
		about.setBackground(new Color(0,0,0,125));
		about.setForeground(Color.WHITE);
		
		
//		order=new JButton("Order");
//		order.setBounds(30, 180, 100, 40);
//		order.setBackground(new Color(0,0,0,125));
//		order.setForeground(Color.WHITE);
		
		
		exit=new JButton("Exit");
		exit.setBounds(30,180 , 100, 40);
		exit.setBackground(new Color(0,0,0,125));
		exit.setForeground(Color.WHITE);
		
		
		panelside.add(home);
		panelside.add(menu);
		panelside.add(about);
		panelside.add(exit);
		
		
//		changepanel=new JPanel();
//		changepanel.setBounds(160,0,740,592);
//		changepanel.setBackground(new Color(0,0,0,00));		
//		add(changepanel);
		
//		changepanel.setLayout(card);
//		aboutpanel = new About();
//		homepanel = new Home();
		//menupanel=new Menu(loginName);
		
//		changepanel.add(homepanel, "card1");
//		changepanel.add(aboutpanel, "card2");
		//changepanel.add(menupanel,"card3");
		
///////////////////////////////////////////
changepanel=new JPanel();
changepanel.setBounds(160,0,740,592);
changepanel.setBackground(new Color(0,0,0,00));		
add(changepanel);
changepanel.setLayout(null);


Font font=new Font("Verdana",Font.BOLD,14);
JTextArea area;
area=new JTextArea();
area.setBounds(30, 40, 500, 500);
area.setText("This software is developed by\nKazi Fazlee Rabbi.\nEmail:kazifazlerabbi@gmail.com\nand\nLamia Salsabil");
area.setOpaque(false);
area.setEditable(false);
area.setFont(font);
area.setForeground(Color.GRAY);
area.setBackground(new Color(0,0,0,125));
area.setVisible(true);

changepanel.add(area);
changepanel.setVisible(false);
add(changepanel);
/////////////////////////////////////////////
	    
		setLocation(150,75);
		setSize(900,592);
		setVisible(true);
		
		
	    about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//card.show(getContentPane(),"card1");
				if(existMenu)
				{
					tmenu.setVisible(false);
					tmenu.dispose();
				}
				
				//tabout=new About();
				existAbout=true;
				changepanel.setVisible(true);
				
			}
		});
	    home.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//card.show(getContentPane(),"card2");
				if(existAbout)
				{
					//tabout.setVisible(false);
					//tabout.dispose();
					existAbout=false;
					changepanel.setVisible(false);
				}
				else if(existMenu)
				{
					existMenu=false;
					tmenu.setVisible(false);
					tmenu.dispose();
				}
				
			}
		});
	    menu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(existAbout)
				{
					existAbout=false;
					changepanel.setVisible(false);
					//tabout.setVisible(false);
					//tabout.dispose();
				}
				tmenu=new TestMenu(loginName);	
				existMenu=true;
				//card.show(getContentPane(),"card3");
			}
		});
	    exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		});
		
		
		
		
		
		
		
	}
	
//	public static void main(String[] args)
//	{
//		try
//		{
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//			//UIManager.setLookAndFeel();
//		}
//		catch(Exception e)
//		{
//			
//		}
//		ClientHome app=new ClientHome();
//		
//	}

}
