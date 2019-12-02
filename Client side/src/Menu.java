import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Menu extends JPanel{
	JButton btn;
	private JButton [] b;
	private String menu;
	private int bill=0;
	private int [] price;
	private JTextField textField;
	String [] imageName;
	Image img;
	int i=0;
	boolean disable=false;
	
	public Menu(String loginName)
	{		
		setLayout(new GridLayout(4,5));
		
		//img=new ImageIcon("chef.png").getImage();
		//setBackground(new Color(0,0,0,200));	
		
		price =new int[20];
		Random rand=new Random();
		for(int i=0;i<20;i++)
		{
			price[i]=rand.nextInt((500-200)+1)+200;//max=500 min=200 generate number from 200 to 500
		}
		b = new JButton[20] ;		
		
		imageName=new String[20];
		
		for(int i=0;i<20;i++)
		{
			imageName[i]=String.valueOf(i+1)+".png";
		}		
		for(int i=0;i<20;i++)
		{
			b[i]=new JButton(new ImageIcon(getClass().getResource(imageName[i])));
			b[i].setBackground(new Color(0,0,0,125));
			b[i].setOpaque(true);
			add(b[i]);
			b[i].setContentAreaFilled(true);			
			b[i].setBorder(null);
		}		
		
		menu=loginName;
		//System.out.println(loginName);
//		for( i=0;i<19;i++)
//		{
//			//System.out.println(i);
//			b[i].addActionListener(
//					new ActionListener() {						
//						@Override
//						public void actionPerformed(ActionEvent e) {
//							// TODO Auto-generated method stub
//							menu =menu + Integer.toString(i+1)+" ";
//							System.out.println(menu);
//							bill =bill+ price[i];
//						}
//					}					
//					);
//		}
		b[0].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(0)+" ";
						System.out.println(menu);
						bill =bill+ price[0];
					}
				}					
				);
		
		b[1].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(1+1)+" ";
						System.out.println(menu);
						bill =bill+ price[1];
					}
				}					
				);
		
		b[2].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(2+1)+" ";
						System.out.println(menu);
						bill =bill+ price[2];
					}
				}					
				);
		
		b[3].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(3+1)+" ";
						System.out.println(menu);
						bill =bill+ price[3];
					}
				}					
				);
		
		b[4].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(4+1)+" ";
						System.out.println(menu);
						bill =bill+ price[4];
					}
				}					
				);
		
		b[5].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(5+1)+" ";
						System.out.println(menu);
						bill =bill+ price[5];
					}
				}					
				);
		
		b[6].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(6+1)+" ";
						System.out.println(menu);
						bill =bill+ price[6];
					}
				}					
				);
		
		b[7].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(7+1)+" ";
						System.out.println(menu);
						bill =bill+ price[7];
					}
				}					
				);
		
		b[8].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(8+1)+" ";
						System.out.println(menu);
						bill =bill+ price[8];
					}
				}					
				);
		
		b[9].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(9+1)+" ";
						System.out.println(menu);
						bill =bill+ price[9];
					}
				}					
				);
		
		b[10].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(10+1)+" ";
						System.out.println(menu);
						bill =bill+ price[10];
					}
				}					
				);
		
		b[11].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(11+1)+" ";
						System.out.println(menu);
						bill =bill+ price[11];
					}
				}					
				);
		
		b[12].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(12+1)+" ";
						System.out.println(menu);
						bill =bill+ price[12];
					}
				}					
				);
		b[13].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(13+1)+" ";
						System.out.println(menu);
						bill =bill+ price[13];
					}
				}					
				);
		b[14].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(14+1)+" ";
						System.out.println(menu);
						bill =bill+ price[14];
					}
				}					
				);
		b[15].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(15+1)+" ";
						System.out.println(menu);
						bill =bill+ price[15];
					}
				}					
				);
		b[16].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(16+1)+" ";
						System.out.println(menu);
						bill =bill+ price[16];
					}
				}					
				);
		b[17].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(17+1)+" ";
						System.out.println(menu);
						bill =bill+ price[17];
					}
				}					
				);
		b[18].addActionListener(
				new ActionListener() {						
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						menu =menu + Integer.toString(18+1)+" ";
						System.out.println(menu);
						bill =bill+ price[18];
					}
				}					
				);
		
		
		b[19].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//disable= true;		
				//setVisible(false);
				Client app;
				app=new Client("127.0.0.1",menu);	
				
				//app=new Client("192.168.43.205",menu);
				
			}
		});			
	}
	
//	boolean doDisable(boolean i)
//	{
//		return i;
//	}
	protected void  paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(),getHeight(),this);		
	}

}
