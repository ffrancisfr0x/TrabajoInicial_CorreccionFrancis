import java.util.ArrayList;
import java.util.Scanner;

public class Tareas {
    ArrayList<String> listaTareas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    private String titulo;
    private String descripcion;
    private boolean marcado;

    public Tareas(String titulo, String descripcion, boolean marcado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.marcado = marcado;
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
}


