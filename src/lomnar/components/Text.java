package lomnar.components;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class Text extends JFrame {
	
	private static JTextPane textPane = new JTextPane();
	private JScrollPane scroll;
	private static Text text;
	
	public Text() {
		super("Готовый текст");
		text = this;
		setSize(new Dimension(500, 500));
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setLayout(new BorderLayout());
		
		getContentPane().add(textPane, BorderLayout.NORTH);
		scroll = new JScrollPane(textPane);
		getContentPane().add(scroll, BorderLayout.CENTER);
		
	}
	
	public static void clear() {
		textPane.setText(null);
	}
	
	public static void open() {
		text.setVisible(true);
	}
	
	public static void setText(String text) {
		textPane.setText(getText() + "\n - '" + text + "'");
	}
	
	public static String getText() {
		return textPane.getText();
	}

}
