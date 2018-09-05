package modelo;

import java.util.*;

public class Funciones {
	
	public static int traerAnio(GregorianCalendar fecha){
		return fecha.get(Calendar.YEAR);
	}
	
	public static int traerMes(GregorianCalendar fecha){
		return (fecha.get(Calendar.MONTH)+1);
	}
	
	public static int traerDia(GregorianCalendar fecha){
		return fecha.get(Calendar.DAY_OF_MONTH);
	}
	
	public static boolean esBisiesto(int anio){
		boolean esBisiesto=false;
		if((anio%4==0)&&(anio%100!=0)||(anio%400==0)){
			esBisiesto=true;
		}
		return esBisiesto;
	}
	
	public static boolean esFechaValida(int anio,int mes,int dia){
		boolean esValida=false;
		if(mes>=1&&mes<=12){
			if(mes==1&&(dia>=1&&dia<=30)){
				esValida=true;
			}
			if(mes==2&&(dia>=1&&dia<=28)){
				esValida=true;
			}
			if(mes==2&&Funciones.esBisiesto(anio)==true&&dia==29){
				esValida=true;
			}
			if(mes==3&&(dia>=1&&dia<=31)){
				esValida=true;
			}
			if(mes==4&&(dia>=1&&dia<=30)){
				esValida=true;
			}
			if(mes==5&&(dia>=1&&dia<=31)){
				esValida=true;
			}
			if(mes==6&&(dia>=1&&dia<=30)){
				esValida=true;
			}
			if(mes==7&&(dia>=1&&dia<=31)){
				esValida=true;
			}
			if(mes==8&&(dia>=1&&dia<=31)){
				esValida=true;
			}
			if(mes==9&&(dia>=1&&dia<=30)){
				esValida=true;
			}
			if(mes==10&&(dia>=1&&dia<=31)){
				esValida=true;
			}
			if(mes==11&&(dia>=1&&dia<=30)){
				esValida=true;
			}
			if(mes==12&&(dia>=1&&dia<=31)){
				esValida=true;
			}
		}
		
		return esValida;
	}
	
	public static GregorianCalendar traerFecha(int anio,int mes,int dia){
		GregorianCalendar fecha=new GregorianCalendar();
		fecha.set(anio, (mes-1), dia);
		return (GregorianCalendar)fecha;
	}
	
	public static GregorianCalendar traerFecha(String fecha){
		int dia=Integer.parseInt(fecha.substring(0,2));
		int mes=(Integer.parseInt(fecha.substring(3,5))-1);
		int anio=Integer.parseInt(fecha.substring(6,10));
		GregorianCalendar f=new GregorianCalendar(anio,mes,dia);
		return f;
	}
	
	public static String traerFechaCorta(GregorianCalendar fecha){
		return Funciones.traerDia(fecha) + "/" + Funciones.traerMes(fecha) + "/" + Funciones.traerAnio(fecha);
	}
	
	public static String traerFechaCortaHora(GregorianCalendar fecha){
		return Funciones.traerFechaCorta(fecha) + " " + fecha.get(Calendar.HOUR_OF_DAY) + ":" + fecha.get(Calendar.MINUTE) + ":" + fecha.get(Calendar.SECOND);
	}
	
