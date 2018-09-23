package modelo;
import java.util.*;
public class Supermercado {
	
	
	private List<Producto> gondola;

	public Supermercado() {
		super();
		this.gondola = new ArrayList<Producto>();
	}

	public List<Producto> getGondola() throws Exception{
		return gondola;
	}

@Override
	public String toString() {
		return "Supermercado [gondola=" + gondola + "]";
	}
	public Producto traerProducto(Producto producto) {
		Producto p = null;
		int i  = 0;
		while(i < gondola.size() && p == null) {
			if(gondola.get(i).equals(producto))
				p = gondola.get(i);
			i++;
		}
		return p;
}


	public Producto traerProducto(int idProducto) {
		Producto p = null;
		int i  = 0;
		while(i < gondola.size() && p == null) {
			if(gondola.get(i).getIdProducto() == idProducto)
				p = gondola.get(i);
			i++;
		}
		return p;
	}
	public Producto traerProducto(String producto) {
		Producto p = null;
		int i = 0;
		while(i < gondola.size() && p == null) {
			if(gondola.get(i).getProducto().equalsIgnoreCase(producto))
				p = gondola.get(i);
			i++;
		}
		return p;
	}
	private int traerPosProducto(int idProducto) {
		boolean encontrado = false;
		int i = 0;
		int pos= 0;
		while(i < gondola.size() && encontrado == false ) {
			if(gondola.get(i).getIdProducto() == idProducto) {
				pos = i;
				encontrado = true;
			}
			i++;
		}
		return pos;
	}
	public boolean agregarProducto(String producto,float precio) throws Exception {
		if(traerProducto(producto) != null) throw new Exception ("el producto ya existe en la lista");
		int proxId = 0;
		if(gondola.size() == 0)
			proxId = 1;
		else {
		proxId = gondola.get(gondola.size()-1).getIdProducto()+1;
		}
		return gondola.add(new Producto(proxId,producto,precio));
	}
	public boolean modificarProducto(int  idProducto,String producto,double precio) throws Exception {
		Producto p = null;
		if(traerProducto(idProducto) == null) throw new Exception("no existe el producto a modificar");
		p = traerProducto(idProducto);
		p.setProducto(producto);
		p.setPrecio((float) precio);
		gondola.set(traerPosProducto(idProducto), p);
		return true;
	}
	public boolean eliminarProducto(int idProducto) throws Exception {
		Producto p = null;
		if(traerProducto(idProducto) == null) throw new Exception ("el producto a eliminar no existe");
		p = traerProducto(idProducto);
		return gondola.remove(p);
	}
	




}
