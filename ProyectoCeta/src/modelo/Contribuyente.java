package modelo;

public class Contribuyente {
private int idContribuyente;
private String apellido;
private String nombre;
private long dni;
private char sexo;
private String cuil;
public Contribuyente(int idContribuyente, String apellido, String nombre, long dni, char sexo, String cuil) throws Exception {
	super();
	this.idContribuyente = idContribuyente;
	this.apellido = apellido;
	this.nombre = nombre;
	this.dni = dni;
	this.setSexo(sexo);
	this.setCuil(cuil);
}
public int getIdContribuyente() {
	return idContribuyente;
}
public void setIdContribuyente(int idContribuyente) {
	this.idContribuyente = idContribuyente;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public long getDni() {
	return dni;
}
public void setDni(long dni) {
	this.dni = dni;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) throws Exception{
	if(!(validarSexo(sexo)))throw new Exception ("!no existe ese sexo"); 
	this.sexo = sexo;
}
public String getCuil() {
	return cuil;
}
public void setCuil(String cuil) throws Exception {
	if(!(validarCuil(cuil)) ) throw new Exception ("!cuil invalido");
	this.cuil = cuil;
}
@Override
public String toString() {
	return "Contribuyente [idContribuyente=" + idContribuyente + ", apellido=" + apellido + ", nombre=" + nombre
			+ ", dni=" + dni + ", sexo=" + sexo + ", cuil=" + cuil + "]";
}

public boolean equals(Contribuyente comprador) {
	return (dni == comprador.getDni());
}
public boolean validarSexo(char sexo) {
	return ((sexo == 'M' || sexo == 'm' ) || (sexo == 'f' || sexo == 'F'));
}

public boolean validarCuil(String cuil) {
	boolean valido = false;
	int vaux;
	int v1=0,v2=0,v3=0;
	int mult=5;
	if(Integer.parseInt(cuil.substring(0, 2)) == 20 && (getSexo() == 'm' || getSexo() == 'M' )|| 
	   Integer.parseInt(cuil.substring(0, 2)) == 27 && (getSexo() == 'f' || getSexo() == 'F' )) {
		for(int i = 0 ; i<cuil.length();i++) {	
			vaux= Integer.parseInt(cuil.substring(i,i+1));
			v1+= vaux * mult;
			mult = mult-1;
			if(mult == 2) mult = 7;
			
		}
		v2 = v1 % 11;
		v3 = 11 - v2;
		if(v3 == Integer.parseInt(cuil.substring(10,11))) valido = true;	
		
	}
	return valido;
}




}
