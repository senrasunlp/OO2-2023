package ar.edu.unlp.info.oo2._Topografias;
import java.util.ArrayList;

public class TopografiaLeaf {
	
	private ArrayList<Terreno> terrenos;
	
	public ArrayList<Terreno> getTerrenos() {
		return terrenos;
	}

	public void setTerrenos(ArrayList<Terreno> terrenos) {
		this.terrenos = terrenos;
	}

	public TopografiaLeaf(ArrayList<Terreno> terrenos) {
		this.terrenos = terrenos;
	}
	
	public Proporcion calcularProporcion() {
		int cantAgua = 0;
		int cantTierra = 0;
		for (int i=0 ;i < 4; i++) {
			//Map<String, Integer> cantTerrenos = new HashMap<String, Integer>();		
			switch (this.getTerrenos().get(i).getClass().toString()) {
			case "Agua":
			    cantAgua+=1;
			    break;
			  case "Tierra":
			    cantTierra+=1;
			    break;
			  default:
			    System.out.println("Terreno no valido");
			}			
		}
		return new Proporcion(cantAgua/4,cantTierra/4);
	}
}

