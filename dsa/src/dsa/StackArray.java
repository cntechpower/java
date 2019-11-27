package dsa;

public class StackArray implements StackArrayInterface {
    private static final int CAPACITY = 20;
    private int capacity;
    private Object[] S;
    private int pos = 0;

    public StackArray() {
        this.capacity = CAPACITY;
        S = new Object[capacity];
    }

    private StackArray(int cap) {
        this.capacity = cap;
        S = new Object[capacity];
    }

    @Override
    public int getSize() {
        return S.length;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        if (this.pos > 0) {
            isEmpty = false;
        }
        return isEmpty;
    }

    @Override
    public boolean isFull() {
        boolean isFull = true;
        if (this.pos < this.capacity) {
            isFull = false;
        }
        return isFull;
    }

    @Override
    public void push(Object o) throws ExceptionStackQueueFull {
        if (!isFull()) {

            System.out.println("-----Pushing:" + this.pos);
            S[this.pos] = o;
            pos++;
        } else {
            throw new ExceptionStackQueueFull("Stack is Full!");

        }

    }

    @Override
    public Object pop() throws ExceptionStackQueueEmpty {
        Object first = null;
        if (!isEmpty()) {
            System.out.println("-----poping:" + (this.pos - 1));
            first = S[this.pos - 1];
            S[this.pos - 1] = null;
            this.pos--;
        } else {
            throw new ExceptionStackQueueEmpty("Stack is Empty!");
        }
        return first;
    }

    @Override
    public Object top() throws ExceptionStackQueueEmpty {
        Object first = null;
        if (!isEmpty()) {
            System.out.println("-----toping:" + (this.pos - 1));
            first = S[this.pos - 1];
        } else {
            throw new ExceptionStackQueueEmpty("Stack is Empty!");
        }
        return first;
    }

    @Override
    public String toString() {
        String returnString = "[";
        if (isEmpty()) {
            returnString = "[Empty]";
        } else {

            // for (int i = 0; i < this.capacity; i++) {
            // if (i == (this.capacity - 1)) {
            for (int i = 0; i < pos; i++) {
                if (i == (this.pos - 1)) {
                    returnString = returnString + S[i] + "]";
                } else {
                    returnString = returnString + S[i] + ",";
                }
            }
        }
        return returnString;
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(20);
        System.out.println(s.isEmpty());
        for (int i = 0; i < 20; i++) {
            s.push(i);
            System.out.println(s);
        }
        System.out.println("isEmpty: " + s.isEmpty());
        System.out.println("isFull: " + s.isFull());

        for (int i = 0; i < 20; i++) {
            s.pop();
            System.out.println(s);
        }
        System.out.println("isEmpty: " + s.isEmpty());
        System.out.println("isFull: " + s.isFull());
    }

}
