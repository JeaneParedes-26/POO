/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigos.newpackage;

/**
 *
 * @author Jeane
 */
public class Mono {
    String nombre;
    int edad;
    String tamaño;

    public Mono(String nombre, int edad, String tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamaño = tamaño;
    }
    public void rascarse(){
        System.out.println(this.nombre+" empezo a rascarse");
    }
     public void jugar(){
        System.out.println(this.nombre+" empezo a jugar");
    }
      public void comerbanana(){
        System.out.println(this.nombre+" empezo a comer una banana");
    }
} 
