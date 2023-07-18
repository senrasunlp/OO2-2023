package ar.edu.unlp.info.oo2._Topografias;

public abstract class Topografia {

	private Proporcion proporcion;
	
	public Topografia(Proporcion proporcion) {
		this.proporcion = proporcion;
	}
	
	public Proporcion getProporcion() {
		return this.proporcion;
	}
	public void setProporcion(Proporcion proporcion) {
		this.proporcion = proporcion;
	}
	
	public abstract Proporcion calcularProporcion();
	
}
