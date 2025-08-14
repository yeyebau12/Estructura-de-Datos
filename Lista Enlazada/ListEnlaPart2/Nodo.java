package ListEnlaPart2;

/**
 * @author Yerson Bautista
 * @version 1.0
 */
public class Nodo {

    public int data;
    public Nodo next; // Puntero enlace al siguiente nodo

    // constructor para insertar al final de la lista
    public Nodo(int data) {
        this.data = data;

    }

    // Constructor para insertar al inicio de la lista
    public Nodo(int data, Nodo node) {
        this.data = data;
        this.next = node; // Inicializa el siguiente nodo
    }

}
