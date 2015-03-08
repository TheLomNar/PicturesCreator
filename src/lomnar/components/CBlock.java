package lomnar.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CBlock extends JButton implements ActionListener {
	
	public CBlock() {
		this.setFocusable(false);
		this.setBackground(Color.WHITE);
		this.setOpaque(true);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.setBackground(ColorChoser.getColor());
		
	}

}
