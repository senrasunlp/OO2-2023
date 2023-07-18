package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private Usuario user1;
	private Usuario user2;
	private Usuario user3;
	
	@BeforeEach
	void setUp() throws Exception {
		user1 = new Usuario("Juan");
		user2 = new Usuario("Lucas");
		user3 = new Usuario("Nico");
		user2.createTweet("Tweet 1");
		user2.createTweet("Tweet 2");
	}

	@Test	
	void testGetScreenName() {
		assert user1.getScreenName().equals("Juan");
	}
	
	@Test
	void testSetScreenName() {
		user1.setScreenName("Manuel");
		assert user1.getScreenName().equals("Manuel");
	}
	
	@Test
	void getTweets() {
		assert user1.getTweets().size() == 0;
		assert user2.getTweets().size() == 2;
	}

	@Test
	void testSetTweets() {
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		Tweet tA = new Tweet("Tweet A");
		Tweet tB = new Tweet("Tweet B");
		tweets.add(tA);
		tweets.add(tB);
		user1.setTweets(tweets);
		assert user1.getTweets().size() == 2;
	}
	
	@Test
	void testCreateTweet() {
		user3.createTweet("un tweet");
		assert user3.getTweets().size() == 1;
	}

}
