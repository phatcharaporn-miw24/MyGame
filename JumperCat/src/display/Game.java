package display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Game extends JPanel{
	public Game() {
		this.setBounds(0,0,1000,600);
		this.setFocusable(true);
		this.setLayout(null);
		
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.RED);
		g2.drawRect(50, 50, 50, 50);
	}
	

}
