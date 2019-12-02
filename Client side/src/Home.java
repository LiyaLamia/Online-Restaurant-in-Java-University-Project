import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Home extends JPanel{
	Image img;
	public Home() {
		super();
		img=new ImageIcon("home1.png").getImage();
	}
	protected void  paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(),getHeight(),this);		
	}
//	public static void main(String[] args) {
//		JFrame f=new JFrame();
//		f.setVisible(true);
//		Home h=new Home();
//		f.add(h);
//		
//	}

}
