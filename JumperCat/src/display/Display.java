package display;

import javax.swing.JFrame;

public class Display extends JFrame{

	public Display(){
		super("My game");
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300, 200);
		this.setVisible(true);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(new Game());
	}
	
	public static void main(String[] arg) {
		Display display = new Display();
	}
}
