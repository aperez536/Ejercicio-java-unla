package test;
import java.util.*;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Incaa i = new Incaa();
			
			System.out.println(i.agregarPelicula("Harry Potter"));
			System.out.println(i.agregarPelicula("El señor de los anillos"));
			System.out.println(i.agregarPelicula("La monja"));
			System.out.println(i.toString());
			System.out.println();
			
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		
		}
		try {
			Incaa i = new Incaa();
			System.out.println("EXCEPTION 1");
			System.out.println(i.agregarPelicula("Harry Potter"));
			System.out.println(i.agregarPelicula("El señor de los anillos"));
			System.out.println(i.agregarPelicula("La monja"));
			System.out.println(i.agregarPelicula("Harry Potter"));
			System.out.println();
			
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		
			}
		
		try {
			Incaa i = new Incaa();
			System.out.println("LISTA DE PELICULAS CON EL MISMO NOMBRE");
			System.out.println(i.agregarPelicula("Harry Potter"));
			System.out.println(i.agregarPelicula("El señor de los anillos"));
			System.out.println(i.agregarPelicula("La monja"));
			System.out.println(i.traerPeli("nose") );
			System.out.println();
			
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		
		}
		try {
			Incaa i = new Incaa();
			System.out.println("EXCEPTION 3: ELIMINAR PELICULA QUE NO ESTE EN LA LISTA");
			System.out.println(i.agregarPelicula("Harry Potter"));
			System.out.println(i.eliminarPelicula(2));
	
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		
		}
		try {
			Incaa i = new Incaa();
			System.out.println(" ");
			System.out.println(i.agregarPelicula("Harry Potter"));
			System.out.println(i.agregarPelicula("Harry y el dragon"));
			System.out.println(i.traerpelicula("Harry"));
			System.out.println(i.eliminarPelicula(2));
			}
		catch(Exception e){
			System.out.println(e.getMessage());
		
		}
		try {
			Incaa i = new Incaa();
			System.out.println();
			System.out.println("agregar/eliminar/modificar pelicula");
			System.out.println(i.agregarPelicula("Harry Potter"));
			System.out.println(i.agregarPelicula("El señor de los anillos"));
			System.out.println(i.agregarPelicula("La monja"));
			System.out.println(i.toString());
			System.out.println(i.traerPelicula(2));
			System.out.println(i.modificarPelicula(2, "probando"));
			System.out.println(i.toString());
			System.out.println(i.agregarPelicula("Hercules"));
			System.out.println(i.eliminarPelicula(3));
			System.out.println(i.toString());

			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		
	}
	}

}
