package lomnar.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import lomnar.main.Utils;


public class Frame extends JFrame implements ActionListener {
	
	private JPanel panel = new JPanel();
	private List<CBlock> blocks = new ArrayList<CBlock>();
	private Button colors = new Button("Палитра");
	private Button clear = new Button("Сбросить");
	private Button create = new Button("Создать");
	private Button fuel = new Button("Залить");
	
	public Frame() {
		super("PicturesCreator by LomNar");
		setSize(new Dimension(450, 400));
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setResizable(false);
		initComponents();
		listeners();
	}

	private void listeners() {
		colors.addActionListener(this);
		clear.addActionListener(this);
		create.addActionListener(this);
		fuel.addActionListener(this);
		
	}

	private void initComponents() {
		this.getContentPane().add(panel);	
		
		panel.setLayout(null);
		int height = 0;
		for (int i = 0; i < 16; i++) {
			int width = 0;
			for (int j = 0; j < 16; j++) {
        		blocks.add(new CBlock());
				panel.add(blocks.get(j + (i * 16)));
				blocks.get(j + (i * 16)).setBounds(width, height, 20, 20);
				width += 20;
			}
			height += 20;
		}
		
		panel.add(colors);
		panel.add(clear);
		panel.add(create);
		panel.add(fuel);
		
		colors.setBounds(340, 20, 90, 30);
		fuel.setBounds(340, 65, 90, 30);
		clear.setBounds(340, 110, 90, 30);
		create.setBounds(340, 155, 90, 30);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == colors) {
			ColorChoser.open();
		}
		else if (e.getSource() == fuel) {
			for (int i = 0; i < blocks.size(); i++) {
				blocks.get(i).setBackground(ColorChoser.getColor());
			}
		}
		else if (e.getSource() == clear) {
			for (int i = 0; i < blocks.size(); i++) {
				blocks.get(i).setBackground(Color.WHITE);
			}
			Text.clear();
			
		}
		else if (e.getSource() == create) {
			StringBuilder line = new StringBuilder();
			int height = 0;
			for (int i = 0; i < 16; i++) {
				int width = 0;
				for (int j = 0; j < 16; j++) {
	        		line.append(Utils.encode(blocks.get(j + (i * 16)).getBackground()));
					width += 20;
				}
				Text.setText(line.toString());
				line.delete(0, line.length());
				height += 20;
			}
			Text.open();
			
		}
		
	}
	
	

}
