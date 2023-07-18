package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private ArrayList<Tweet> tweets;
	
	public Usuario(String n) {
		this.screenName = n;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public ArrayList<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(ArrayList<Tweet> tweets) {
		this.tweets = tweets;
	}
	
	public Tweet createTweet(String s) {
		Tweet tweet = new Tweet(s);
		if ((tweet.getText().length() >= 1) && (tweet.getText().length() <= 280 ))  {
			this.tweets.add(tweet);
		}
		return tweet;
	}
}


