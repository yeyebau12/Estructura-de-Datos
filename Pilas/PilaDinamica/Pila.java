package PilaDinamica;

/**
 * @author Yerson Bautista
 * @version 1.0
 * @since 2023-10-01
 * 
 *        Clase que representa una pila.
 *        Esta clase es parte de un sistema de gestión de pilas dinámicas.
 */

public class Pila implements IPila {

    private NodoPila top;
    private int size;

    public Pila() {
        this.top = null;
        this.size = 0;
    }

    // Metodo para saber si la pila esta vacia.
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    // Metodo para insertar un elemento en la pila (push).
    @Override
    public void push(int data) {
        NodoPila newNodo = new NodoPila(data);
        newNodo.setNext(top);
        top = newNodo;
        size++;
    }

    // Metodo para eliminar un elemento de la pila (pop).
    @Override
    public int pop() {
        int aux = top.getData();
        top = top.getNext();
        size--;
        return aux;
    }

    // Metodo para obtener el elemento en la parte superior de la pila (peek).
    @Override
    public int peek() {
        return top.getData();
    }

    // Metodo para obtener el tamaño de la pila.
    @Override
    public int getSize() {
        return size;
    }

    // Metodo para limpiar la pila (eliminar todos los elementos).
    @Override
    public void clear() {
        while (!isEmpty()) {
            pop();
        }
    }
}
