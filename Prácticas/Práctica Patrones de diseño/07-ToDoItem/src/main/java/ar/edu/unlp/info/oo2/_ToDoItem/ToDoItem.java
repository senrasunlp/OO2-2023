package ar.edu.unlp.info.oo2._ToDoItem;
import java.time.Duration;
import java.util.ArrayList;

public class ToDoItem {
	private String nombre;
	private ArrayList<String> comentarios;
	private State estado;
/* 
 * Instancia un ToDoItem nuevo en estado pending con <name> como nombre. 
 */
        public ToDoItem(String name) {
        	comentarios = new ArrayList<String>();
        	nombre=name;
        	estado = new InProgress();        	
        }
        public void start() {
        	estado.start(this);
        }
        public void togglePause() {
        	estado.togglePause(this);
        }
        public void finish() {
        }

        public Duration workedTime() {
        	return null;
        }

        public void addComment(String comment) {
        	estado.addComment(this, comment);
        }
        
        public void pushComment(String comment) {
        	comentarios.add(comment);
        }
        
        public void setStatus(State newState) {
        	estado = newState;
        }
        
        public String getNombre() {
        	return nombre;
        }
}