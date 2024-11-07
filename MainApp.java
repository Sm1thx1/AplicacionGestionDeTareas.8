package SistemaGestionTareas;

public class MainApp {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("Carlos");

        // Crear algunas tareas
        Tarea tarea1 = new Tarea("Estudiar Java", "Revisar temas de programación orientada a objetos", 1);
        Tarea tarea2 = new Tarea("Comprar víveres", "Hacer lista y comprar alimentos", 3);
        Tarea tarea3 = new Tarea("Ejercicio físico", "Correr 5 km", 2);

        // Asignar tareas al usuario
        usuario.añadirTarea(tarea1);
        usuario.añadirTarea(tarea2);
        usuario.añadirTarea(tarea3);

        // Ver todas las tareas
        usuario.verTareas();

        // Completar una tarea
        usuario.completarTarea("Estudiar Java");

        // Eliminar una tarea
        usuario.eliminarTarea("Comprar víveres");

        // Actualizar la prioridad de una tarea
        usuario.actualizarPrioridad("Ejercicio físico", 1);

        // Ver tareas actualizadas
        usuario.verTareas();
    }
}