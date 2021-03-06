package geometricalObjects;

public class SimpleOval extends GeometricObject{
	
	public SimpleOval(Vertex pos, double w, double h){
		super(pos,w,h);
	}
	
	public SimpleOval(double x, double y, double w, double h){
		super(new Vertex(x,y),w,h);
	}
	
	@Override
	public double area(){
		return Math.PI * this.getWidth() * this.getHeight() / 4;
	}
	
	@Override
	public String toString(){
		return "SimpleOval (" + super.toString() + ")";
	}
	
	@Override
	public boolean equals(Object that){
		return (that instanceof SimpleOval) && super.equals(that);
	}

}
