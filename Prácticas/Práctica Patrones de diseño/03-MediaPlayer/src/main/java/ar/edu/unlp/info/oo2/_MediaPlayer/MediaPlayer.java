package ar.edu.unlp.info.oo2._MediaPlayer;

import java.util.List;
import java.util.ArrayList;

public class MediaPlayer {
	private List<Media> listaMedia;
	
	public MediaPlayer(){
		listaMedia = new ArrayList<Media>();
	}
	
	public void agregarMedia(Media media) {
		listaMedia.add(media);
	}
	public void reproducirMedia(Media media) {
		media.play();
	}
	
	public List<Media> getListaMedia() {
		return listaMedia;
	}
	
	public void reproducirTodo() {
		listaMedia.stream().forEach(media -> media.play()); //Que hace el stream aca?
	}
}
