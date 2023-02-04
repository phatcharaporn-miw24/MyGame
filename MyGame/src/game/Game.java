package game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.util.Arrays;

import javax.swing.JPanel;

import character.Cat;
import character.Wave;
import event.Event;



public class Game extends JPanel implements KeyListener{
		
		int gameSpeed = 30;
		long lastPress = 0;
		Cat cat = new Cat(50,300,50,100);
		Wave wave = new Wave(800,300,30,40,30,this);
		Wave[] waveSet = makeWaveset(4);
		
		public Game() {
			this.setBounds(0, 0, 1000, 600);
			this.addKeyListener(this);
			this.setFocusable(true);
			this.setLayout(null);
			
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Graphics2D g2 = (Graphics2D)g;
			g2.setColor(Color.RED);
			g2.drawRect(cat.x, cat.y, cat.catSize, cat.catSize);
			g2.drawString("HP-->"+cat.health+"%", 40, 40);
			g2.setColor(Color.black);
			for(Wave wave : waveSet) {
				g2.drawRect(wave.x, wave.y, wave.width, wave.height);
				if(Event.checkHit(cat, wave)) {
					g2.setStroke(new BasicStroke(10.0f));
					g2.setColor(Color.RED);
					g2.drawRect(0, 0, 1000, 900);
					cat.health -= 1;
				}
			}
		}
		private Wave[]makeWaveset(int waveNumber){
			Wave[] waveSet = new Wave[waveNumber];
			for(int i=0;i<waveNumber;i++) {
				double waveLocation = 1000+Math.floor(Math.random()*1000);
				waveSet[i] = new Wave((int)waveLocation,300,30,40,30,this);
			}
			return waveSet;
			
		}

		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void keyPressed(KeyEvent e) {
			if(System.currentTimeMillis()-lastPress>600) {
				if(e.getKeyCode()==38||e.getKeyCode()==32) {
					cat.jump(this);
					this.repaint();
				}
				lastPress = System.currentTimeMillis();
			}
		}

		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
}
