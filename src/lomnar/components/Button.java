package lomnar.components;

import javax.swing.JButton;

public class Button extends JButton {
	
	public Button (String name) {
		super(name);
		setFocusable(false);
		setOpaque(true);
	}
	
	public Button () {
		setFocusable(false);
		setOpaque(true);
	}

}
