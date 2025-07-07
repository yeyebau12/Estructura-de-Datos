package PilaEstatica;

public interface IPila {

    public void push(int data);

    public int pop();

    public boolean isEmpty();

    public boolean isFull();

    public int peek();

    public int sizeStack();

}
