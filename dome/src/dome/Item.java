package dome;

public class Item {
	private String title;
	private int palyingTimes;
	private boolean gotIt = false;
	private String comment;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public Item(String title, int palyingTimes, String comment) {
		super();
		this.title = title;
		this.palyingTimes = palyingTimes;
		this.comment = comment;
	}


	public Item() {
		
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title);
		
	}

}
