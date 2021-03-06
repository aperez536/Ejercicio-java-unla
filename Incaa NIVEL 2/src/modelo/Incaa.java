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
			if(catalogo.get(i).getPelicula().ToLowerCase().contains(partePelicula.ToLowerCase()))
				nuevaLista.add(catalogo.get(i));
			i++;
		}
		return nuevaLista;
		
	}
	public List<Pelicula> traerpelicula(Genero genero){
		List<Pelicula> nuevaLista = new ArrayList<Pelicula>();
		int i = 0;
		while(i < catalogo.size()) {
			if(catalogo.get(i).getGenero().equals(genero))
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
	
	public boolean agregarPelicula(String pelicula,Genero genero) throws Exception{
		int proxId = 0;
		if(traerPeli(pelicula) != null) throw new Exception ("ya esta agregado en la lista");
		else {
			if(catalogo.size() == 0)
				proxId = 1;
			else {
				proxId = catalogo.get(catalogo.size()-1).getIdPelicula() + 1;
			}
		}
		return catalogo.add(new Pelicula(proxId,pelicula,genero));
	}
	
	public boolean eliminarPelicula(int idPelicula) throws Exception{
		Pelicula p = traerPelicula(idPelicula) ;
		if(p == null) throw new Exception("no existe la pelicula");
		return catalogo.remove(p);
	}
	
	public boolean modificarPelicula(int idPelicula,String pelicula,Genero genero) throws Exception {
		int i =  0;
		Pelicula p = traerPelicula(idPelicula);
		if(p == null) throw new Exception("no existe la pelicula a modificar");
		p.setPelicula(pelicula);
		p.setGenero(genero);
		return true;
	}

	@Override
	public String toString() {
		return "Incaa" + catalogo + "";
	}
	
}
