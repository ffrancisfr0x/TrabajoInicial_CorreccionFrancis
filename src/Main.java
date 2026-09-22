import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Tareas> listaTareas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Tareas tareas = new Tareas("","",false);
        int opcion = 0;
        do {
            System.out.println("---------------------------lista de tareas---------------------------");
            System.out.println();
            System.out.println("1.Añadir tarea");
            System.out.println();
            System.out.println("2.Ver lista de tareas pendientes");
            System.out.println();
            System.out.println("3.Marcar tarea como completada");
            System.out.println();
            System.out.println("4.Eliminar tarea");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
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
                case 2 -> tareas.verLista();
                case 3 -> tareas.marcarCompletada();
                case 4 -> tareas.eliminarTarea();
            }
        } while (opcion != 5);
    }

    private static void añadirTarea() {
        System.out.println("Introduce un título:");
        String titulo = sc.nextLine();

        System.out.println("Introduce una descripción:");
        String descripcion = sc.nextLine();

        Tareas tarea = new Tareas(titulo, descripcion, false);

        listaTareas.add(tarea);

        System.out.println("Tarea añadida.");
    }

    private static void verLista() {
            for (int i = 0; i < listaTareas.size(); i++) {
                Tareas tarea = listaTareas.get(i);
                System.out.println(
                        (i + 1) + ". "
                                + tarea.getTitulo()
                                + " - "
                                + tarea.getDescripcion()
                );
            }
    }

    public void marcarCompletada() {
        verLista();

        System.out.println("¿Qué tarea quieres completar?");

        if (sc.hasNextInt()) {

            int numero = sc.nextInt();

            if (numero >= 1 && numero <= listaTareas.size()) {
                listaTareas.remove(numero - 1);
                System.out.println("Tarea completada");
            } else {
                System.out.println("Opción no válida");
            }

        } else {
            System.out.println("Opción no válida");
            sc.next();
        }
    }

    public void eliminarTarea() {
        verLista();

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