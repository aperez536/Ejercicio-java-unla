package modelo;

public class ArregloBiderecional {
	
	private double[][] matrizA;

	public ArregloBiderecional(double[][] matrizA) {
		super();
		this.matrizA = matrizA;
	}

	public double[][] getMatrizA() {
		return matrizA;
	}

	public void setMatrizA(double[][] matrizA) {
		this.matrizA = matrizA;
	}
	
	public String traerArreglo(double[][] matriz){
		String matrizS="";
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				matrizS+=matriz[i][j]+"; ";
			}
			matrizS+="\n";
		}
		return matrizS;
	}
	
	public double[][] sumar(double[][] matrizB){
		double[][] matrizC=new double[matrizA[0].length][matrizA[0].length];
		for(int i=0;i<matrizA.length;i++){
			for(int j=0;j<matrizA.length;j++){
				if(matrizA.length==matrizB.length){
					matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
				}
			}
		}
		return matrizC;
	}
	
	public double[][] restar(double[][] matrizB){
		double[][] matrizC=new double[matrizA[0].length][matrizA[0].length];
		for(int i=0;i<matrizA.length;i++){
			for(int j=0;j<matrizA.length;j++){
				if(matrizA.length==matrizB.length){
					matrizC[i][j]=matrizA[i][j]-matrizB[i][j];
				}
			}
		}
		return matrizC;
	}
	
	
	public double[][] transpuesta(){
		double[][] matrizC=new double[matrizA[0].length][matrizA[0].length];
		for(int i=0;i<matrizA.length;i++){
			for(int j=0;j<matrizA.length;j++){
				matrizC[j][i]=matrizA[i][j];
			}
		}
		return matrizC;
	}
	
	
	public double[][] multiplicar(double numero){
		double[][] matrizC=new double[matrizA[0].length][matrizA[0].length];
		for(int i=0;i<matrizA.length;i++){
			for(int j=0;j<matrizA.length;j++){
				matrizC[i][j]=(numero*matrizA[i][j]);
			}
		}
		return matrizC;
	}
	
	
	public double[][] multiplicar(double[][] matrizB){
		double[][] matrizC=new double[matrizA[0].length][matrizA[0].length];
		for(int i=0;i<matrizA.length;i++){
			for(int j=0;j<matrizA.length;j++){
				if(matrizA.length==matrizB.length){
					matrizC[i][j]=matrizA[i][j]*matrizB[i][j];
				}
			}
		}
		return matrizC;
	}
	
	
}
