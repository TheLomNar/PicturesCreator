package lomnar.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChoser extends JFrame implements ActionListener {
	
	private static ColorChoser choser;
	private static Color color = new Color(0, 0, 0);
	private JPanel panel = new JPanel();
	private Button black = new Button();
	private Button DarkBlue = new Button();
	private Button DarkGreen = new Button();
	private Button DarkAqua = new Button();
	private Button DarkRed = new Button();
	private Button Purple = new Button();
	private Button Gold = new Button();
	private Button Gray = new Button();
	private Button DarkGray = new Button();
	private Button Indigo = new Button();
	private Button BrightGreen = new Button();
	private Button Aqua = new Button();
	private Button Red = new Button();
	private Button Pink = new Button();
	private Button Yellow = new Button();
	private Button White = new Button();
	
	public ColorChoser() {
		super("Палитра");
		choser = this;
		setSize(new Dimension(166, 188));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		
		this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);;
		panel.add(black);
		panel.add(DarkBlue);
		panel.add(DarkGreen);
		panel.add(DarkAqua);
		panel.add(DarkRed);
		panel.add(Purple);
		panel.add(Gold);
		panel.add(Gray);
		panel.add(DarkGray);
		panel.add(Indigo);
		panel.add(BrightGreen);
		panel.add(Aqua);
		panel.add(Red);
		panel.add(Pink);
		panel.add(Yellow);
		panel.add(White);
		
		black.setBackground(new Color(0, 0, 0));
		DarkBlue.setBackground(new Color(0, 0, 170));
		DarkGreen.setBackground(new Color(0, 170, 0));
		DarkAqua.setBackground(new Color(0, 170, 170));
		DarkRed.setBackground(new Color(170, 0, 0));
		Purple.setBackground(new Color(170, 0, 170));
		Gold.setBackground(new Color(255, 170, 0));
		Gray.setBackground(new Color(170, 170, 170));
		DarkGray.setBackground(new Color(85, 85, 85));
		Indigo.setBackground(new Color(85, 85, 255));
		BrightGreen.setBackground(new Color(85, 255, 85));
		Aqua.setBackground(new Color(85, 255, 255));
		Red.setBackground(new Color(255, 85, 85));
		Pink.setBackground(new Color(255, 85, 255));
		Yellow.setBackground(new Color(255, 255, 85));
		White.setBackground(new Color(255, 255, 255));
		
		black.setBounds(0, 0, 40, 40);
		DarkBlue.setBounds(40, 0, 40, 40);
		DarkGreen.setBounds(80, 0, 40, 40);
		DarkAqua.setBounds(120, 0, 40, 40);
		DarkRed.setBounds(0, 40, 40, 40);
		Purple.setBounds(40, 40, 40, 40);
		Gold.setBounds(80, 40, 40, 40);
		Gray.setBounds(120, 40, 40, 40);
		DarkGray.setBounds(0, 80, 40, 40);
		Indigo.setBounds(40, 80, 40, 40);
		BrightGreen.setBounds(80, 80, 40, 40);
		Aqua.setBounds(120, 80, 40, 40);
		Red.setBounds(0, 120, 40, 40);
		Pink.setBounds(40, 120, 40, 40);
		Yellow.setBounds(80, 120, 40, 40);
		White.setBounds(120, 120, 40, 40);
		
		black.addActionListener(this);
		DarkBlue.addActionListener(this);
		DarkGreen.addActionListener(this);
		DarkAqua.addActionListener(this);
		DarkRed.addActionListener(this);
		Purple.addActionListener(this);
		Gold.addActionListener(this);
		Gray.addActionListener(this);
		DarkGray.addActionListener(this);
		Indigo.addActionListener(this);
		BrightGreen.addActionListener(this);
		Aqua.addActionListener(this);
		Red.addActionListener(this);
		Pink.addActionListener(this);
		Yellow.addActionListener(this);
		White.addActionListener(this);
		
	}
	
	
	public static void open() {
		choser.setVisible(true);
	}
	
	public static Color getColor() {
		return color;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == black) {
			color = new Color(0, 0, 0);
		} 
		else if (e.getSource() == DarkBlue) {
			color = new Color(0, 0, 170);
		}
		else if (e.getSource() == DarkGreen) {
			color = new Color(0, 170, 0);
		}
		else if (e.getSource() == DarkAqua) {
			color = new Color(0, 170, 170);
		}
		else if (e.getSource() == DarkRed) {
			color = new Color(170, 0, 0);
		}
		else if (e.getSource() == Purple) {
			color = new Color(170, 0, 170);
		}
		else if (e.getSource() == Gold) {
			color = new Color(255, 170, 0);
		}
		else if (e.getSource() == Gray) {
			color = new Color(170, 170, 170);
		}
		else if (e.getSource() == DarkGray) {
			color = new Color(85, 85, 85);
		}
		else if (e.getSource() == Indigo) {
			color = new Color(85, 85, 255);
		}
		else if (e.getSource() == BrightGreen) {
			color = new Color(85, 255, 85);
		}
		else if (e.getSource() == Aqua) {
			color = new Color(85, 255, 255);
		}
		else if (e.getSource() == Red) {
			color = new Color(255, 85, 85);
		}
		else if (e.getSource() == Pink) {
			color = new Color(255, 85, 255);
		}
		else if (e.getSource() == Yellow) {
			color = new Color(255, 255, 85);
		}
		else if (e.getSource() == White) {
			color = new Color(255, 255, 255);
		}
		
	}
	
}
