package test;

import consultorio.Paciente;
import consultorio.Medico;

public class TestConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente p1=new Paciente("Oscar","Ruina",1.70f,80);
		Paciente p2=new Paciente("Pepe","Argento",1.80f,95);
		Medico m1=new Medico("Dardo","Fuseneco","General");
		
		System.out.println("Lista de pacientes: ");
		System.out.println(p1.traerNombreCompleto());
		System.out.println(p2.traerNombreCompleto());
		System.out.println("Lista de medicos: ");
		System.out.println(m1.traerMedico());
		System.out.println("Visita 1: ");
		System.out.println(m1.traerMedico());
		System.out.println(p1.traerNombreCompleto() + " " + "IMC:" + m1.calcularIMC(p1));
		System.out.println(p2.traerNombreCompleto() + " " + "IMC:" + m1.calcularIMC(p2));
		System.out.println("Visita 2: ");
		p1.setPeso(95);
		p2.setPeso(100);
		System.out.println(m1.traerMedico());
		System.out.println(p1.traerNombreCompleto() + " " + "IMC:" + m1.calcularIMC(p1));
		System.out.println(p2.traerNombreCompleto() + " " + "IMC:" + m1.calcularIMC(p2));

	}

}