	public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha,int dias){
		GregorianCalendar fechaSig=(GregorianCalendar)fecha.clone(); 
		fechaSig.add(Calendar.DAY_OF_MONTH,dias);
		return fechaSig;
	}
	
	public static boolean esDiaHabil(GregorianCalendar fecha){
		boolean esHabil=false;
		if(fecha.get(Calendar.DAY_OF_WEEK)>=2&&fecha.get(Calendar.DAY_OF_WEEK)<=6){
			esHabil=true;
		}
		return esHabil;
	}
	
	public static String traerDiaDeLaSemana(GregorianCalendar fecha){
		String dia="";
		int d=fecha.get(Calendar.DAY_OF_WEEK);
		switch(d){
		case 1:dia="Domingo";
		break;
		case 2:dia="Lunes";
		break;
		case 3:dia="Martes";
		break;
		case 4:dia="Miercoles";
		break;
		case 5:dia="Jueves";
		break;
		case 6:dia="Viernes";
		break;
		case 7:dia="Sabado";
		break;
		}
		return dia;
	}
	
	public static String traerMesEnLetras(GregorianCalendar fecha){
		String mes="";
		int m=Funciones.traerMes(fecha);
		switch(m){
		case 1:mes="Enero";
		break;
		case 2:mes="Febrero";
		break;
		case 3:mes="Marzo";
		break;
		case 4:mes="Abril";
		break;
		case 5:mes="Mayo";
		break;
		case 6:mes="Junio";
		break;
		case 7:mes="Julio";
		break;
		case 8:mes="Agosto";
		break;
		case 9:mes="Septiembre";
		break;
		case 10:mes="Octubre";
		break;
		case 11:mes="Noviembre";
		break;
		case 12:mes="Diciembre";
		break;
		}
		return mes;
	}
	
	public static String traerFechaLarga(GregorianCalendar fecha){
		return Funciones.traerDiaDeLaSemana(fecha) + " " +Funciones.traerDia(fecha) + " de " + Funciones.traerMesEnLetras(fecha) + " del " + Funciones.traerAnio(fecha); 
	}
	
	public static boolean sonFechasIguales(GregorianCalendar fecha,GregorianCalendar fecha1){
		boolean iguales=false;
		if(Funciones.traerFechaCorta(fecha).equals(Funciones.traerFechaCorta(fecha1))){
			iguales=true;
		}
		return iguales;
	}
	
	public static boolean sonFechasHorasIguales(GregorianCalendar fecha,GregorianCalendar fecha1){
		boolean iguales=false;
		if(Funciones.traerFechaCortaHora(fecha).equals(Funciones.traerFechaCortaHora(fecha1))){
			iguales=true;
		}
		return iguales;
	}
	
	public static int traerCantidadDiasDeUnMes(int anio,int mes){
		int dia=0;
		switch(mes){
		case 1:dia=31;
		break;
		case 2:dia=28;
		if(Funciones.esBisiesto(anio)==true){
			dia=29;
		}
		break;
		case 3:dia=31;
	    break;
	    case 4:dia=30;
		break;
	    case 5:dia=31;
		break;
	    case 6:dia=30;
		break;
	    case 7:dia=31;
		break;
	    case 8:dia=31;
		break;
	    case 9:dia=30;
		break;
	    case 10:dia=31;
		break;
	    case 11:dia=30;
		break;
	    case 12:dia=31;
		break;
		}
		return dia;
	}
	
	public static double aproximar2Decimal(double numero){
		String numString = String.valueOf(numero);
		numString = numString.substring(numString.indexOf("."));
		if( 3 < numString.length()){
		 if(numString.charAt(3) >= 5 ){
		   numero = numero +0.01;
		 }
		}
		numero =(int)(numero*100);
		return numero/100;
	}
	
	public static boolean esNumero(char c){
		boolean respuesta= false;
		for(int i=0;i<10;i++){
		 if (c == String.valueOf(i).charAt(0)){
		  respuesta = true;
		 }
		}
		return respuesta;
	}
	
	public static boolean esLetra(char c){
		String abecedario = "qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM";
		boolean validar = false;
		for (int i=0; i< abecedario.length(); i++){
		  if (c == abecedario.charAt(i)){
		    validar = true;
		  }
		}
		return validar;
	}
	
	public static boolean esCadenaDeNumeros(String cadena){
		boolean respuesta = true;
		for(int i=0; i<cadena.length(); i++){
		  if(Funciones.esNumero(cadena.charAt(i))!=true){
		    respuesta = false;
		  }
		}
		return respuesta;
	}
	
	public static boolean esCadenaDeCaracteres(String cadena){
		boolean val = true;
		for(int i=0; i< cadena.length(); i++){
		   if(!(Funciones.esLetra(cadena.charAt(i)))){
		      val = false;
		   }
		}
		return val;
	}

	public static double convertirADouble(int n){
		return ((double)n);
	}
	
}
