/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monsalve.santiago;

/**
 *
 * @author santi
 */
public class Sumar {    
    public float sumar(int [] _enteros, double [] _dobles){
        float suma = 0;
        
        for (int i = 0; i < _enteros.length; i++) {
            suma += (float)_enteros[i];
        }
        
        for (int i = 0; i < _dobles.length; i++) {
            suma += (float)_dobles[i];
        }
        
        return suma;
    }
}
