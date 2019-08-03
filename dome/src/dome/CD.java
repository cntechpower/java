package dome;

public class CD extends Item {
	private String artist;
	private int numofTracks;

	public CD(String title, String artist, int numofTracks, int palyingTimes, String comment) {
		super(title,palyingTimes,comment); //将title传递给父类,先做父类初始化,再做自己的初始化
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

	public static void main(String[] args) {

	}

//	public void print() {
//		// TODO Auto-generated method stub
//		System.out.println("CD=" + title + ":" + artist);
//
//	}

}
