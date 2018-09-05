package test;

import java.util.Arrays;

import modelo.ArregloUnidimensional;

public class TestArregloUnidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1[]={8,5,4,6,7,9,1,2,3,10,9,8,5,8,9,5,4,3,2,8,7,8};
		ArregloUnidimensional a=new ArregloUnidimensional(v1);
		System.out.println("Valores del array:");
		System.out.println(a.toString());
		System.out.println("El valor mas grande es: " + a.traerElMayor());
		System.out.println("El valor mas chico es: " + a.traerElMenor());
		System.out.println("El promedio del array es: " + a.calcularPromedio());
		System.out.println("Array ordenado ascendentemente:");
		System.out.println(Arrays.toString(a.ordenarAscendente()));
		System.out.println("Array ordenado descendentemente:");
		System.out.println(Arrays.toString(a.ordenarDescendente()));
		int num=9;
		System.out.println("El valor " + num + " tiene frecuencia: " + String.format("%.2f",a.traerFrecuencia(num)));
		System.out.println("El valor que mas aparece es: " + a.traerModa());
		
		
		

	}

}
