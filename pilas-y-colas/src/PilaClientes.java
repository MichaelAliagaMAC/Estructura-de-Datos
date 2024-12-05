public class PilaClientes {
    private Nodo tope;

    public PilaClientes() {
        this.tope = null;
    }

    public void push(Cliente cliente) {
        Nodo nuevoNodo = new Nodo(cliente);
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
    }

    public Cliente pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        Cliente cliente = tope.getCliente();
        tope = tope.getSiguiente();
        return cliente;
    }

    public Cliente peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        return tope.getCliente();
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void verTodosLosClientes() {
        if (isEmpty()) {
            System.out.println("No hay Clientes Registrados.");
            return;
        }
        Nodo actual = tope;
        while (actual != null) {
            System.out.println(actual.getCliente());
            actual = actual.getSiguiente();
        }
    }
}
