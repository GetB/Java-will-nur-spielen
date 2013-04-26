package Swing;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstPanel extends JPanel{
	
	public FirstPanel(){
		super();
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		g.fillRect(30, 50, 45, 80);
		
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.add(new FirstPanel());
		f.setVisible(true);
	}

}
