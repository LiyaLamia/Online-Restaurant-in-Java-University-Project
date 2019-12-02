import javax.swing.*;


public class TestMenu extends JFrame {
	
	public TestMenu(String loginName)
	{
		setUndecorated(true);
		setLocation(150+160, 75);
		Menu m=new Menu(loginName);
		add(new JScrollPane(m));		
		setSize(740	,592);
		setVisible(true);
	}		
}
