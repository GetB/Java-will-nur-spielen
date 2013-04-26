package SwingObjects;

import java.awt.Graphics;

public class PaintablePanel extends SizedPanel {
	
	private Paintable pa;
	
	public PaintablePanel (Paintable pa){
		this.pa = pa;
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		pa.paintTo(g);
		
	}
	
	public static void main(String[] args) {
		ShowInFrame.show(new PaintablePanel(new PaintableOval(100,50,30,50)));
		ShowInFrame.show(new PaintablePanel(new PaintableOval(10,10,130,40)));		
	}

}
