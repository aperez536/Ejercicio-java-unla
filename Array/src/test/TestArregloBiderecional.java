package test;

import modelo.ArregloBiderecional;

public class TestArregloBiderecional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][]m1={{1,2,3},{4,5,6},{7,8,9}};
		double [][]m2={{9,8,7},{6,5,4},{3,2,1}};
		ArregloBiderecional a=new ArregloBiderecional(m1);
		
		System.out.println("Matriz uno valores:");
		System.out.println(a.traerArreglo(m1));
		System.out.println("Matriz dos valores:");
		System.out.println(a.traerArreglo(m2));
		System.out.println("Suma de las dos matrices:");
		System.out.println(a.traerArreglo(a.sumar(m2)));
		System.out.println("Resta de las dos matrices:");
		System.out.println(a.traerArreglo(a.restar(m2)));
		System.out.println("Transpuesta matriz uno:");
		System.out.println(a.traerArreglo(a.transpuesta()));
		double numero=2;
		System.out.println("Matriz uno multiplicada por " + numero + ":");
		System.out.println(a.traerArreglo(a.multiplicar(numero)));
		System.out.println("Multiplicacion de las dos matrices:");
		System.out.println(a.traerArreglo(a.multiplicar(m2)));
		
		

	}

}
