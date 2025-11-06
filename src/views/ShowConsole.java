package views;

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
    
}
