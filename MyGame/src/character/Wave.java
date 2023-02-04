package character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Wave {
	
	public int x;
	public int y;
	public int width;
	public int height;
	public int speed;
	private int xStart;
	
	public Wave(int x,int y,int w,int h,int speed,JPanel game) {
		this.x=x;
		this.xStart=x;
		this.y=y;
		this.width=w;
		this.height=h;
		this.speed=speed;
		move(game);
	}
	public void move( final JPanel game) {
		Timer timer = new Timer(50, new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				x -= speed;
				game.repaint();
					if(x<0) {
						x=xStart;
					}
				
			}
		});
		timer.start();
		
	}
	
}

