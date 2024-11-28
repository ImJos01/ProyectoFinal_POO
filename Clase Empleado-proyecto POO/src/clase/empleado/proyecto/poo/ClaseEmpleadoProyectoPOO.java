/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.empleado.proyecto.poo;

/**
 *
 * @author Aulas Heredia
 */
public class ClaseEmpleadoProyectoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // Crear instancias de Empleado
        Empleado empleado1 = new Empleado(1, "Tilin");
        Empleado empleado2 = new Empleado(2, "Ana");
        Empleado empleado3 = new Empleado(3, "David");

        // Mostrar información de cada empleado
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

           // Acceder a los métodos específicos
        System.out.println("ID del empleado 1: " + empleado1.getId());
        System.out.println("Nombre del empleado 2: " + empleado2.getNombre());
    }
}
