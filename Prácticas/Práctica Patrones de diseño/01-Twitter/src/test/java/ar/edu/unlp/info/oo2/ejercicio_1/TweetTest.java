package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TweetTest {
	
	private Tweet tweet1;
	private Tweet tweet2;
	private Tweet tweet3;
	
	@BeforeEach
	void setUp() throws Exception {
		tweet1 = new Tweet("Tweet random");			
		tweet2 = new Tweet("Tweet random 2");
		tweet3 = new Tweet(tweet1);
	}
	
	
	@Test
	void testGetRetweet() {
		assertNull(tweet1.getRetweet()); 
		assertNotNull(tweet3.getRetweet());
	}
	
	@Test
	void testSetRetweet() {
		tweet2.setRetweet(tweet1);
		assert tweet2.getText().equals("Tweet random");
	}
	
	@Test
	 void testGetText() {
		assert tweet1.getText().equals("Tweet random");
		assert tweet2.getText().equals("Tweet random 2");
		assert tweet3.getText().equals("Tweet random");
	}
	@Test
	void testSetText() {
		tweet1.setText("Twitter es una mierda");
		assert tweet1.getText().equals("Twitter es una mierda"); 
	}
}
