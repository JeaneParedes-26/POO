/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigos.newpackage;

/**
 *
 * @author Jeane
 */
public class Elefante {
    String nombre;
    int edad;
    String peso;

    public Elefante(String nombre, int edad, String peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    public void ruidoconlatrompa(){
        System.out.println(this.nombre+" empezo a hacer ruido con su trompa");
    }
     public void bañarse(){
        System.out.println(this.nombre+" empezo a bañarse");
    }
      public void comersandia(){
        System.out.println(this.nombre+" empezo a comer sandia");
    }
} 