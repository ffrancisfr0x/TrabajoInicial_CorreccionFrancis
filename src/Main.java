import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Tareas> listaTareas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println();
            System.out.println("---------------------------lista de tareas---------------------------");
            System.out.println();
            System.out.println("1.Añadir tarea");
            System.out.println();
            System.out.println("2.Ver lista de tareas pendientes");
            System.out.println();
            System.out.println("3.Marcar tarea como completada");
            System.out.println();
            System.out.println("4.Eliminar tarea");
            System.out.println();
            System.out.println("5.Salir");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Opcion no valida");
                sc.next();
                continue;
            }
            if (opcion > 5 || opcion < 1) {
                System.out.println("Opcion no valida");
            } else {
                switch (opcion) {
                }
            }
            switch (opcion) {
                case 1 -> añadirTarea();
                case 2 -> verLista();
                case 3 -> marcarCompletada();
                case 4 -> eliminarTarea();
            }
        } while (opcion != 5);
    }

    private static void añadirTarea() {
        System.out.println("Introduce un título:");
        String titulo = sc.nextLine();

        System.out.println("Introduce una descripción:");
        String descripcion = sc.nextLine();

        System.out.println("Introduce el tipo de prioridad (alta, media o baja): ");
        String prioridad = sc.nextLine();

        if (prioridad.equalsIgnoreCase("baja")){
            Tareas tarea = new Tareas(titulo, descripcion, false, Prioridad.BAJA);
            listaTareas.add(tarea);
            System.out.println("Tarea añadida.");

        } else if (prioridad.equalsIgnoreCase("media")){
            Tareas tarea = new Tareas(titulo, descripcion, false, Prioridad.MEDIA);
            listaTareas.add(tarea);
            System.out.println("Tarea añadida.");

        } else if (prioridad.equalsIgnoreCase("alta")){
            Tareas tarea = new Tareas(titulo, descripcion, false, Prioridad.ALTA);
            listaTareas.add(tarea);
            System.out.println("Tarea añadida.");

        } else {
            System.out.println("Prioridad no válida");
            System.out.println("Cancelando...");
        }

    }

    private static void verLista() {

        System.out.println("¿Qué prioridad quieres ver? (alta, media o baja)");
        String prioridad = sc.nextLine();

        Prioridad prioridadBuscada;

        if (prioridad.equalsIgnoreCase("alta")) {
            prioridadBuscada = Prioridad.ALTA;
        } else if (prioridad.equalsIgnoreCase("media")) {
            prioridadBuscada = Prioridad.MEDIA;
        } else if (prioridad.equalsIgnoreCase("baja")) {
            prioridadBuscada = Prioridad.BAJA;
        } else {
            System.out.println("Prioridad no válida");
            return;
        }

        for (int i = 0; i < listaTareas.size(); i++) {
            Tareas tarea = listaTareas.get(i);

            if (!tarea.isMarcado() && tarea.getPrioridad() == prioridadBuscada) {
                System.out.println(
                        (i + 1) + ". "
                                + tarea.getTitulo()
                                + " - "
                                + tarea.getDescripcion()
                                + " [" + tarea.getPrioridad() + "]"
                );
            }
        }
    }

    private static void marcarCompletada() {

        System.out.println("¿Qué tarea quieres completar?");

        if(sc.hasNextInt()) {

            int numero = sc.nextInt();

            if(numero >= 1 && numero <= listaTareas.size()) {
                listaTareas.get(numero - 1).setMarcado(true);
                System.out.println("Tarea completada");

            } else {
                System.out.println("Opción no válida");
            }

        } else {
            System.out.println("Opción no válida");
            sc.next();
        }
    }

    private static void eliminarTarea() {

        System.out.println("¿Qué tarea quieres eliminar?");

        if (sc.hasNextInt()) {

            int numero = sc.nextInt();

            if (numero >= 1 && numero <= listaTareas.size()) {
                listaTareas.remove(numero - 1);
                System.out.println("Tarea eliminada");
            } else {
                System.out.println("Opción no válida");
            }

        } else {
            System.out.println("Opción no válida");
            sc.next();
        }
    }
}