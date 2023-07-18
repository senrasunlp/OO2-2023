package ar.edu.unlp.info.oo2.ejercicio_1;

public class Tweet {
	private Tweet retweet;
	private String text;
	
	public Tweet (String s) {
		this.text = s;
	}
	
	public Tweet(Tweet retweet) {
		this.retweet = retweet;
	}

	public Tweet getRetweet() {
		return retweet;
	}

	public void setRetweet(Tweet retweet) {
		this.retweet = retweet;
	}

	public String getText() {
		if (this.retweet != null) {
			return this.retweet.getText();					
		}
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
