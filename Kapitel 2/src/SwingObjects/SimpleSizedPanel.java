package SwingObjects;

import java.awt.Graphics;

public class SimpleSizedPanel extends SizedPanel {
	
	@Override
	public void paintComponent(Graphics g){
		
		g.fillRect(30, 50, 45, 80);
		
	}
	
	public static void main(String[] args) {
		ShowInFrame.show(new SimpleSizedPanel());
	}

}
