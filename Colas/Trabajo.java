package Colas;

public class Trabajo {

    private String autor;
    private String titulo;
    private boolean impreso;

    public Trabajo(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        this.impreso = false;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isImpreso() {
        return this.impreso;
    }

    public boolean getImpreso() {
        return this.impreso;
    }

    public void setImpreso(boolean impreso) {
        this.impreso = impreso;
    }

}
