package test;

import modelo.Numero;

public class TestNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero n1=new Numero(7);
		Numero n2=new Numero(5);
		int n3=6;
		
		System.out.println("La suma de:" + n1.getN() + "+" + n3 + " es:" + n1.sumar(n3));
		System.out.println("La suma de:" + n2.getN() + "+" + n3 + " es:" + n2.sumar(n3));
		System.out.println("La multiplicacion de:" + n1.getN() + "*" + n3 + " es:" + n1.multiplicar(n3));
		System.out.println("La multiplicacion de:" + n2.getN() + "*" + n3 + " es:" + n2.multiplicar(n3));
		System.out.println("El numero " + n1.getN() + " es par? " + n1.esPar());
		System.out.println("El numero " + n2.getN() + " es par? " + n2.esPar());
		System.out.println("El numero " + n1.getN() + " es primo? " + n1.esPrimo());
		System.out.println("El numero " + n2.getN() + " es primo? " + n2.esPrimo());
		System.out.println(n1.convertirAString());
		System.out.println(n2.convertirAString());
		System.out.println("El numero " + n1.getN() + " en formato double es: " + n1.convertirADouble());
		System.out.println("El numero " + n2.getN() + " en formato double es: " + n2.convertirADouble());
		int exp=2;
		System.out.println("El numero " + n1.getN() + " elevado a " + exp + " da como resultado " + n1.calcularPotencia(exp));
		System.out.println("El numero " + n2.getN() + " elevado a " + exp + " da como resultado " + n2.calcularPotencia(exp));
		System.out.println("El numero " + n1.getN() + " en base 2 es " + n1.pasarBase2());
		System.out.println("El numero " + n2.getN() + " en base 2 es " + n2.pasarBase2());
		System.out.println("El factorial de " + n1.getN() + " es " + n1.calcularFactorial());
		System.out.println("El factorial de " + n2.getN() + " es " + n2.calcularFactorial());
		int comb=2;
		System.out.println("El numero combinatorio de " + n1.getN() + " y " + comb + " es: " + n1.numeroCombinatorio(comb));
		System.out.println("El numero combinatorio de " + n2.getN() + " y " + comb + " es: " + n2.numeroCombinatorio(comb));
		System.out.println("Mellizos? " + n1.esPrimoMellizo(n1, n2));
		int n=20;
		//primos utilizando un for
		for(int i=2;i<=n;i++){
			int a=0;
			for(int j=1;j<=n;j++){
				if(i%j==0){
					a+=1;
				}
			}
			if(a==2){
				System.out.println("Numero: " + i);
			}
		}
		
		
		
	
	}

}
