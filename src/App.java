import controllers.MetodosBusqueda;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante : Diana Borja ");
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        metodosBusqueda.busquedaLineal(5);
    }
}
