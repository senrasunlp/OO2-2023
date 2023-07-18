package ar.edu.unlp.info.oo2._Topografias;

public class Proporcion {
	
	private double propAgua;
	private double propTierra;
	
	public Proporcion(double propAgua, double propTierra) {
		this.propAgua = propAgua;
		this.propTierra = propTierra;
	}
	
	public double getPropAgua() {
		return propAgua;
	}
	public void setPropAgua(double propAgua) {
		this.propAgua = propAgua;
	}
	public double getPropTierra() {
		return propTierra;
	}
	public void setPropTierra(double propTierra) {
		this.propTierra = propTierra;
	}	
}
