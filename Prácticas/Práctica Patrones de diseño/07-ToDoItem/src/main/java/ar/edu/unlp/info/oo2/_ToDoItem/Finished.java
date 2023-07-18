package ar.edu.unlp.info.oo2._ToDoItem;

import java.time.Duration;

public class Finished extends State {

	public void start(ToDoItem context) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }
	
	public Duration workedTime() {
    	return Duration.between(super.getStartInstant(), super.getFinishInstant());
    }; 
}
