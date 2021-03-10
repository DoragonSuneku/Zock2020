import java.awt.event.*;

import javax.swing.JLabel;

public class CountButtonListener extends SimpleButton implements ActionListener {
	JLabel l;
	int a = 0;

	CountButtonListener(JLabel l, int a) {this.l=l; this.a=a;}

	public void actionPerformed(ActionEvent e) {
		if(a==0) {counter=counter+1;}
		if(a==1) {counter=counter-1;}
		if(a==2) {counter = 0;}
		l.setText(""+counter);
		// TODO Auto-generated method stub

	}

}
