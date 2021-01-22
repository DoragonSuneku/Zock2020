import javax.swing.*;

public class FirstPanel extends JPanel {

	@Override public void paintComponent(java.awt.Graphics g) {
		g.fillRect(30, 50, 45, 80);
		g.fillOval(70, 100, 45, 80);
		g.fillArc(80, 100, 60, 80, 30, 30);
		g.fillRoundRect(150, 100, 30, 30, 40, 20);
	}
	
	
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.add(new FirstPanel());
		f.setVisible(true);
	}

}
