/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author HP ROLVIN
 */
public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private int Sexo;

    public Persona(){
    }

    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

  
    public String obtenerNombre(){
    
        return this.nombre;
    
    }
    
    
    public void establecerEdad(String Edad){
        this.nombre= Edad;
    }

  
    public int obtenerEdad(){
    
        return this.edad;
    
    }
    
     public void establecerSexo(String Sexo){
        this.nombre= Sexo;
    }

  
    public int obtenerSexo(){
    
        return this.Sexo;
    
    }
    
    
     public void establecerDireccion(String direccion){
        this.nombre= direccion;
    }

  
    public String obtenerDireccion(){
    
        return this.direccion;
    
    }
    
    
    public void imprimirInformacion(){
        
         System.out.println("Nombre: " + nombre);
         System.out.println("Edad: " + edad);
         System.out.println("Direccion: " + direccion);
         System.out.println("Sexo: " + Sexo);
    
    
    }
    
    
    
}

    
