package modelo;
import java.util.*;
public class Carrito {
	private int idCarrito;
	private GregorianCalendar fechaHora;
	private List<ItemCarrito> lstItem;
	public Carrito(int idCarrito, GregorianCalendar fechaHoram)throws Exception {
		super();
		this.idCarrito = idCarrito;
		this.fechaHora = fechaHora;
		this.lstItem = new ArrayList<ItemCarrito>();
	}
	public int getIdCarrito() {
		return idCarrito;
	}
	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}
	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}
	public List<ItemCarrito> getLstItem() {
		return lstItem;
	}
	
	
	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", fechaHora=" + fechaHora + ", lstItem=" + lstItem + "]";
	}
	public ItemCarrito traerItemCarrito(Producto producto) {
		ItemCarrito i = null;
		int j = 0;
		while (i == null  && j<lstItem.size()) {
			if(lstItem.get(j).getProducto().equals(producto))
				i = lstItem.get(j);
			j++;
			}
		return i;
		}
	
	
	public boolean agregarItem(Producto producto,int cantidad) {
		boolean agregado = false;
		int proxId = 0;
		if (traerItemCarrito(producto) != null) {
			traerItemCarrito(producto).setCantidad(traerItemCarrito(producto).getCantidad()+cantidad);
			agregado = true;
		}
		else if(lstItem.size() == 0) {
			proxId = 1;
			lstItem.add(new ItemCarrito(proxId,producto,cantidad));
			agregado = true;
		}
		else {
			proxId = lstItem.get(lstItem.size()-1).getIdItem() +1;
			lstItem.add(new ItemCarrito(proxId,producto,cantidad));
			agregado = true;
		}
		
		return agregado;
		
	}
	public boolean eliminarItem(Producto producto,int cantidad) throws Exception {
		if (traerItemCarrito(producto) == null) throw new Exception("no existe el producto en el carro");
		else traerItemCarrito(producto).setCantidad(traerItemCarrito(producto).getCantidad()-cantidad);
		
		if(traerItemCarrito(producto).getCantidad() <= 0) {
			lstItem.remove(traerItemCarrito(producto));
		}
		return true;
	}
	
	public float calcularTotal() {
		float total = 0;
		for (int i = 0; i< lstItem.size();i++) {
			total+= lstItem.get(i).calcularSubTotal();
		}
		return total;
	}
	
	
}
