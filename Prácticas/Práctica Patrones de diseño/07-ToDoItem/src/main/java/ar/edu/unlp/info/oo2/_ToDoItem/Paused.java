package ar.edu.unlp.info.oo2._ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends State {
	
	public void start(ToDoItem context) {
		context.setStatus(new InProgress());
    }
	public void finish(ToDoItem context) {
		super.finish(context);
		context.setStatus(new Finished());
	}
	public Duration workedTime() {
    	return Duration.between(super.getStartInstant(), LocalDateTime.now());
    };

}
