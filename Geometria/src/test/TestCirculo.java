package test;
import modelo.Punto;
import modelo.Circulo;
public class TestCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p=new Punto(1,1);
		Punto radio=new Punto(5,4);
		Circulo c=new Circulo(p,7);
		Circulo c1=new Circulo(p,7);
		Circulo c2=new Circulo(p,radio);
		
		System.out.println("Circulo 1: " + c.toString());
		System.out.println("Circulo 2: " + c1.toString());
		System.out.println("Circulo 3: " + c2.toString());
		System.out.println("El circulo 1 y 2 son iguales? " + c.equals(c1));
		System.out.println("El circulo 1 y 3 son iguales? " + c.equals(c2));
		System.out.println("El perimetro del circulo 1 es: " + String.format("%.2f",c.calcularPerimetro()));
		System.out.println("El area del circulo 1 es: " + String.format("%.2f",c.calcularArea()));
		System.out.println("La distancia entre el circulo 1 y 2 es: " + String.format("%.2f",c.calcularDistancia(c1)));
		
		c2.mover(5,0);
		System.out.println("Circulo 3 movido " + c2.toString());
		
	
	}

}
