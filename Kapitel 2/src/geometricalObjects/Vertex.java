package geometricalObjects;

public class Vertex {

	//Felder zum speichern der x und der y Koordinate
	private double x;
	private double y;

	//Konstruktor �berpr�ft die �bergebenen Variablen auf ihre Zul�ssigkeit und weisst die den Feldern zu.
	public Vertex(double x, double y) {
		super();
		if(x < 0) x = -x;
		if(y < 0) y = -y;
		this.x = x;
		this.y = y;
	}

	//Berechnung des Abstands von Ursprung zu Vertex via Pythagoras
	public double length(){
		return this.lengthTo(new Vertex(0,0));
	}

	//Berechnung des Abstands von Vertex zu �bergebenen Vertex via Pythagoras
	public double lengthTo(Vertex v){
		double tempX;
		double tempY;
		if (this.getX() < v.getX()) {
			tempX = v.getX() - this.getX();
		} else {
			tempX = this.getX() - v.getX();
		}
		if (this.getY() < v.getY()) {
			tempY = v.getY() - this.getY();
		} else {
			tempY = this.getY() - v.getY();
		}
		return Math.sqrt(tempX * tempX + tempY * tempY);
	}

	//Skalieren des Vertex mit dem �bergebenen Wert
	public void scalMod(double s){
		if(s < 0) s = -s;
		this.setX(s * this.getX());
		this.setY(s * this.getY());
	}

	//Gibt den Vertex scaliert zur�ck ohne das Object zu bearbeiten
	public Vertex scal(double s){
		if(s < 0) s = -s;
		return new Vertex(s * this.getX(), s * this.getY());
	}

	//Methode die eine Kopie der Instanz erzeugt und zur�ckgibt
	public Vertex copy(){
		return new Vertex(this.getX(),this.getY());
	}

	//Errechnet den Betrag der x und y Koordinate
	public double sum(){
		return this.getX() + this.getY();
	}

	//Normalisierung der Instanz
	public void normalizedMod(){
		this.setX(this.getX() / this.sum());
		this.setY(this.getY() / this.sum());
	}

	//Gibt den Vertex normalisiert zur�ck ohne das Object zu bearbeiten
	public Vertex normalized(){
		return new Vertex(this.getX() / this.sum(), this.getY() / this.sum());
	}

	//Vergleicht Instanz mit �bergebenen Vertex
	public boolean equals(Object thatObject){
		if (thatObject instanceof Vertex){
			Vertex that = (Vertex) thatObject;
			return this.getX() == that.getX() && this.getY() == that.getY();
		}
		return false;
	}

	//Addieren des Punktes mit einem �bergebenen Vertex
	public void addMod(Vertex v){
		this.setX(this.getX() + v.getX());
		this.setY(this.getY() + v.getY());
	}

	//Gibt den Vertex addiert mit dem �bergebenen Vertex zur�ck ohne das Object zu bearbeiten
	public Vertex add(Vertex v){
		return new Vertex(this.getX() + v.getX(), this.getY() + v.getY());
	}

	//Subthrahieren des Punktes mit einem �bergebenen Vertex
	public void subMod(Vertex v){
		this.setX(this.getX() - v.getX());
		this.setY(this.getY() - v.getY());
	}

	//Gibt den Vertex addiert mit dem �bergebenen Vertex zur�ck ohne das Object zu bearbeiten
	public Vertex sub(Vertex v){
		return new Vertex(this.getX() - v.getX(), this.getY() - v.getY());
	}

	//R�ckgabe der beiden Variablen in einem String
	public String toString(){
		return "(" + x + "," + y +")";
	}

	//Getter und Setter f�r die beiden Felder
	public double getX() {
		return x;
	}
	public void setX(double x) {
		if(x < 0) x = -x;
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		if(x < 0) y = -y;
		this.y = y;
	}


}
