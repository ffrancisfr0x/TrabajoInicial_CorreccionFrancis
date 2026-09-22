# Primer proyecto
Este es el primer proyecto.

## Aplicación de Tareas
Un pequeño gestor de tareas `To-do list`; el diseño es a elección del alumno.

#### Historias de usuario
- Añadir una tarea
- Ver lista de tareas **pendientes**
- Filtrar tareas por prioridad (**alta**, **media** o **baja**)
- Marcar una tarea como completada
- Eliminar una tarea
- Guardar la lista de tareas en un archivo de texto

## Implementación
- Java 27
- `Scanner` y `println` para la interfaz de consola
- `ArrayList` para gestionar las tareas
- `enum Prioridad` para clasificar las tareas
- Escritura en archivo `.txt` para guardar las tareas

## Uso
Al iniciar el programa se mostrará un menú con las siguientes opciones:

1. Añadir tarea
2. Ver tareas pendientes por prioridad
3. Marcar tarea como completada
4. Eliminar tarea
5. Guardar lista de tareas
0. Salir

Al crear una tarea se solicitarán:

- Título
- Descripción
- Prioridad (alta, media o baja)

La opción **Guardar lista de tareas** genera un archivo `tareas.txt` con todas las tareas almacenadas.