/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigos.newpackage;

/**
 *
 * @author Jeane
 */
public class Tigre {
    String nombre;
    int edad;
    String alimentacion;

    public Tigre(String nombre, int edad, String alimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimentacion = alimentacion;
    }
    public void rugir(){
        System.out.println(this.nombre+" empezo a rugir");
    }
     public void cazar(){
        System.out.println(this.nombre+" empezo a cazar");
    }
      public void dormir(){
        System.out.println(this.nombre+" empezo a dormir");
    }
} 
