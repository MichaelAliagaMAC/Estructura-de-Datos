public class NodoServicio {
    Servicio servicio;
    NodoServicio siguiente;

    public NodoServicio(Servicio servicio) {
        this.servicio = servicio;
        this.siguiente = null;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public NodoServicio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoServicio siguiente) {
        this.siguiente = siguiente;
    }
}
