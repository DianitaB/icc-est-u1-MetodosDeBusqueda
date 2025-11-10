import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante : Diana Borja ");
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        ShowConsole showConsole = new ShowConsole();
        //metodosBusqueda.busquedaLineal(5);
        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };
        //Busqueda de Juan
        String name = "Juan";
        Persona resultadoPer = metodosBusqueda.searchPersonByName(personas, name);
        //Imprime la persona si encontro
        //Im prime no encontro una persona
        // con el nombre ____:
        showConsole.showPersonResult(resultadoPer,name);

        // Busqueda de edad impar y mayor a 25
        Persona resultadoPer2 = metodosBusqueda.findPersonaByAgeAndImpar(personas, 25);
        showConsole.showPersonResult(resultadoPer2, 25);

        Persona resultadPersona3 = metodosBusqueda.findPersonaByValueName(personas,498);
        boolean valorNombre = true; 
        showConsole.showPersonResult(resultadPersona3, 498, valorNombre);

    }
}
