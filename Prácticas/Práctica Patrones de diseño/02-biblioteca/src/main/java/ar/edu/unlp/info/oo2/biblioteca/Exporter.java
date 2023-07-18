package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class Exporter extends VoorheesExporter{
	
	public String exportar(List<Socio> socios) {
		//JSONArray: Usada para generar listas. Provee el metodo add(Object)
		JSONArray listado = new JSONArray();
		// si point es una instancia de JSONObject, se podra ejecutar point.put("x", 50)		
		for (Socio socio : socios) {
			JSONObject socioJson = new JSONObject();
			socioJson.put("nombre",socio.getNombre());
			socioJson.put("email",socio.getEmail());
			socioJson.put("legajo",socio.getLegajo());
			listado.add(socioJson);
		}
		return listado.toJSONString();
	}

}
