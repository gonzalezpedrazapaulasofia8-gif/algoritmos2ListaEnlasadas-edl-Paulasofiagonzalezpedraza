package ListasEnlasadas;


public class ListaEnlazadas extends Nodo{

    private Nodo cabeza;
    private int tamanio;

    public ListaEnlazadas() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    public void insertaAlInicio(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamanio++;
    }

    public void insertaAlFinal(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) { cabeza = nuevo; tamanio++; return; }
        Nodo actual = cabeza;
        While (actual.siguiente != null;)
        actual = actual.siguiente;

        actual.siguiente = nuevo;
        tamano++;

    }

    public String eliminarAlInicio() {
        if(cabeza == null) return null;
        String dato = cabeza.dato;
        cabeza = cabeza.siguiente;
        tamanio--;
        return dato;

    }
    public boolean buscar(String dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) return true;
            actual = actual.siguiente;

            
        }
        return false;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato + " -> ");
            actual = actual.siguiente;
            
        }
        System.out.println("null");
    }
    ///
     
    public int tamanio() {
    return tamanio;
  }

 public int obtenerPorIndice(int i) {
        if (i >= 0 && i < tamanio) {
            return datos[i];
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }
    if (cabeza == null) {
        return; // lista vacía
    }

    // Caso 1: el nodo a eliminar es la cabeza
    if (cabeza.dato.equals(dato)) {
        cabeza = cabeza.siguiente;
        return;
    }

    // Caso 2: buscar el nodo en el resto de la lista
    Nodo actual = cabeza;

    while (actual.siguiente != null) {
        if (actual.siguiente.dato.equals(dato)) {
            actual.siguiente = actual.siguiente.siguiente;
            return; // solo elimina el primero que encuentra
        }
        actual = actual.siguiente;
    }

}