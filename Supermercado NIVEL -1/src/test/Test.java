package test;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		Supermercado s = new Supermercado();

		System.out.println(s.agregarProducto("alfajor", 1.0f));
		System.out.println(s.agregarProducto("alpiste", 30f));
		System.out.println(s.agregarProducto("girasol", 25f));
		System.out.println(s.toString());
		System.out.println(s.agregarProducto("alfajor", 1.0f));
		}
	catch(Exception e) {
		System.out.println(e.getMessage());
		}
	try {
		Supermercado s = new Supermercado();

		System.out.println(s.agregarProducto("alfajor", 1.0f));
		System.out.println(s.agregarProducto("alpiste", 30f));
		System.out.println(s.agregarProducto("girasol", 25f));
		System.out.println(s.toString());
		System.out.println(s.eliminarProducto(2));
		System.out.println(s.toString());
		System.out.println(s.eliminarProducto(2));
		
		}
	catch(Exception e){
		System.out.println(e.getMessage());

		}
	try {
		Supermercado s = new Supermercado();

		System.out.println(s.agregarProducto("alfajor", 1.0f));
		System.out.println(s.agregarProducto("alpiste", 30f));
		System.out.println(s.agregarProducto("girasol", 25f));
		System.out.println(s.toString());
		System.out.println(s.eliminarProducto(2));
		System.out.println(s.modificarProducto(2, "alpiste", 15f));
		
		}
	catch(Exception e){
		System.out.println(e.getMessage());

		}
	try {
		Supermercado s = new Supermercado();

		System.out.println(s.agregarProducto("alfajor", 1.0f));
		System.out.println(s.agregarProducto("alpiste", 30f));
		System.out.println(s.agregarProducto("girasol", 25f));
		System.out.println(s.traerProducto(2));
		System.out.println(s.traerProducto("Girasol"));

		}	
	catch(Exception e){
		System.out.println(e.getMessage());

		}
	try {
		Carrito c = new Carrito(1,null);
		Supermercado s = new Supermercado();
		System.out.println(s.agregarProducto("alfajor", 1.0f));
		System.out.println(s.agregarProducto("alpiste", 30f));
		System.out.println(s.agregarProducto("girasol", 25f));
		System.out.println(c.agregarItem(s.traerProducto(1), 7));
		System.out.println(c.agregarItem(s.traerProducto(2), 17));
		System.out.println(c.agregarItem(s.traerProducto(1), 7));

		System.out.println(c.toString());
		System.out.println(c.eliminarItem(s.traerProducto(2), 7));
		System.out.println(c.toString());
		System.out.println(c.eliminarItem(s.traerProducto(1), 14));
		System.out.println(c.toString());
		System.out.println(c.calcularTotal());



		

	
		}
	catch(Exception e){
		System.out.println(e.getMessage());

		}	
	try {
		Carrito c = new Carrito(1,null);
		Supermercado s = new Supermercado();
		System.out.println(s.agregarProducto("alfajor", 1.0f));
		System.out.println(s.agregarProducto("alpiste", 30f));
		System.out.println(s.agregarProducto("girasol", 25f));
		System.out.println(s.traerProducto(4));
		System.out.println(c.agregarItem(s.traerProducto(4), 7));

	
		}
	catch(Exception e){
		System.out.println(e.getMessage());

		}


	}

}
