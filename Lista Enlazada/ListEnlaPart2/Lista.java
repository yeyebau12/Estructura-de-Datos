package ListEnlaPart2;

public class Lista {

    protected Nodo start, end; // Punteros para el inicio y fin de la lista

    public Lista() {
        start = null; // Inicializa el inicio de la lista como nulo
        end = null; // Inicializa el fin de la lista como nulo
    }

    // Metodo para agregar un nodo al inicio de la lista
    public void addStart(int value) {
        start = new Nodo(value, start); // Crea un nuevo nodo y lo asigna al inicio
        if (end == null) {
            end = start; // Si la lista estaba vacía, el nuevo nodo es también el final
        }
    }

    // Metodo para saber si la lista está vacía
    public boolean isEmpty() {
        return start == null; // Retorna verdadero si el inicio es nulo
    }

    // Metodo para insertar al final de la lista
    public void addEnd(int value) {

        if (!isEmpty()) {
            end.next = new Nodo(value); // Crea un nuevo nodo al final de la lista
            end = end.next; // Actualiza el fin de la lista al nuevo nodo
        } else {
            start = end = new Nodo(value); // Si la lista está vacía, el nuevo nodo es tanto el inicio como el fin
        }
    }

    // Metodo para mostrar la lista
    public void showList() {
        Nodo aux = start; // Crea un nodo auxiliar para recorrer la lista

        while (aux != null) {
            System.out.print("[" + aux.data + "]--->");
            aux = aux.next; // Avanza al siguiente nodo
        }
    }

    // Metodo para eliminar el primer nodo de la lista
    public int deleteStart() {
        int value = start.data; // Guarda el valor del nodo a eliminar

        if (start == end) {
            start = end = null; // Si la lista queda vacía, actualiza el fin a nulo
        } else {
            start = start.next; // Avanza el inicio al siguiente nodo
        }
        System.out.println("Eliminando nodo del inicio: " + value);
        return value; // Retorna el valor del nodo eliminado
    }

}
