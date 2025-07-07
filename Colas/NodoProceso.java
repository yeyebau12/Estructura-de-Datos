package Colas;

public class NodoProceso {

    private Trabajo trabajo;
    private NodoProceso siguiente;

    /**
     * Constructor de la clase NodoProceso.
     * 
     * @param trabajo El trabajo asociado a este nodo.
     */
    public NodoProceso(Trabajo trabajo) {
        this.trabajo = trabajo;
        this.siguiente = null;
    }

    public Trabajo getTrabajo() {
        return this.trabajo;
    }

    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }

    public NodoProceso getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoProceso siguiente) {
        this.siguiente = siguiente;
    }

}
