package modelo;

public class Circulo {
	
	private Punto origen;
	private double radio;
	
	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;
	}
	
	public Circulo(Punto origen, Punto radio) {
		super();
		this.origen = origen;
		this.setRadio(radio);
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void setRadio(Punto radio){
		this.radio = origen.calcularDistancia(radio);
	}
	
	public String toString(){
		return "("+origen+","+radio+")";
	}
	
	public boolean equals(Circulo c){
		return ((origen==c.getOrigen())&&(radio==c.getRadio()));
	}
	
	
	public double calcularPerimetro(){
		double perimetro=2*Math.PI*radio;
		return perimetro;
	}
	
	public double calcularArea(){
		double area=Math.PI*Math.pow(radio,2);
		return area;
	}
	
	public double calcularDistancia(Circulo c){
		double valor1=this.origen.calcularDistancia(c.getOrigen());
		double valor2=this.radio+c.getRadio();
		return valor2-valor1;
	}
	
	public void mover(double desplazamientoX,double desplazamientoY){
		Punto nuevoOrigen=new Punto(origen.getX(),origen.getY());
		origen=nuevoOrigen;
		origen.mover(desplazamientoX, desplazamientoY);
	}

}
