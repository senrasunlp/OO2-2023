package ar.edu.unlp.info.oo2._ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State {
	
	public void start(ToDoItem context) {
		super.setStartInstant(LocalDateTime.now());
		context.setStatus(new InProgress());
    }
	
	 public Duration workedTime(ToDoItem context) {		 
		 throw new RuntimeException("El objeto ToDoItem no se encuentra en pause, in-progress ni finished");
	 };
}
