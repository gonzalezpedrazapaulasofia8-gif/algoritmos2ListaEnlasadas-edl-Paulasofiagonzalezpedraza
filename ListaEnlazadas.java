package ListasEnlasadas;

public class ListaEnlazadas {

    private Nodo cabeza;
    private int tamanio;

    public ListaEnlazadas() {

        this.cabeza = null;
        this.tamanio = 0;

    }

    public void InsertarAlInicio(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamanio++;
    }

    public void InsertarAlFinal(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            tamanio++;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null)
            actual = actual.siguiente;
        actual.siguiente = nuevo;
        tamanio++;

    }

    public String EliminarAlInicio() {
        if (cabeza == null)
            return null;
        String dato = cabeza.dato;
        cabeza = cabeza.siguiente;
        tamanio--;
        return dato;

    }

    public boolean buscar(String dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato))
                return true;
            actual = actual.siguiente;
        }
        return false;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato + "->");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public int tamanio() {
        return tamanio;

    }

    // Crea obtenerPorIndice(int i) que retorte el elemento en la posicion i.
    public String obtenerPorIndice(int i) {
        if (i < 0 || i >= tamanio)
            return null;
        Nodo actual = cabeza;
        for (int j = 0; j < i; j++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    // Implementa 'eliminarPorValor(String dato)' que elimine el primer nodo que
    // contenga ese valor.
    public boolean eliminarPorValor(String dato) {
        if (cabeza == null)
            return false;
        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            tamanio--;
            return true;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(dato)) {
                actual.siguiente = actual.siguiente.siguiente;
                tamanio--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Agrega 'invertir()' que invierta el orden de la lista (sin usar estructuras
    // auxiliares).
    public void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;
        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        cabeza = anterior;
    }

    // RETO: Implementa 'detectarCiclo()' que retorne true si la lista tiene un
    // ciclo (usa el algoritmo de la tortuga y la liebre – Floyd).
    public boolean detectarCiclo() {
        Nodo tortuga = cabeza;
        Nodo liebre = cabeza;
        while (liebre != null && liebre.siguiente != null) {
            tortuga = tortuga.siguiente;
            liebre = liebre.siguiente.siguiente;
            if (tortuga == liebre)
                return true;
        }
        return false;
    }

}