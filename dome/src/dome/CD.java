package dome;

public class CD {
	private String title;
	private String artist;
	private int numofTracks;
	private int palyingTimes;
	private boolean gotIt = false;
	private String comment;

	public CD(String title, String artist, int numofTracks, int palyingTimes, String comment) {
		super();
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.palyingTimes = palyingTimes;
		this.comment = comment;
	}

	public static void main(String[] args) {

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CD="+title+":" +artist);
		
	}

}
