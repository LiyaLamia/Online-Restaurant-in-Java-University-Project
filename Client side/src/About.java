import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class About extends JPanel{
	Image img;
	
	public About()
	{
		super();
		//setOpaque(false);
		
		img=new ImageIcon("home1.png").getImage();
		setLayout(null);
		
		Font font=new Font("Verdana",Font.BOLD,14);
		JTextArea area;
		area=new JTextArea();
		area.setBounds(30, 40, 500, 500);
		area.setText("This software is developed by\nKazi Fazlee Rabbi.\nEmail:kazifazlerabbi@gmail.com\nand\nLamia Salsabil");
		area.setOpaque(false);
		area.setEditable(false);
		area.setFont(font);
		area.setForeground(Color.GRAY);
		
		
		add(area);
	}
	
	protected void  paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(),getHeight(),this);		
	}
	
	public static void main(String [] args) {
		
		About app=new About();
		JFrame frame =new JFrame();
		//frame.setUndecorated(true);
		//frame.setContentPane(new JLabel(new ImageIcon("home1.png")));
		frame.add(app);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		
	}

}
