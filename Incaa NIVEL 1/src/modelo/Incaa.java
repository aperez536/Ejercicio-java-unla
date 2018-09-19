package modelo;
import java.util.*;
public class Incaa {
	private List <Pelicula> catalogo;

	public Incaa() throws Exception{
		super();
		this.catalogo = new ArrayList<Pelicula>();
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	private int traerPosPelicula(int idPelicula) {
		int pos = 0;
		boolean encontrado = false;
		int i = 0;
		while(encontrado == false && i < catalogo.size()) {
			if(catalogo.get(i).getIdPelicula() == idPelicula){
				pos = i;
				encontrado = true;	
			}
			i++;
		}
		return pos;
	}
	
	
	public Pelicula traerPelicula(int idPelicula) {
		Pelicula p = null;
		int i = 0;
		while(p== null && i < catalogo.size()) {
			if(catalogo.get(i).getIdPelicula() == idPelicula)
				p = catalogo.get(i);
			i++;
		}
		return p;
	}
	
	public List<Pelicula> traerpelicula(String partePelicula){
		List<Pelicula> nuevaLista = new ArrayList<Pelicula>();
		int i = 0;
		while(i < catalogo.size()) {
			if(catalogo.get(i).getPelicula().contains(partePelicula))
				nuevaLista.add(catalogo.get(i));
			i++;
		}
		return nuevaLista;
		
	}
	
	public Pelicula traerPeli(String pelicula) {
		Pelicula p = null;
		int i = 0;
		while(p == null && i < catalogo.size() ) {
			if(catalogo.get(i).getPelicula().equalsIgnoreCase(pelicula))
				p = catalogo.get(i);
			i++;
		}
		return p;
	}
	
	public boolean agregarPelicula(String pelicula) throws Exception{
		int proxId = 0;
		if(traerPeli(pelicula) != null) throw new Exception ("ya esta agregado en la lista");
		else {
			if(catalogo.size() == 0)
				proxId = 1;
			else {
				proxId = catalogo.get(catalogo.size()-1).getIdPelicula() + 1;
			}
		}
		return catalogo.add(new Pelicula(proxId,pelicula));
	}
	
	public boolean eliminarPelicula(int idPelicula) throws Exception{
		Pelicula p = null;
		if(traerPelicula(idPelicula) == null) throw new Exception("no existe la pelicula");
		p = traerPelicula(idPelicula);
		return catalogo.remove(p);
	}
	
	public boolean modificarPelicula(int idPelicula,String pelicula) throws Exception {
		boolean modificado = true;
		int i =  0;
		Pelicula p = null;
		if(traerPelicula(idPelicula) == null) throw new Exception("no existe la pelicula a modificar");
		p = traerPelicula(idPelicula);
		p.setPelicula(pelicula);
		catalogo.set(traerPosPelicula(idPelicula), p);
		return modificado;
	}

	@Override
	public String toString() {
		return "Incaa" + catalogo + "";
	}
	
}
