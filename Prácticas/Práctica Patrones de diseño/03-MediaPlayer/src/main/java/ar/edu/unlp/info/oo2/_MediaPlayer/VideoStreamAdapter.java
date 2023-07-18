package ar.edu.unlp.info.oo2._MediaPlayer;

public class VideoStreamAdapter extends VideoStream{
	
	private VideoStream videoStream;
	
	public VideoStreamAdapter() {
		videoStream = new VideoStream();
	}
	public void play() {
		videoStream.reproduce();
	}
}
