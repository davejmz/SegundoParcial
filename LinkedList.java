public class LinkedList {
    private Node inicio;

    public LinkedList() {
        inicio = null;
    }

    public void agregarAlFinal(int valor) {
        Node nuevoNodo = new Node(valor);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Node actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void agregarAlInicio(int valor) {
        Node nuevoNodo = new Node(valor);
        nuevoNodo.siguiente = inicio;
        inicio = nuevoNodo;
    }

    public void agregarEnPosicion(int valor, int posicion) {
        if (posicion == 0) {
            agregarAlInicio(valor);
            return;
        }

        Node nuevoNodo = new Node(valor);
        Node actual = inicio;
        int contador = 0;
        while (contador < posicion - 1 && actual != null) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual == null) {
            System.out.println("Posición fuera de rango.");
            return;
        }

        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
    }

    public void eliminarPorValor(int valor) {
        if (inicio == null) return;

        if (inicio.valor == valor) {
            inicio = inicio.siguiente;
            return;
        }

        Node actual = inicio;
        while (actual.siguiente != null && actual.siguiente.valor != valor) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) return;

        actual.siguiente = actual.siguiente.siguiente;
    }

    public void mostrarLista() {
        Node actual = inicio;
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void invertirLista() {
        Node previo = null;
        Node actual = inicio;
        Node siguiente = null;
        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = previo;
            previo = actual;
            actual = siguiente;
        }
        inicio = previo;
    }

    public boolean contieneValor(int valor) {
        Node actual = inicio;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
}