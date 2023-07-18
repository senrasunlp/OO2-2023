package ar.edu.unlp.info.oo2._ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends State {
	

	public void start(ToDoItem context) {
		context.setStatus(new Paused());
    }

	public void togglePause(ToDoItem context) {
		context.setStatus(new Paused());
	}

	public void finish(ToDoItem context) {
		super.setFinishInstant(LocalDateTime.now());
		context.setStatus(new Finished());
	}
	
	/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start) hasta que se finalizó. 
* En caso de que no esté finalizado, el tiempo que haya transcurrido hasta el momento actual. 
* Si el ToDoItem no se inició, genera un error informando la causa específica del mismo.
*/
    public Duration workedTime() {
    	return Duration.between(super.getStartInstant(), LocalDateTime.now());
    };   
}
