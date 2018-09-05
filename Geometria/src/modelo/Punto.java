package modelo;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
	
	public boolean equals(Punto p){
		return((x==p.getX())&&(y==p.getY()));
	}
	
	public double calcularDistancia(Punto p){
		return Math.hypot((p.getX()-this.x),(p.getY()-this.y));
	}
	
	public void mover(double desplazamientoX,double desplazamientoY){
		x=x+desplazamientoX;
		y=y+desplazamientoY;
	}

}
