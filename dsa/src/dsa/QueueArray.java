package dsa;

public class QueueArray implements QueueArrayInterface {

	private int CAP = 20;
	private Object[] s;
	private int startPos = 0;
	private int endPos = 0;

	public QueueArray() {
		s = new Object[CAP];
	}

	public QueueArray(int cap) {
		this.CAP = cap;
		s = new Object[CAP];
	}

	@Override
	public void enqueue(Object o) throws ExceptionStackQueueFull {
//		if(isFull()!=true) {
//			s[this.pos]=o;
//			pos++;
		if(isFull()!=true) {
			s[endPos]=o;
			endPos++;
		}else {
			throw new ExceptionStackQueueFull("Array is Full");
		}

	}

	@Override
	public Object dequeue() throws ExceptionStackQueueEmpty {
		Object o=null;
//		if(isEmpty()!=true) {
//			o=s[0];
//			s[0]=null;
//			this.pos--;
//		}else {
		if(isEmpty()!=true) {
			o=s[startPos];
			startPos++;
		}else {
			throw new ExceptionStackQueueEmpty("Array is Empty");
		}
		return o;
}


	@Override
	public int getSize() {
		return endPos-startPos;
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty = true;
		if (startPos < endPos) {
			isEmpty = false;
		}
		return isEmpty;
	}

	@Override
	public boolean isFull() {
		boolean isFull = true;
		if (startPos < this.CAP && endPos < this.CAP) {
			isFull = false;
		}
		return isFull;
	}

	@Override
	public Object front() {
		Object o = null;
		if (isEmpty() != true) {
			o = s[1];
		} else {
			throw new ExceptionStackQueueEmpty("Array is Empty");
		}
		return o;
	}

	@Override
	public String toString() {
		String returnString = "[";
		if (isEmpty() != true) {
			for (int i = startPos; i < this.endPos; i++) {
				if (i == (this.endPos - 1)) {
					returnString = returnString + s[i] + "]";
				} else {
					returnString = returnString + s[i] + ",";
				}
			}
		} else {
			returnString = "[Empty]";
		}
		return returnString;
	}

	public static void main(String[] args) {
		QueueArray a = new QueueArray();
		for (int i = 0; i < 20; i++) {
			a.enqueue(i);
			System.out.println(a);
		}
		for (int i = 0; i < 20; i++) {
			a.dequeue();
			System.out.println(a);
		}

	}

}
