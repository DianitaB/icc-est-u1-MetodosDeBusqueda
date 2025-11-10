package views;

import models.Persona;

public class ShowConsole {

    public ShowConsole(){}

    public void printArray(int[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }
        System.out.println();
    }

    public void printResult(int result1 , int value) {
        if(result1  == -1 ){
            System.out.println("No se encontro el numero {" + value + "} en ninguna posición:(");
        } else  {
            System.out.println("El numero {" + value + "}" +  " se encontro en la posicion : " + result1) ;

        }
    }
    public void printResult2(Integer result, int value) {
        if (result == null) {
            System.out.println("Error -> No se encontró el número " + value);
        } else {
            System.out.println("El número {" + value + "} se encontró en la posición: " + result);
        }
    }

    public void showPersonResult (Persona persona, String name){
        //if(persona == null){
          //  System.out.println("No se encontro la Persona con el nombre: " + name);
        //} else{
          //  System.out.println("Se encontro a la persona: " + name);
        //}
        System.out.println(persona != null ? "Se encontro a " + persona 
        : "No se encontro a una persona con el nommbre: " + name);
    }

    public void showPersonResult (Persona persona2, int age){
        System.out.println(persona2 != null ? "Se encontro a " + persona2 
        : "No se encontro a la persona con edad : " + age );
    }

    public void showPersonResult(Persona persona, int i, boolean valorNombre){
          System.out.println(persona != null ? "Se encontro a " + persona 
        : "No se encontro a la persona con edad : " + i );
       
    }

}
