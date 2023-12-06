/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigos.newpackage;

/**
 *
 * @author Jeane
 */
public class Caballo {
    String nombre;
    int edad;
    String color;

    public Caballo(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    public void correr(){
        System.out.println(this.nombre+" empezo a correr");
    }
     public void saltar(){
        System.out.println(this.nombre+" empezo a saltar");
    }
      public void comer(){
        System.out.println(this.nombre+" empezo a comer");
    }
} 
