package SistemaGestionTareas;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Tarea> listaTareas;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.listaTareas = new ArrayList<>();
    }

    // Método para añadir tarea
    public void añadirTarea(Tarea tarea) {
        listaTareas.add(tarea);
        System.out.println("Tarea " + tarea.getNombre() + " añadida a " + nombre);
    }

    // Método para ver todas las tareas
    public void verTareas() {
        System.out.println("Tareas de " + nombre + ":");
        for (Tarea tarea : listaTareas) {
            tarea.mostrarDetalles();
            System.out.println("-------------");
        }
    }

    // Método para marcar una tarea como completada
    public void completarTarea(String nombreTarea) {
        for (Tarea tarea : listaTareas) {
            if (tarea.getNombre().equalsIgnoreCase(nombreTarea)) {
                tarea.marcarCompletada();
                return;
            }
        }
        System.out.println("No se encontró una tarea con el nombre: " + nombreTarea);
    }

    // Método para eliminar una tarea específica
    public void eliminarTarea(String nombreTarea) {
        listaTareas.removeIf(tarea -> tarea.getNombre().equalsIgnoreCase(nombreTarea));
        System.out.println("Tarea " + nombreTarea + " eliminada.");
    }

    // Método para actualizar la prioridad de una tarea
    public void actualizarPrioridad(String nombreTarea, int nuevaPrioridad) {
        for (Tarea tarea : listaTareas) {
            if (tarea.getNombre().equalsIgnoreCase(nombreTarea)) {
                tarea.setPrioridad(nuevaPrioridad);
                System.out.println("Prioridad de la tarea " + nombreTarea + " actualizada a " + nuevaPrioridad);
                return;
            }
        }
        System.out.println("No se encontró una tarea con el nombre: " + nombreTarea);
    }
}