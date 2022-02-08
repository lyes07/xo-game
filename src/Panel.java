import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Panel extends JPanel implements MouseListener{
	private static final long serialVersionUID = 1L;
	private JButton[] button = new JButton[9];
	Random random = new Random();
	private char[] positions = new char[9];
	private char turn;
	private int moves=0;
	public Panel() {
		for(int i=0; i<9; i++)
			positions[i] = ' ';
		this.setBackground(new Color(0xffffff));
		this.setSize(new Dimension(600,600));
		this.setOpaque(true);
		this.setLayout(new GridLayout(3,3,10,10));
		for(int i=0; i<9; i++) {
			button[i] = new JButton(""+(i+1));
			button[i].setFont(new Font("MV Boli",Font.PLAIN,120));
			button[i].setFocusable(false);
			button[i].setBackground(new Color(0x202020));
			button[i].setBorder(null);
			button[i].addMouseListener(this);
			this.add(button[i]);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		try {
		JButton button =(JButton) e.getSource();
		char temp = button.getText().charAt(0);
		int index = Integer.valueOf(button.getText());
		if(temp!='X' && temp!='O') {
			if(moves==0) {
				turn =(random.nextInt()%2==0  ? 'X' : 'O');
			}else {
				turn = turn=='X' ? 'O':'X';
			}
			button.setText(""+turn);
			positions[index-1] = turn;
			moves++;
		}
		}catch(Exception ex) {
		}
		if(moves>4) {
			check();
		}
	}
	private void check() {
		if(positions[0]!=' ' && positions[0]==positions[1] && positions[0]==positions[2]) {
			button[0].setBackground(Color.green);button[1].setBackground(Color.green);button[2].setBackground(Color.green);
			JOptionPane.showMessageDialog(this, ""+button[0].getText()+" Won","-Lyes G-                 Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		if(positions[3]!=' ' && positions[3]==positions[4] && positions[3]==positions[5]) {
			button[3].setBackground(Color.green);button[4].setBackground(Color.green);button[5].setBackground(Color.green);
			JOptionPane.showMessageDialog(this, ""+button[3].getText()+" Won","-Lyes G-                 Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		if(positions[6]!=' ' && positions[6]==positions[7] && positions[6]==positions[8]) {
			button[6].setBackground(Color.green);button[7].setBackground(Color.green);button[8].setBackground(Color.green);
			JOptionPane.showMessageDialog(this, ""+button[6].getText()+" Won","-Lyes G-                 Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		if(positions[0]!=' ' && positions[0]==positions[4] && positions[0]==positions[8]) {
			button[0].setBackground(Color.green);button[4].setBackground(Color.green);button[8].setBackground(Color.green);
			JOptionPane.showMessageDialog(this, ""+button[0].getText()+" Won","-Lyes G-                 Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		if(positions[2]!=' ' && positions[2]==positions[4] && positions[2]==positions[6]) {
			button[2].setBackground(Color.green);button[4].setBackground(Color.green);button[6].setBackground(Color.green);
			JOptionPane.showMessageDialog(this, ""+button[2].getText()+" Won","-Lyes G-                 Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		if(positions[0]!=' ' && positions[0]==positions[3] && positions[0]==positions[6]) {
			button[0].setBackground(Color.green);button[3].setBackground(Color.green);button[6].setBackground(Color.green);
			JOptionPane.showMessageDialog(this, ""+button[0].getText()+" Won","-Lyes G-                 Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		if(positions[1]!=' ' && positions[1]==positions[4] && positions[1]==positions[7]) {
			button[1].setBackground(Color.green);button[4].setBackground(Color.green);button[7].setBackground(Color.green);
			JOptionPane.showMessageDialog(this, ""+button[1].getText()+" Won","-Lyes G-                 Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		if(positions[2]!=' ' && positions[2]==positions[5] && positions[2]==positions[8]) {
			button[2].setBackground(Color.green);button[5].setBackground(Color.green);button[8].setBackground(Color.green);
			JOptionPane.showMessageDialog(this, ""+button[2].getText()+" Won","-Lyes G-                 Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		if(moves==9) {
			JOptionPane.showMessageDialog(this,"Drow","-Lyes G-                 Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

	}
	public char getTurn() {
		return this.turn;
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}

}
