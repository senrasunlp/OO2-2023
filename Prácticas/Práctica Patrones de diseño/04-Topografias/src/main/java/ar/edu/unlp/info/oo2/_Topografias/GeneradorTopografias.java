package ar.edu.unlp.info.oo2._Topografias;
import java.util.ArrayList;

public class GeneradorTopografias {
	
	private ArrayList<Topografia> listaTopografias;
	
	public void crearTopografias() {
		}
	
	public boolean compareTopografias(Topografia a, Topografia b) {
		if (a.equals(b)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public GeneradorTopografias(ArrayList<Topografia> listaTopografias) {
		this.listaTopografias = listaTopografias;
	}

	public ArrayList<Topografia> getListaTopografias() {
		return listaTopografias;
	}

	public void setListaTopografias(ArrayList<Topografia> listaTopografias) {
		this.listaTopografias = listaTopografias;
	}

}
