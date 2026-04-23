package ListasEnlasadas;

public class Main {

    public static void main(String[] args) {
        ListaEnlazadas historial = new ListaEnlazadas();
        historial.InsertarAlFinal("fronteo");
        historial.InsertarAlFinal("gatita ganster");
        historial.InsertarAlFinal("chica baila");
        historial.InsertarAlFinal("bastardo");
        historial.InsertarAlFinal("elBiper");

        System.out.println("---------------");
        System.out.println("mostramos la lista de canciones");
        historial.mostrar();
        System.out.println("------------------");
        System.out.println("elminamos la primera reproduccion");
        historial.EliminarAlInicio();
        historial.mostrar();
        System.out.println("------------------");
        System.out.println("buscamos una cancion en especifico");
        System.out.println(historial.buscar("bastardo"));
        historial.mostrar();


    }

}