package Colas;

import java.util.ArrayList;
import java.util.List;

public class MiColaProceso implements ColaProceso {

    private NodoProceso cabeza;
    private NodoProceso ultimo;

    @Override
    public void enncolar(Trabajo trabajo) {

        NodoProceso nuevoNodo = new NodoProceso(trabajo);

        if (cabeza == null) {

            cabeza = nuevoNodo;
            ultimo = nuevoNodo;

        } else {

            ultimo.setSiguiente(nuevoNodo);
        }

        ultimo = nuevoNodo;

    }

    @Override
    public void eliminar() {

        if (cabeza != null) {
            NodoProceso eliminar = cabeza;
            cabeza = cabeza.getSiguiente();
            eliminar.setSiguiente(null);
            if (cabeza == null) {
                ultimo = null; // Si la cola queda vacía, actualizamos último a null
            }
        }

    }

    @Override
    public Trabajo obtenerCabeza() {

        if (cabeza == null) {
            return null;
        } else {
            // Si la cola no está vacía, devolvemos el trabajo del nodo cabeza
            // y no lo eliminamos de la cola.
            return cabeza.getTrabajo();
        }

    }

    @Override
    public List<Trabajo> obtenerTodaCola() {
        List<Trabajo> trabajos = new ArrayList<>();
        NodoProceso actual = cabeza;
        while (actual != null) {
            trabajos.add(actual.getTrabajo());
            actual = actual.getSiguiente();
        }
        return trabajos;
    }

}
