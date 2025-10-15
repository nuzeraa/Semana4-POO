/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nacho PC
 */
public class Main {
    
public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Ana López", "Gerente", 80000);
        Empleado e2 = new Empleado("Juan Pérez", "Analista");
        Empleado e3 = new Empleado("María Díaz", "Programadora");

        e2.actualizarSalario(10);     // Aumento por porcentaje
        e3.actualizarSalario(5000);   // Aumento fijo

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}