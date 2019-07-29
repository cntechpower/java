package dsa;

public interface QueueArrayInterface {
	public void enqueue(Object o) throws ExceptionStackQueueFull;

	public Object dequeue() throws ExceptionStackQueueEmpty;

	public int getSize();

	public boolean isEmpty();

	public Object front() throws ExceptionStackQueueEmpty;

	public boolean isFull();

	public String toString();

}
