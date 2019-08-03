package dome;

import java.util.ArrayList;

public class Database {
	private ArrayList<Item> listItem = new ArrayList<Item>();

	public void add(Item item) {
		listItem.add(item);
	}

	public void list() {
		for (Item item : listItem) {
			item.print();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("CD1", "dujinyang", 10, 10, "comment"));
		db.add(new CD("CD2", "dujinyang", 10, 10, "comment"));
		db.add(new DVD("DVD1", "dujinyang", 11, "comment"));
		db.list();

	}

}
