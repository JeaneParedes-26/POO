/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigos.newpackage;

/**
 *
 * @author Jeane
 */
public class Conejo {
    String nombre;
    int edad;
    String pelaje;

    public Conejo(String nombre, int edad, String pelaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.pelaje = pelaje;
    }
    public void comerzanahoria(){
        System.out.println(this.nombre+" empezo a comer zanahoria");
    }
     public void saltar(){
        System.out.println(this.nombre+" empezo a saltar");
    }
      public void jugar(){
        System.out.println(this.nombre+" empezo a jugar");
    }
} 
