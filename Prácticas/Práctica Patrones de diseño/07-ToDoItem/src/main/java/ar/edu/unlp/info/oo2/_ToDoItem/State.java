package ar.edu.unlp.info.oo2._ToDoItem;
import java.time.LocalDateTime;

public class State {
	private LocalDateTime startInstant;
	private LocalDateTime finishInstant;
    public void start(ToDoItem context) {};
	/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su estado es paused. 
* Caso contrario (pending o finished) genera un error informando la causa específica del mismo.
*/
	public void togglePause(ToDoItem context) {};  
	/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea  in-progress o paused. 
* Si se encuentra en otro estado, no hace nada.
*/
    public void finish(ToDoItem context) {};

/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. 
* Caso contrario no hace nada."
*/
    public void addComment(ToDoItem context, String comment) {
    	if (!this.getClass().getSimpleName().equals("Finished")) {
        	context.pushComment(comment);
        }
    }
    
    public void setStartInstant(LocalDateTime instante) {
    	startInstant = instante;
    	
    }
    public void setFinishInstant(LocalDateTime instante) {	
    	finishInstant = instante;  	
    }
    
    public LocalDateTime getStartInstant() {
    	return startInstant;
    	
    }
    public LocalDateTime getFinishInstant() {	
    	return finishInstant;  	
    }
}


