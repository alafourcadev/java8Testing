/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8testing.Domain;

/**
 *
 * @author Alejandro
 */
public class Desarrollador {
    
    private String nombre;
    private int edad;
    
    public Desarrollador(){}
    
    public Desarrollador(String nombre , int edad){
        
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
    
    
    @Override
    public String toString(){
    
        return "Desarrollador: "+ this.nombre + " -- " + " Edad: " + this.edad;
    }
}
