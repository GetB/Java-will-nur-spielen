package geometricalObjects;

public class GeometricObject {
	
	//Variabeln zum speichern der linken oberen Ecke, Höhe und Breite
	private Vertex pos;
	private double width;
	private double height;
	
	public GeometricObject(Vertex pos, double width, double height) {
		this.pos = pos;
		this.width = width;
		this.height = height;
		this.eleminateNegation();
	}
	
	public GeometricObject(double width, double height) {
		this(new Vertex(0,0),width, height);
	}
	
	public GeometricObject(double w) {
		this(w,w);
	}
	
	public GeometricObject() {
		this(10);
	}
	public GeometricObject(Vertex pos) {
		this(pos,0,0);
	}
	
	//Berechnet den Umfang des Objects
	public double circumference(){
		return 2 * (this.getWidth() + this.getHeight());
	}
	
	//Berechnet die Fläche des Objects
	public double area(){
		return this.getHeight() * this.getWidth();
	}
	
	//Überprüft ob ein Punkt innerhalb des Objects liegt
	public boolean contains(Vertex v){
		return v.getX() >= this.pos.getX() && v.getX() <= this.pos.getX() + this.width && 
				v.getY() >= this.pos.getY() && v.getY() <= this.pos.getY() + this.height;
	}
	
	//Überprüft ob das Object einen größeren Flächeninhalt hat als das übergebene Object
	public boolean isLargerThan (GeometricObject that){
		return this.area() > that.area();
	}
	
	public boolean equals(Object thatObject){
		if (thatObject instanceof GeometricObject) {
			GeometricObject that = (GeometricObject) thatObject;
			return that.getWidth() == this.getWidth() && 
					that.getHeight() ==this.getHeight() && 
					that.getPos().equals(that.getPos());
		}
		return false;
	}
	
	//Wenn sich zwei Objecte berühren muss einer der Eckpunkte im jeweils anderen Object liegen
	public boolean touch(GeometricObject geo){
		if(geo.contains(this.getPos()) || this.contains(geo.getPos()) || 
				geo.contains(new Vertex(this.getPos().getX(), this.getPos().getY() + this.getHeight())) || this.contains(new Vertex(geo.getPos().getX(), geo.getPos().getY() + geo.getHeight())) || 
				geo.contains(new Vertex(this.getPos().getX() + this.getWidth(), this.getPos().getY())) || this.contains(new Vertex(geo.getPos().getX() + geo.getWidth(), geo.getPos().getY())) || 
				geo.contains(new Vertex(this.getPos().getX() + this.getWidth(), this.getPos().getY() + this.getHeight())) || this.contains(new Vertex(geo.getPos().getX() + geo.getWidth(), geo.getPos().getY() + geo.getHeight())) ) return true;
		return false;
	}
	
	//Hilfsmethode, welche die Felder auf zulässige Werte überprüft und diese gegebenfalls anpasst
	private void eleminateNegation(){
		if (this.width < 0) {
			this.width = -this.width;
			this.pos.setX(this.pos.getX() - this.width);
		}
		if (this.height < 0) {
			this.height = -this.height;
			this.pos.setY(this.pos.getY() - this.height);
		}
	}
	
	public String toString(){
		return "width = " + this.getWidth() + ", height = " + this.getHeight() + ", pos = " + this.getPos();
	}
	
	//Getter und Setter für die Felder
	public Vertex getPos() {
		return pos;
	}
	public void moveTo(Vertex pos) {
		this.pos = pos;
	}
	public void moveTo(double x, double y) {
		this.moveTo(new Vertex(x, y));
	}
	public void move(Vertex v){
		this.moveTo(this.pos.add(v));
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
		this.eleminateNegation();
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
		this.eleminateNegation();
	}
	
	

}
