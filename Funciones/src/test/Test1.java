package test;
import java.util.*;
import modelo.Funciones;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar f = new GregorianCalendar(2018,8,4);
		System.out.println(Funciones.traerAnio(f));
		System.out.println(Funciones.traerMes(f));
		System.out.println(Funciones.traerFechaLarga(f));
	
	}

}
