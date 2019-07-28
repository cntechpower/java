package notebook;

import java.util.ArrayList;
import java.util.HashSet;

class Value {
	private int i;

	public void set(int i) {
		this.i = i;
	}

	public int get() {
		return this.i;
	}

	public String toString() {
		return "" + i;
	}
}

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>(); // 泛型类,容器类型.

	public void add(String s) {
		notes.add(s);

	}

	public void addIndex(int index, String s) {
		notes.add(index, s);
	}

	public int getSize() {
		return notes.size();
	}

	public String getNote(int index) {
		return notes.get(index);
	}

	public boolean removeNote(int index) {
		return notes.remove(index) != null;
	}

	public boolean clearAll() {
		return notes.removeAll(notes);
	}

	public String[] listNote() {
		String[] a = new String[notes.size()];
		notes.toArray(a);
		return a;
	}

	public String toString() {
		String s = "[";
		for (int i = 0; i < notes.size(); i++) {
			if (i == notes.size() - 1) {
				s = s + notes.get(i) + "]";
			} else {
				s = s + notes.get(i) + ", ";
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.addIndex(1, "test");
		System.out.println(nb);
		nb.removeNote(1);
		nb.clearAll();

		System.out.println("----------------------");
		ArrayList<String> a = new ArrayList<String>();
		HashSet<String> b = new HashSet<String>();
		a.add("first");
		a.add("Second");
		a.add("first");
		System.out.println(a);
		b.add("first");
		b.add("Second");
		b.add("first");
		System.out.println(b);
		System.out.println("----------------------");
		Value v = new Value();
		System.out.println(v);

	}

}
