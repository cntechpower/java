package notebook;

import java.util.HashMap;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();

	public Coin() {
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half");
		coinnames.put(50, "五毛");
		for(Integer k: coinnames.keySet()) {
			String s=coinnames.get(k);
			System.out.println(k+":"+s);
		}
	}

	public String getName(int amount) {
		if (coinnames.containsKey(amount)) {
			return coinnames.get(amount);
		} else {
			return "Not Found";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin c=new Coin();
		System.out.println(c.getName(50));

	}

}
