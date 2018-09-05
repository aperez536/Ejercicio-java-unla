package consultorio;

public class Medico {
	private String nombre;
	private String apellido;
	private String especialidad;
	
	public Medico(String nombre, String apellido, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public String traerMedico(){
		return "Medico:" + nombre + " " + apellido + " " + "especialidad:" + especialidad;
	}
	
	public float calcularIMC(Paciente p){
		float imc=p.getPeso()/(float)Math.pow(p.getEstatura(),2);
		return imc;
	}

}
