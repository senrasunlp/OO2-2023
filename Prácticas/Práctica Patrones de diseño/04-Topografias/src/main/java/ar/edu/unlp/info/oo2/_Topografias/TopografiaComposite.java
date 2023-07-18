package ar.edu.unlp.info.oo2._Topografias;

import java.util.ArrayList;

public class TopografiaComposite extends Topografia{
	
	private ArrayList<Topografia> listaPorciones;
	
	public TopografiaComposite(Proporcion proporcion, ArrayList<Topografia> listaPorciones) {
		super(proporcion);
		this.listaPorciones = listaPorciones;
	}

	public ArrayList<Topografia> getListaPorciones() {
		return listaPorciones;
	}

	public void setListaPorciones(ArrayList<Topografia> listaPorciones) {
		this.listaPorciones = listaPorciones;
	}
		
	public Proporcion calcularProporcion() {
		double sumPropAgua = 0;
		double sumPropTierra = 0;
		int contPorciones = 0;
		Proporcion prop;
	    for(Topografia porcion :this.listaPorciones) {
	    	contPorciones+=1;
	    	prop = porcion.calcularProporcion();
	    	sumPropAgua += prop.getPropAgua();
	    	sumPropTierra += prop.getPropTierra();
	      }
		return new Proporcion(sumPropAgua/contPorciones,sumPropTierra/contPorciones);
	};
}
