/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Codigos.newpackage;

/**
 *
 * @author Jeane
 */
public class MainCodigos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caballo caballo1 = new Caballo("Luz",2,"Blanco");
        caballo1.saltar();
        caballo1.comer();
        caballo1.correr();
        Conejo conejo1 = new Conejo ("Manchas",1,"Esponjoso");
        conejo1.comerzanahoria();
        conejo1.jugar();
        conejo1.saltar();
        Elefante elefante1 = new Elefante("Rafael",6,"23 kilogramos");
        elefante1.bañarse();
        elefante1.comersandia();
        elefante1.ruidoconlatrompa();
        Mono mono1 = new Mono("Jorge",3,"140 centimetros");
        mono1.comerbanana();
        mono1.jugar();
        mono1.rascarse();
        Tigre tigre1 = new Tigre("Felipe",4,"carnivoro");
        tigre1.cazar();
        tigre1.dormir();
        tigre1.rugir();
    }
    
}
