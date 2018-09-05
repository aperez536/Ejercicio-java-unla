package test;
import modelo.Punto;
public class TestPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p=new Punto(2,5);
		Punto p1=new Punto(2,5);
		Punto p2=new Punto(3,5);
		
		System.out.println("Punto 1: " + p.toString());
		System.out.println("Punto 2: " + p1.toString());
		System.out.println("Punto 3: " + p2.toString());
		System.out.println("El punto 1 y 2 son iguales? " + p.equals(p1));
		System.out.println("El punto 1 y 3 son iguales? " + p.equals(p2));
		System.out.println("Distancia entre el punto 1 y 2: " + p.calcularDistancia(p1));
		System.out.println("Distancia entre el punto 1 y 2: " + p.calcularDistancia(p2));
		p2.mover(2,2);
		System.out.println("Punto 3 movido " + p2.toString());
		
		

	}

}
