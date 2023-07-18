package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;

public class Twitter {
	private ArrayList<Usuario> usuarios;
	
	public Twitter(){
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public String addUsuario(String screenName) {
		for(Usuario user : usuarios) {
	        if(user.getScreenName().equals(screenName)) {
	            return "El usuario" + screenName + " ya existe";
	        }
	    }
		Usuario user = new Usuario(screenName);
		usuarios.add(user);
		return "El usuario" + screenName + " fue agregado";
	}
	
	public void deleteUsuario(String screenName) {
//		for (Usuario usuario1 : usuarios) {
//	         if(usuario1.getScreenName().equals(screenName)) {
//	            usuarios.remove(usuario1);
//	         }
//	      }
		this.usuarios.removeIf( Usuario -> Usuario.getScreenName().equals(screenName));
	}
	
	public ArrayList<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public void setUsuarios(ArrayList<Usuario> users){
		this.usuarios = users;
	}
}

