package dsa;

public interface StackArrayInterface {
	public int getSize();

	public boolean isEmpty();

	public void push(Object o) throws ExceptionStackQueueFull;

	public Object pop() throws ExceptionStackQueueEmpty;

	public Object top() throws ExceptionStackQueueEmpty;

	public String toString();

	public boolean isFull();

}
