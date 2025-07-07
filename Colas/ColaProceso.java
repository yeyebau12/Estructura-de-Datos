package Colas;

import java.util.List;

public interface ColaProceso {

    public void enncolar(Trabajo trabajo);

    public void eliminar();

    public Trabajo obtenerCabeza();

    public List<Trabajo> obtenerTodaCola();
}
