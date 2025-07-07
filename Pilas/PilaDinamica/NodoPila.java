package PilaDinamica;

/**
 * @author Yerson Bautista
 * @version 1.0
 * @since 2023-10-01
 * 
 *        Clase que representa un nodo de una pila.
 *        Esta clase es parte de un sistema de gestión de pilas dinámicas.
 */
public class NodoPila {

    private int data;
    private NodoPila next;

    public NodoPila(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoPila getNext() {
        return next;
    }

    public void setNext(NodoPila next) {
        this.next = next;
    }

}
