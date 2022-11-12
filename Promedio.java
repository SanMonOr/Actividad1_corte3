/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monsalve.santiago;

/**
 *
 * @author santi
 */
public class Promedio {
    public float hallarPromedio(int [] _enteros, double [] _dobles){
        float promedio = 0;
        int size;
        
        size = _enteros.length + _dobles.length;
        
        for (int i = 0; i < _enteros.length; i++) {
            promedio += (float)_enteros[i];
        }
        
        for (int i = 0; i < _dobles.length; i++) {
            promedio += (float)_dobles[i];
        }
        
        promedio /= size;
        
        return promedio;
    }
}
