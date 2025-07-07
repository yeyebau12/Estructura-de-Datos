package PilaEstatica;

public class Pila implements IPila {

    private int[] vectorStack;
    private int top;

    public Pila(int size) {
        vectorStack = new int[size];
        top = -1; // pila vacia

    }

    // Metodo para insertar un elemento en la pila (push)
    @Override
    public void push(int data) {

        top++;
        vectorStack[top] = data;

    }

    // Metodo para eliminar un elemento de la pila (pop)
    @Override
    public int pop() {
        int outside = vectorStack[top];
        top--;
        return outside;
    }

    // Metodo para saber si la pila esta vacia
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    // metodo para saber si la pila esta llena
    @Override
    public boolean isFull() {

        return vectorStack.length - 1 == top;
    }

    // Metodo para ver el elemento en la cima de la pila (peek)
    @Override
    public int peek() {
        return vectorStack[top];
    }

    // Metodo para imprimir el tamaño de la pila
    @Override
    public int sizeStack() {
        return vectorStack.length;
    }

}
