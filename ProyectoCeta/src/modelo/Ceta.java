package modelo;
import java.util.*;
public class Ceta {
	private int idCeta;
	private GregorianCalendar fecha;
	private Contribuyente vendedor;
	private Contribuyente comprador;
	private double valorDeTranferencia;
	private boolean firmaComprador;
	public Ceta(int idCeta, GregorianCalendar fecha, Contribuyente vendedor, Contribuyente comprador,
			double valorDeTranferencia, boolean firmaComprador) {
		super();
		this.idCeta = idCeta;
		this.fecha = fecha;
		this.vendedor = vendedor;
		this.comprador = comprador;
		this.valorDeTranferencia = valorDeTranferencia;
		this.firmaComprador = firmaComprador;
	}
	public int getIdCeta() {
		return idCeta;
	}
	public void setIdCeta(int idCeta) {
		this.idCeta = idCeta;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	public Contribuyente getVendedor() {
		return vendedor;
	}
	public void setVendedor(Contribuyente vendedor) {
		this.vendedor = vendedor;
	}
	public Contribuyente getComprador() {
		return comprador;
	}
	public void setComprador(Contribuyente comprador) {
		this.comprador = comprador;
	}
	public double getValorDeTranferencia() {
		return valorDeTranferencia;
	}
	public void setValorDeTranferencia(double valorDeTranferencia) {
		this.valorDeTranferencia = valorDeTranferencia;
	}
	public boolean isFirmaComprador() {
		return firmaComprador;
	}
	public void setFirmaComprador(boolean firmaComprador) {
		this.firmaComprador = firmaComprador;
	}
	
}
