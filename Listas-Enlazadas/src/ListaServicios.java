public class ListaServicios {
    private NodoServicio cabeza;

    public ListaServicios() {
        this.cabeza = null;
    }

    public void agregarServicio(Servicio servicio) {
        NodoServicio nuevoNodo = new NodoServicio(servicio);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoServicio actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void mostrarServicios() {
        if (cabeza == null) {
            System.out.println("No hay servicios registrados.");
        } else {
            NodoServicio actual = cabeza;
            while (actual != null) {
                System.out.println(actual.getServicio());
                actual = actual.getSiguiente();
            }
        }
    }
}
