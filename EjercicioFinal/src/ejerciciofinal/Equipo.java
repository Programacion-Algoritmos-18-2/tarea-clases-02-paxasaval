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
public class Equipo {
    private String nombre;
    private int num_jugadores;
    private String ciudad;
    
    public String obtener_nombre(){
        return nombre;
    }
    public int obtener_num_jugadores(){
        return num_jugadores;
    }
    public String obtener_ciudad(){
        return ciudad;
    }
    public void agregar_nombre (String cadena){
        nombre=cadena;
    }
    public void agregar_num_jugadores(int x){
        num_jugadores=x;
    }
    public void agregar_ciudad(String cadena2){
        ciudad=cadena2;
    }
    public Equipo(){
        agregar_nombre("S/N");
        agregar_num_jugadores(000);
        agregar_ciudad("S/N");
    }
    public Equipo(String str1){
        agregar_nombre(str1);
    }
    public Equipo(String str2,int y){
        agregar_nombre(str2);
        agregar_num_jugadores(y);
    }
    public Equipo(String str3, int z, String str4 ){
        agregar_nombre(str3);
        agregar_num_jugadores(z);
        agregar_ciudad(str4);
    }
    
    
}
