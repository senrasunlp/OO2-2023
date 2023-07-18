package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TwitterTest {
	private Twitter twitter;
	@BeforeEach
	void setUp() throws Exception {
		this.twitter = new Twitter();
		this.twitter.addUsuario("Juan");
		this.twitter.addUsuario("Martin");
		this.twitter.addUsuario("Lucas");
	}

	@Test
	void testAddUsuario() {
		this.twitter.addUsuario("Jun");
		assert this.twitter.getUsuarios().size() == 4;
		this.twitter.addUsuario("Lucas");
		assert this.twitter.getUsuarios().size() == 4;
	}
	
	@Test
	void testDeleteUsuario() {
		this.twitter.deleteUsuario("Gianluca");
		assert this.twitter.getUsuarios().size() == 3;
		this.twitter.deleteUsuario("Juan");
		assert this.twitter.getUsuarios().size() == 2;
		
	}
	
	@Test
	void testGetUsuarios(){
		assert twitter.getUsuarios().size() == 3;
	}
	
	@Test
	void testSetUsuarios(){
		ArrayList<Usuario> users = new ArrayList<Usuario>();
		Usuario uA = new Usuario("User A");
		Usuario uB = new Usuario("User B");
		users.add(uA);
		users.add(uB);
		this.twitter.setUsuarios(users);
		assert this.twitter.getUsuarios().size() == 2;
	}
}
