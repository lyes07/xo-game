import javax.swing.*;
import java.awt.*;



public class Frame extends JFrame{
	private static final long serialVersionUID = 1L;
	private Panel panel;
	private ImageIcon icon;
//	private JPanel turns;
	public Frame() {
		panel = new Panel();
		icon = new ImageIcon("xoLogo.png");
//		turns = new JPanel();
//		this.setLayout(null);
		this.setTitle("XO Game");
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(600,600));
//		turns.setBounds(0, 0, 600, 80);
//		panel.setBounds(0, 80, 600, 600);
//		this.add(turns);
		this.add(panel);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
