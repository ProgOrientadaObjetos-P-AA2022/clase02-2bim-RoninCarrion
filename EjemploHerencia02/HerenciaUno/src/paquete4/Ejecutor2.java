/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author ronni
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        String nombre = "Ronin";
        String apellido = "Carrión";
        String id = "1104572076";
        int edad = 18;
        EstudiantePresencial p = new EstudiantePresencial
        (nombre, apellido, id, edad);
        p.establecerNumeroCreditos(20);
        p.establecerCostoCredito(100);
        p.calcularMatriculaPresencial();
        
        System.out.println(p);

    }
}
