/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monsalve.santiago;

/**
 *
 * @author santi
 */
public class Multiplicar {
    public float multiplicar(int [] _enteros, double [] _dobles){
        float producto = 1;
        
        for (int i = 0; i < _enteros.length; i++) {
            producto *= (float)_enteros[i];
        }
        
        for (int i = 0; i < _dobles.length; i++) {
            producto *= (float)_dobles[i];
        }
        
        return producto;
    }
}

