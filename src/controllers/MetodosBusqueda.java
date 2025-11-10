package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda{

    private int[] arreglo;
    private ShowConsole sConsole;

    public MetodosBusqueda() {
        this.arreglo = new int[] {10,11,-2,5,6,8,15,22};
        this.sConsole = new ShowConsole();
        sConsole.printArray(arreglo);
        //Buscar el 5
        int result1 = busquedaLineal(5);
        sConsole.printResult(result1, 5);


        //Buscar el -2
        int result2 = busquedaLinealWhile(-2);
        sConsole.printResult(result2, -2);

        //Buscar el 20
        int result3 = busquedaLinealWhile(20);
        sConsole.printResult(result3, 20);

        // Buscar el 100
        Integer result4 = busquedaLinealObj(100);
        sConsole.printResult2(result4,100);
        
        // Buscar el numero 10
        Integer result5 = busquedaLinealObj(10);
        sConsole.printResult2(result5,10);

    }

    //Retorna la posicion del valor buscado
    // Si no encontro,retorna -1
    public int busquedaLineal(int value){
        for ( int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int busquedaLinealWhile (int value){
        int contador = 0;
        while(contador < arreglo.length){
                if (arreglo[contador] == value){
                return contador; 
            }
            contador ++;
        }
        return -1;
    }

    public Integer busquedaLinealObj(int value){
        for (int i = 0; i < arreglo.length; i++) {
           if(arreglo[i] == value){
                return i;
            }
        }
        return null;
    }

    public Persona searchPersonByName (Persona [] personas, String name){
        for (Persona personas2 : personas) {
            if(personas2.getName().equals(name)){
                return personas2;
            }  
        }
        return null; 
    }
    
    // Encontrar una persona que sea mayor de: age
    // Y la edad sea impar
    public Persona findPersonaByAgeAndImpar(Persona[] personas, int age) {
    for (Persona persona : personas) {
        if (persona.getAge() > age && persona.getAge() % 2 != 0) {
            return persona;
        }
    }
    return null; 
    }

    public Persona findPersonaByValueName(Persona[] personas, int valorBuscado) {
        for (Persona persona : personas) {
            int valorAsciiTotal = 0;
            String nombre = persona.getName();

            for (int i = 0; i < nombre.length(); i++) {
                valorAsciiTotal += (int) nombre.charAt(i);
            }
            
            if (valorAsciiTotal == valorBuscado) {
                return persona;
            }
        }
        return null;
    }

}