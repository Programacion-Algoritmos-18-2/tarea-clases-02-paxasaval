/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author User
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo e1, e2, e3, e4;
        //Primer objeto
        e1=new Equipo();
        System.out.printf("Nombre: %s\nNumero de jugadores: %d\nCiudad: %s\n\n",e1.obtener_nombre(),e1.obtener_num_jugadores(),e1.obtener_ciudad());
        //Segundo Objeeto
        e2=new Equipo("Liga de Loja");
        e2.agregar_num_jugadores(20);
        e2.agregar_ciudad("Loja");
        System.out.printf("Nombre: %s\nNumero de jugadores: %d\nCiudad: %s\n\n",e2.obtener_nombre(),e2.obtener_num_jugadores(),e2.obtener_ciudad());
        //Tercer Objeto
        e3=new Equipo("Liga de Quito",21);
        e3.agregar_ciudad("Quito");
        System.out.printf("Nombre: %s\nNumero de jugadores: %d\nCiudad: %s\n\n",e3.obtener_nombre(),e3.obtener_num_jugadores(),e3.obtener_ciudad());
        //Cuarto Objeto
        e4=new Equipo("Emelec",19,"Guayaquil");
        System.out.printf("Nombre: %s\nNumero de jugadores: %d\nCiudad: %s\n\n",e4.obtener_nombre(),e4.obtener_num_jugadores(),e4.obtener_ciudad());
    }
    
}
