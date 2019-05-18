/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yo
 */
public class Perros {
    
            int edad;
            String nombre;
            String raza;
            String vacunado;
            
            Perros(){
            }
            
            Perros(int edad, String nombre, String raza, String vacunado){
                this.edad = edad;
                this.nombre = nombre;
                this.raza = raza;
                this.vacunado = vacunado;          
                
            }
            
                
     String fichaPerro(){
        String ficha = ("La ficha del perro es \n"
                + " edad: " + edad +  
                "\n nombre:  " + nombre + 
                "\n ¿está vacunado?  " + vacunado );
           
        System.out.println(ficha);
        return ficha;
                
    }

            
    
}
