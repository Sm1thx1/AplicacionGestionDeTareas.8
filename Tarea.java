package SistemaGestionTareas;

public class Tarea {
    private String nombre;
    private String descripcion;
    private int prioridad; // 1 = alta, 2 = media, 3 = baja
    private boolean completada;

    // Constructor
    public Tarea(String nombre, String descripcion, int prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        setPrioridad(prioridad);
        this.completada = false; // Por defecto, la tarea no está completada
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        if (prioridad >= 1 && prioridad <= 3) {
            this.prioridad = prioridad;
        } else {
            System.out.println("Prioridad no válida. Debe estar entre 1 y 3.");
        }
    }

    public boolean isCompletada() {
        return completada;
    }

    // Marcar como completada
    public void marcarCompletada() {
        this.completada = true;
        System.out.println("La tarea " + nombre + " ha sido marcada como completada.");
    }

    // Mostrar detalles de la tarea
    public void mostrarDetalles() {
        System.out.println("Tarea: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Prioridad: " + (prioridad == 1 ? "Alta" : prioridad == 2 ? "Media" : "Baja"));
        System.out.println("Estado: " + (completada ? "Completada" : "Pendiente"));
    }
}