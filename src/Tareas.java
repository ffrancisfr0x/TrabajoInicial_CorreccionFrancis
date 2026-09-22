import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Scanner;

public class Tareas {

    private String titulo;
    private String descripcion;
    private boolean marcado;
    private Prioridad prioridad;

    public Tareas(String titulo, String descripcion, boolean marcado, Prioridad prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.marcado = marcado;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
}


