package test;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Rodado r = new Rodado();
		System.out.println(r.validarDominio("ABC456"));
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		try {	
			Contribuyente c = new Contribuyente(1,"Juan","Dominguez",1,'m',"20356396066");
			System.out.println(c.toString());
			System.out.println(c.validarCuil("20356396066"));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
