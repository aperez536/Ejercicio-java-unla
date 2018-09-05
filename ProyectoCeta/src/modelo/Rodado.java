package modelo;

public class Rodado {
	private int idRodado;
	private String dominio;
	private int modelo;
	private String marca;
	public Rodado(int idRodado, String dominio, int modelo, String marca) {
		super();
		this.idRodado = idRodado;
		this.dominio = dominio;
		this.modelo = modelo;
		this.marca = marca;
	}
	public Rodado() {
		
	}
	public int getIdRodado() {
		return idRodado;
	}
	public void setIdRodado(int idRodado) {
		this.idRodado = idRodado;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Rodado [idRodado=" + idRodado + ", dominio=" + dominio + ", modelo=" + modelo + ", marca=" + marca
				+ "]";
	}
	
	public boolean validarDominio(String dominio) {
		boolean esValido = false;
		if(dominio.length() == 6) {
			
			if(Funciones.esCadenaDeCaracteres(dominio.substring(0, 3)) == true)
				if(Funciones.esCadenaDeNumeros(dominio.substring(3,6)))
					esValido = true;
		}
			return esValido;
	
	}
}
