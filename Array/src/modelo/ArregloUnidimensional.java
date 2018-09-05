package modelo;

import java.util.Arrays;

public class ArregloUnidimensional {
	
	private int[] vector;

	public ArregloUnidimensional(int[] vector) {
		super();
		this.vector = vector;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}
	
	public String toString(){
		return Arrays.toString(vector);
	}
	
	public int traerElMenor(){
		int menor=vector[0];
		for(int i=1;i<vector.length;i++){
			if(vector[i]<menor){
				menor=vector[i];
			}
		}
		return menor;
	}
	
	public int traerElMayor(){
		int mayor=vector[0];
		for(int i=1;i<vector.length;i++){
			if(vector[i]>mayor){
				mayor=vector[i];
			}
		}
		return mayor;
	}
	
	public double calcularPromedio(){
		int suma=0;
		double promedio=0;
		for(int i=0;i<vector.length;i++){
			suma+=vector[i];
		}
		promedio=suma/vector.length;
		return promedio;
	}
	
	public int[] ordenarAscendente(){
		int [] vectoraux=this.vector.clone();
		for(int i=0;i<vectoraux.length-1;i++){
			for(int j=0;j<vectoraux.length-1;j++){
				if(vectoraux[j+1]<vectoraux[j]){
					int aux=vectoraux[j+1];
					vectoraux[j+1]=vectoraux[j];
					vectoraux[j]=aux;
				}
			}
		}
		return vectoraux;
	}
	
	public int[] ordenarDescendente(){
		int[] vectoraux=this.vector.clone();
		for(int i=0;i<vectoraux.length-1;i++){
			for(int j=0;j<vectoraux.length-1;j++){
				if(vectoraux[j+1]>vectoraux[j]){
					int aux=vectoraux[j+1];
					vectoraux[j+1]=vectoraux[j];
					vectoraux[j]=aux;
				}
			}
		}
		return vectoraux;
	}
	
	public double traerFrecuencia(int numero){
		double cantidad=0;
		for(int i=0;i<vector.length;i++){
			if(vector[i]==numero){
				cantidad++;
			}
		}
		return (cantidad/vector.length);
	}
	
	public int traerModa(){
		int moda=vector[0];
		double frecuenciaMayor=traerFrecuencia(moda);
		for(int i=1;i<vector.length;i++){
			double frecuencia=traerFrecuencia(vector[i]);
			if(frecuencia>frecuenciaMayor){
				frecuenciaMayor=frecuencia;
				moda=vector[i];
			}
		}
		return moda;
	}
	
	
}
