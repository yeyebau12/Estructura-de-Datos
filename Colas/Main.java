package Colas;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MiColaProceso cola = new MiColaProceso();

        // Crear algunos trabajos
        Trabajo trabajo1 = new Trabajo("Jhosua", "Principito");
        Trabajo trabajo2 = new Trabajo("Maria", "Cien años de soledad");
        Trabajo trabajo3 = new Trabajo("Carlos", "El Quijote");

        // Encolar trabajos
        cola.enncolar(trabajo1);
        cola.enncolar(trabajo2);
        cola.enncolar(trabajo3);

        // Obtener toda la cola
        List<Trabajo> trabajosEnCola = cola.obtenerTodaCola();
        System.out.println("Trabajos en la cola:");
        for (Trabajo trabajo : trabajosEnCola) {
            System.out.println("- " + trabajo.getTitulo() + " por " + trabajo.getAutor());
        }

        // Obtener la cabeza de la cola
        Trabajo cabeza = cola.obtenerCabeza();
        if (cabeza != null) {
            System.out.println("Cabeza de la cola: " + cabeza.getTitulo() + " por " + cabeza.getAutor());
        }

        // Eliminar un trabajo
        cola.eliminar();

        // Obtener toda la cola
        List<Trabajo> trabajosEnCola2 = cola.obtenerTodaCola();
        System.out.println("Trabajos en la cola:");
        for (Trabajo trabajo : trabajosEnCola2) {
            System.out.println("- " + trabajo.getTitulo() + " por " + trabajo.getAutor());
        }

        // Obtener la nueva cabeza de la cola
        cabeza = cola.obtenerCabeza();
        if (cabeza != null) {
            System.out.println("Nueva cabeza de la cola: " + cabeza.getTitulo() + " por " + cabeza.getAutor());
        }

    }

}
