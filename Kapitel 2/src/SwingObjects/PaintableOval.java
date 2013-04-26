package SwingObjects;

import java.awt.Graphics;

import geometricalObjects.SimpleOval;

public class PaintableOval extends SimpleOval implements Paintable{

	public PaintableOval(double x, double y, double w, double h) {
		super(x, y, w, h);
	}

	@Override
	public void paintTo(Graphics g) {
		
		g.fillOval((int)this.getPos().getX(), (int)this.getPos().getY(), (int)this.getWidth(), (int)this.getHeight());
		
	}

}
