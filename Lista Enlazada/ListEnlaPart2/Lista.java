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

    // Metodo para eliminar un nodo del final
    public int deleteEnd() {
        int value = end.data; // Guarda el valor del nodo a eliminar

        if (start == end) {

            start = end = null; // Si la lista queda vacía, actualiza el inicio y fin a nulo
        } else {
            Nodo temporary = start; // Crea un nodo temporal para recorrer la lista

            while (temporary.next != end) {

                temporary = temporary.next;
            }
            end = temporary; // Actualiza el fin al nodo anterior
            end.next = null; // Elimina la referencia al último nodo
        }

        return value; // Retorna el valor del nodo eliminado
    }

    // Metodo para eliminar un nodo especifico
    public int deleteNode(int value) {

        if (!isEmpty()) {
            if (start == end && value == start.data) {
                start = end = null; // Si el único nodo es el que se quiere eliminar, vacía la lista

            } else if (value == start.data) {
                start = start.next; // Si el nodo a eliminar es el inicio, avanza al siguiente nodo
            } else {

                Nodo before, temporary;
                before = start; // Nodo anterior al que se va a eliminar
                temporary = start.next; // Nodo actual que se va a revisar

                while (temporary != null && temporary.data != value) {

                    before = before.next; // Avanza al siguiente nodo
                    temporary = temporary.next; // Avanza al siguiente nodo

                }
                if (temporary != null) {
                    before.next = temporary.next; // Elimina el nodo de la lista

                    if (temporary == end) {
                        end = before; // Si se eliminó el último nodo, actualiza el fin
                    }

                    return 00; // Retorna 00 si se eliminó el nodo

                } else {
                    return -1; // Retorna -1 si no se encontró el nodo a eliminar
                }

            }
        } else {
            return -2; // Retorna -2 si la lista está vacía
        }
        return 00; // Retorna 00 si eliminó el nodo
    }
}
