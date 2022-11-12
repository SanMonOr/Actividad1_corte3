# Actividad1_corte3
El presente es el repositorio de la actividad 1 del corte 3 (Evaluación competencias teórico - prácticas) - Java

Documentación

1. Explique con sus propias palabras el codigo desarrollado (utilice lenguaje técnico y coherente).
  - Desarrollé una aplicación stand-alone que permite realizar una serie de operaciónes             matemáticas sobre una serie de números. Esto se implementó en el lenguaje de programación       Java   y donde cada "operación" es una clase, con su respectivo método el cual recibe dicha     serie de   números como parámetros, los opera dependiendo el caso y posteriormente retorna       el resultado. 
 
3. ¿Qué hace cada método? Y dónde y cómo utiliza la programación orientada a objetos.
  - Método "main": 
      - Método principal de la clase Actividad en donde inicia propiamente el programa. 
      - Declara los atributos (2 arreglos, uno de enteros y otro de dobles) y los inicializa a           discreción del usuario. 
      - Genera un menú con opciones (operaciones a realizar con la serie de números).
      - Dependiendo el caso, declara un objeto de la clase encargada de realizar la operación           seleccionada, llama el método encargado de realizar propiamente la operación y guarda el         resultado retornado por la misma para posteriormente mostrarlo en pantalla.
      - Finaliza una vez el usuario selecciona la opción de Salir (finaliza el ciclo while).
  - Método "sumar":
      - Método de la clase Sumar encargado de sumar una serie de números por medio de unos               ciclos for.
      - Almacena el resultado que retornará en una variable de tipo float.
      - Puesto que los números son de un tipo de dato diferente, antes de la asignación se               realiza un "casteo" de dicho valor al de tipo float.
  - Método "multiplicar":
      - Método de la clase Multiplicar encargado de multiplicar una serie de números por medio de unos ciclos for.
  - Método "hallarPromedio":
      - Método de la clase Promedio encargado de hallar el promedio de una serie de números por medio de unos ciclos for.  
