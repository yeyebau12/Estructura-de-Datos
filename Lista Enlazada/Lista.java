public class Lista {

    private Nodo cabeza = null;
    private int longitud = 0;

    public void insertarPrincipio(Libro libro) {
        Nodo nuevoNodo = new Nodo(libro);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        longitud++;
    }

    public void insertarFinal(Libro libro) {

        Nodo nuevoNodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else {
            Nodo puntero = cabeza;
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nuevoNodo;
        }
        longitud++;

    }

    public void insertarPosicion(int posicion, Libro libro) {
        // Implementar la lógica para insertar un libro en una posición específica
        // de la lista enlazada.
        Nodo nuevoNodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < posicion && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            nuevoNodo.siguiente = puntero.siguiente;
            puntero.siguiente = nuevoNodo;

        }

        longitud++;

    }

    public Libro obtener(int posicion) {
        // Implementar la lógica para obtener un libro en una posición específica
        // de la lista enlazada.
        if (cabeza == null) {
            return null;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;

            while (contador < posicion && puntero != null) {

                puntero = puntero.siguiente;
                contador++;
            }

            if (contador != posicion) {
                return null;
            } else {
                return puntero.libro;
            }

        }

    }

    public int contar() {

        return longitud;
    }

    public boolean estaVacia() {
        // Implementar la lógica para verificar si la lista enlazada está vacía.
        return cabeza == null;
    }

    public void eliminarPrincipio() {
        // Implementar la lógica para eliminar el primer libro de la lista enlazada.
        if (cabeza != null) {
            // Si la lista no está vacía, eliminamos el primer nodo.
            Nodo primero = cabeza;
            cabeza = cabeza.siguiente;
            primero.siguiente = null;
            longitud--;
        }

    }

    public void eliminarFinal() {
        // Implementar la lógica para eliminar el último libro de la lista enlazada.
        if (cabeza != null) {
            if (cabeza.siguiente == null) {
                // Si solo hay un nodo, lo eliminamos.
                cabeza = null;
                longitud--;
            }
            Nodo puntero = cabeza;
            while (puntero.siguiente.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = null;
            longitud--;

        }

    }

    public void eliminarPosicion(int posicion) {
        // Implementar la lógica para eliminar un libro en una posición específica
        // de la lista enlazada.
        if (cabeza != null) {
            if (posicion == 0) {
                Nodo primero = cabeza;
                cabeza = cabeza.siguiente;
                primero.siguiente = null;
                longitud--;
            } else if (posicion < longitud) {
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (posicion - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }

                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;

            }

        }
    }
}
