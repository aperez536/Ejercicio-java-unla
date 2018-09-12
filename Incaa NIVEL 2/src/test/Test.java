package test;
import java.util.*;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		Genero g1 = new Genero(1,"vampirico");
		Genero g2 = new Genero(2,"comedia");
		Genero g3 = new Genero(3,"accion");
		// TODO Auto-generated method stub
		try {
			Incaa i = new Incaa();
			

			System.out.println(i.agregarPelicula("Harry Potter",g1));
			System.out.println(i.agregarPelicula("El señor de los anillos",g2));
			System.out.println(i.agregarPelicula("La monja",g3));
			System.out.println(i.toString());
			System.out.println();
			
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		
		}
		try {
			Incaa i = new Incaa();
			System.out.println("EXCEPTION 1");
			System.out.println(i.agregarPelicula("Harry Potter",g1));
			System.out.println(i.agregarPelicula("El señor de los anillos",g2));
			System.out.println(i.agregarPelicula("La monja",g3));
			System.out.println(i.agregarPelicula("Harry Potter",g3));
			
			
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		
			}
		
		try {
			Incaa i = new Incaa();
			System.out.println();
			System.out.println(i.agregarPelicula("Harry Potter",g1));
			System.out.println(i.agregarPelicula("El señor de los anillos",g2));
			System.out.println(i.agregarPelicula("La monja",g3));
			System.out.println(i.traerPeli("nose") );
			System.out.println();
			
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		
		}
		try {
			Incaa i = new Incaa();
			System.out.println("EXCEPTION 3: ELIMINAR PELICULA QUE NO ESTE EN LA LISTA");
			System.out.println(i.agregarPelicula("Harry Potter",g1));
			System.out.println(i.eliminarPelicula(2));
	
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		
		}
		try {
			Incaa i = new Incaa();
			System.out.println(" ");
			System.out.println(i.agregarPelicula("Harry Potter",g1));
			System.out.println(i.agregarPelicula("Harry y el dragon",g2));
			System.out.println(i.agregarPelicula("nose",g2));
			System.out.println(i.traerpelicula("Harry"));
			System.out.println(i.eliminarPelicula(2));
			System.out.println(i.toString());
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		
		}
		try {
			Incaa i = new Incaa();
			System.out.println();
			System.out.println("agregar/eliminar/modificar pelicula");
			System.out.println(i.agregarPelicula("Harry Potter",g1));
			System.out.println(i.agregarPelicula("El señor de los anillos",g1));
			System.out.println(i.agregarPelicula("La monja",g2));
			System.out.println(i.toString());
			System.out.println(i.traerPelicula(2));
			System.out.println(i.modificarPelicula(3, "probando",g1));
			System.out.println(i.toString());
			System.out.println(i.agregarPelicula("Hercules",g3));
			System.out.println(i.eliminarPelicula(3));
			System.out.println(i.toString());
			System.out.println(i.traerpelicula(g1));
			System.out.println(i.modificarPelicula(4, "MODIFICADO",g1));
			System.out.println(i.toString());

			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		
	}
	}

}
