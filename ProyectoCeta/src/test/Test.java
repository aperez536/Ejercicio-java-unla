package test;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Contribuyente c = new Contribuyente(1,"a","b",1,'m',"20356396066");
		System.out.println(c.toString());
		Rodado r = new Rodado();
		System.out.println(r.validarDominio("ABC456"));
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}

}
