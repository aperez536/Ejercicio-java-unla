package modelo;

public class Numero {
	
	private int n;

	public Numero(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public String traerNumero(){
		return "El numero es:" + n;
	}
	
	public int sumar(int n1){
		int sumar=this.n+n1;
		return sumar;
	}
	
	public int multiplicar(int n1){
		int multi=this.n*n1;
		return multi;
	}
	
	public boolean esPar(){
		boolean par=false;
		if(this.n%2==0){
			par=true;
		}
		return par;
	}
	
	public boolean esPrimo(){
		boolean primo=true;
		int contador=2;
		while((primo)&&(contador!=this.n)){
			if(this.n%contador==0){
				primo=false;
				}
			contador++;
		}
		return primo;
	}
	
	public String convertirAString(){
		return "El numero " + n  + " en String es:" + String.valueOf(n);
	}
	
	public double convertirADouble(){
		return Double.parseDouble(String.valueOf(n));
	}
	
	public double calcularPotencia(int exp){
		double pot=Math.pow(n, exp);
		return pot;
	}
	
	public String pasarBase2(){
		return Integer.toBinaryString(n);
	}
	
	public int calcularFactorial(){
		int fact=1;
		if(this.n==0 || this.n<0){
			return fact=1;
		}
		if(this.n>0){
			for(int i=1;i<=this.n;i++){
				fact=fact*i;
			}
		}
		return fact;
	}
	
	public int numeroCombinatorio(int n1){
		int comb=0,fact1=1,fact2=1,resu=0,fact3=1;
		if(this.n>n1){
			comb=1;
		}
		if(this.n>0 && n1>0){
			for(int i=1;i<=this.n;i++){
				fact1=fact1*i;
			}
			for(int j=1;j<=n1;j++){
				fact2=fact2*j;
			}
			resu=this.n-n1;
			for(int k=1;k<=resu;k++){
				fact3=fact3*k;
			}
			comb=(fact1/(fact2*fact3));
		}
		
		return comb;
		
	}
	
	public boolean esPrimoMellizo(Numero p,Numero o){
		boolean esMellizo=false;
		int resultado=0;
		if(p.esPrimo()&&o.esPrimo()){
			resultado=p.getN()-o.getN();
			if(resultado==2 || resultado==-2){
				esMellizo=true;
			}
		}
		return esMellizo;
	}
	

}
