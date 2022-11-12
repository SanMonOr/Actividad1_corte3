/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package monsalve.santiago;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Actividad {

    public static void main(String[] args) {
        boolean continuar = true;
        int enteros[] = new int[2];
        double dobles[] = new double[3];
        
        Scanner escaner = new Scanner(System.in);
         
        System.out.println("¡Bienvenido!\nA continuación ud. deberá ingresar 5 números (2 enteros y 3 decimales)\n");
        
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Ingrese el entero " + (i + 1) + ": ");
            enteros[i] = escaner.nextInt();
        }
        
        for (int i = 0; i < dobles.length; i++) {
            System.out.println("Ingrese el decimal " + (i + 1) + " (escriba el punto decimal como una coma): ");
            dobles[i] = escaner.nextDouble();
        }
        
        while (continuar)
        {
            int op;
            System.out.println("""
                             ¿Qué desea realizar?
                             1. Sumar
                             2. Multiplicar
                             3. Calcular promedio
                             4. Salir
                             : """);

            op = escaner.nextInt();

            switch (op){
                case 1:
                    Sumar sumador = new Sumar();
                    float suma = sumador.sumar(enteros, dobles);
                    
                    System.out.println("Suma: " + suma + "\n");
                    break;
                case 2:
                    Multiplicar multiplicador = new Multiplicar();
                    float producto = multiplicador.multiplicar(enteros, dobles);
                    
                    System.out.println("Producto: " + producto + "\n");
                    break;
                case 3:
                    Promedio promedior = new Promedio();
                    
                    float promedio = promedior.hallarPromedio(enteros, dobles);
                    
                    System.out.println("Promedio: " + promedio + "\n");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("¡Escoga una opción válida!\n");
                    break;
            }
        }        
    }
}
